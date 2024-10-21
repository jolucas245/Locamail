package br.com.fiap.locamail.views.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.locamail.R
import br.com.fiap.locamail.views.login.components.BackgrounComponent
import br.com.fiap.locamail.views.login.components.DividerComponent
import br.com.fiap.locamail.views.login.components.HeaderComponent

@Composable
fun LoginView(
    navController: NavController
){

    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current
    val interactionSource = remember { MutableInteractionSource() }

    var email by rememberSaveable {
        mutableStateOf("")
    }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .clickable(
            interactionSource = interactionSource,
            indication = null
        ) {
            keyboardController?.hide()
            focusManager.clearFocus(true)
        }
    ){
        BackgrounComponent()
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HeaderComponent()
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(horizontal = 30.dp, vertical = 30.dp)
                    .fillMaxWidth()
                    .shadow(
                        elevation = 5.dp,
                        spotColor = Color.DarkGray,
                        shape = RoundedCornerShape(30.dp)
                    )
                    .background(Color.White)

            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(vertical = 10.dp)
                ) {
                    Text(text = "Login", color = Color.DarkGray, fontSize = 28.sp)
                    Spacer(modifier = Modifier.height(50.dp))
                    TextField(
                        value = email,
                        onValueChange = { email = it },
                        label = {
                            Text(text = "E-mail")
                        },
                        leadingIcon = {
                            Icon(
                                tint = Color.DarkGray,
                                painter = painterResource(id = R.drawable.outline_email_24),
                                contentDescription = null
                            )
                        },
                        colors = TextFieldDefaults.colors(
                            unfocusedLabelColor = Color.DarkGray,
                            focusedLabelColor = Color(0xffF10445),
                            unfocusedContainerColor = Color(0xffD9D9D9),
                            focusedContainerColor = Color(0xffD9D9D9),
                            focusedTextColor = Color.DarkGray,
                            unfocusedTextColor = Color.DarkGray,
                            focusedIndicatorColor = Color(0xffF10445),
                            errorIndicatorColor = Color.Transparent,
                            cursorColor = Color(0xffF10445),
                            unfocusedIndicatorColor = Color.DarkGray
                        )
                    )
                    Spacer(modifier = Modifier.height(50.dp))
                    TextField(
                        value = email,
                        onValueChange = { email = it },
                        label = {
                            Text(text = "Senha")
                        },
                        leadingIcon = {
                             Icon(
                                tint = Color.DarkGray,
                                painter = painterResource(id = R.drawable.outline_lock_24),
                                contentDescription = null
                             )
                        },
                        trailingIcon = {
                            Icon(
                                tint = Color.DarkGray,
                                imageVector = Icons.Outlined.VisibilityOff,
                                contentDescription = null,
                                modifier = Modifier.size(20.dp)
                            )
                        },
                        colors = TextFieldDefaults.colors(
                            unfocusedLabelColor = Color.DarkGray,
                            focusedLabelColor = Color(0xffF10445),
                            unfocusedContainerColor = Color(0xffD9D9D9),
                            focusedContainerColor = Color(0xffD9D9D9),
                            focusedTextColor = Color.DarkGray,
                            cursorColor = Color(0xffF10445),
                            unfocusedTextColor = Color.DarkGray,
                            focusedIndicatorColor = Color(0xffF10445),
                            errorIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.DarkGray
                        ),
                    )
                    Spacer(modifier = Modifier.height(50.dp))
                    Button(
                        onClick = {
                            navController.navigate("home"){
                                popUpTo("login"){inclusive = true}
                            }
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 35.dp),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xffF10445)
                        )
                    ) {
                        Text(text = "Entrar", color = Color.White, fontSize = 24.sp)
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    DividerComponent()
                    Row(
                        modifier = Modifier.width(100.dp).padding(vertical = 15.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Image(
                            modifier = Modifier.size(30.dp),
                            painter = painterResource(id = R.drawable.google_logo),
                            contentDescription = null
                        )
                        Image(
                            modifier = Modifier.size(30.dp),
                            painter = painterResource(id = R.drawable.outlook_logo),
                            contentDescription = null
                        )
                    }
                }
            }
        }

    }
}

