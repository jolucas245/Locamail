package br.com.fiap.locamail.views.calander

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import java.time.LocalDate
import java.time.Month

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalendarView(navController: NavHostController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text("Calendário") })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier

                .fillMaxWidth()
                .padding(innerPadding)
                .padding(30.dp)
            ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val today = LocalDate.now()
            val daysInMonth = remember { getDaysInMonth(today.year, today.month) }

            Text(
                text = today.month.name + " " + today.year,
                style = MaterialTheme.typography.headlineMedium
            )

            Spacer(modifier = Modifier.height(10.dp))

            for (week in daysInMonth) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    for (day in week) {
                        DayBox(day)
                    }
                }
            }
        }
    }
}

@Composable
fun DayBox(day: Int) {
    Box(
        modifier = Modifier

            .size(45.dp)
            .padding(4.dp)
            .border(3.dp, color = Color.Gray, shape = RectangleShape)
            .background(Color(0XF10445)),
        contentAlignment = Alignment.Center
    ) {
        Text(text = day.toString())
    }
}

@RequiresApi(Build.VERSION_CODES.O)
fun getDaysInMonth(year: Int, month: Month): List<List<Int>> {
    val daysInMonth = mutableListOf<List<Int>>()
    val days = month.length(java.time.Year.isLeap(year.toLong()))

    var week = mutableListOf<Int>()
    for (day in 1..days) {
        week.add(day)
        if (week.size == 7) {
            daysInMonth.add(week)
            week = mutableListOf()
        }
    }
    if (week.isNotEmpty()) {
        daysInMonth.add(week)
    }
    return daysInMonth



}


@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun Preview() {
    CalendarView()
}

fun CalendarView() {
    TODO("Not yet implemented")
}
