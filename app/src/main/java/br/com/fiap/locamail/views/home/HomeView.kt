package br.com.fiap.locamail.views.home

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AttachEmail
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.locamail.R
import br.com.fiap.locamail.views.home.components.ItemEmailComponent
import br.com.fiap.locamail.views.home.components.SearchTextFieldComponent
import br.com.fiap.locamail.views.home.components.icons.rememberFilterList
import br.com.fiap.locamail.views.home.components.icons.rememberNewTag
import br.com.fiap.locamail.views.home.components.icons.rememberRefresh
import br.com.fiap.locamail.views.home.components.icons.rememberStarTag

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(
    navController: NavController
) {

    var search by remember {
        mutableStateOf("")
    }
    val interactionSource = remember { MutableInteractionSource() }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            Color.White
        )
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SearchTextFieldComponent(
                search = search,
                onValueChange = { searchString ->
                    search = searchString
                },
                interactionSource = interactionSource
            )
            Spacer(modifier = Modifier.height(25.dp))
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(
                        RoundedCornerShape(
                            topEnd = 20.dp,
                            topStart = 20.dp
                        )
                    )
                    .background(Color(0xffF3F3F3))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .padding(top = 10.dp, bottom = 15.dp),
                    ) {
                        Text(
                            text = "Todos", color = Color(0xff343434),
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Icon(
                            imageVector = rememberRefresh(),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp),
                            tint = Color(0xff343434)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Icon(
                            imageVector = rememberFilterList(),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp),
                            tint = Color(0xff343434)
                        )
                    }
                    ItemEmailComponent(
                        image = R.drawable.perfil_email,
                        title = "Retorno sobre férias",
                        sender = "Marcos Antônio",
                        body = "Olá Hermes Trismegisto, temos um retorno sobre suas férias solicitadas",
                        time = "20:30 PM",
                        tag = { rememberNewTag() }
                    )
                    ItemEmailComponent(
                        image = R.drawable.perfil_email,
                        title = "Retorno sobre férias",
                        sender = "Marcos Antônio",
                        body = "Olá Hermes Trismegisto, temos um retorno sobre suas férias solicitadas",
                        time = "20:30 PM",
                        tag = { rememberNewTag() }
                    )
                    ItemEmailComponent(
                        image = R.drawable.perfil_email,
                        title = "Retorno sobre férias",
                        sender = "Marcos Antônio",
                        body = "Olá Hermes Trismegisto, temos um retorno sobre suas férias solicitadas",
                        time = "20:30 PM",
                        tag = { rememberStarTag() }
                    )
                    ItemEmailComponent(
                        image = R.drawable.perfil_email,
                        title = "Retorno sobre férias",
                        sender = "Marcos Antônio",
                        body = "Olá Hermes Trismegisto, temos um retorno sobre suas férias solicitadas",
                        time = "20:30 PM",
                        tag = { rememberStarTag() }
                    )
                    ItemEmailComponent(
                        image = R.drawable.perfil_email,
                        title = "Retorno sobre férias",
                        sender = "Marcos Antônio",
                        body = "Olá Hermes Trismegisto, temos um retorno sobre suas férias solicitadas",
                        time = "20:30 PM",
                        tag = { rememberNewTag() }
                    )
                    ItemEmailComponent(
                        image = R.drawable.perfil_email,
                        title = "Retorno sobre férias",
                        sender = "Marcos Antônio",
                        body = "Olá Hermes Trismegisto, temos um retorno sobre suas férias solicitadas",
                        time = "20:30 PM",
                        tag = { rememberNewTag() }
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(vertical = 10.dp)
        ) {
            Button(
                onClick = {},
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp)
                    .padding(horizontal = 35.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xffF10445)
                )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(tint = Color.White, imageVector = Icons.Outlined.AttachEmail, contentDescription = null)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Novo", color = Color.White, fontSize = 24.sp)
                }
            }
        }
    }
}

