package br.com.fiap.locamail.views.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.locamail.R

@Composable
fun ItemEmailComponent(
    image: Int,
    sender: String,
    title: String,
    body: String,
    time: String,
    tag: @Composable () -> Unit
) {
    Box(
        modifier = Modifier.padding(top = 8.dp)
    ) {
        Column {
            Row {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    modifier = Modifier.size(51.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Top
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        BasicText(
                            text = sender,
                            style = TextStyle(
                                fontSize = 16.sp,
                                color = Color.DarkGray,
                                fontWeight = FontWeight.SemiBold
                            )
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        BasicText(
                            text = time,
                            style = TextStyle(
                                fontSize = 13.sp,
                                color = Color.DarkGray,
                                fontWeight = FontWeight.Normal
                            )
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        BasicText(
                            text = title,
                            modifier = Modifier.padding(vertical = 4.dp),
                            style = TextStyle(
                                fontSize = 14.sp,
                                color = Color.DarkGray,
                                fontWeight = FontWeight.SemiBold,
                            )
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        tag()
                    }
                    BasicText(
                        text = body,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = Color.DarkGray,
                            fontWeight = FontWeight.Normal
                        )
                    )
                }
            }
            Divider(
                modifier = Modifier.padding(vertical = 15.dp),
                thickness = 1.dp,
                color = Color(0xffD4D4D4)
            )
        }
    }
}