package br.com.fiap.locamail.views.home.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchTextFieldComponent(search: String, onValueChange: (String) -> Unit, interactionSource: MutableInteractionSource) {
    BasicTextField(
        value = search,
        singleLine = true,
        maxLines = 1,
        onValueChange = {newValue ->
            if (!newValue.contains("\n")) {
                onValueChange(newValue)
            }
        },
        modifier = Modifier.height(40.dp).fillMaxWidth().padding(horizontal = 20.dp),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.None
        ),

    ){ innerTextField ->
        TextFieldDefaults.DecorationBox(
            value = search,
            innerTextField = innerTextField,
            enabled = true,
            placeholder = {
                Text(text = "Pesquisar", color = Color.DarkGray, fontSize = 14.sp)
            },
            leadingIcon = {
                Icon(
                    tint = Color.DarkGray,
                    imageVector = Icons.Outlined.Search,
                    contentDescription = null
                )
            },
            singleLine = true,
            visualTransformation = VisualTransformation.None,
            interactionSource = interactionSource,
            colors = TextFieldDefaults.colors(
                unfocusedLabelColor = Color.DarkGray,
                focusedLabelColor = Color(0xffF10445),
                unfocusedContainerColor = Color(0xffF3F3F3),
                focusedContainerColor = Color(0xffF3F3F3),
                focusedTextColor = Color.DarkGray,
                cursorColor = Color(0xffF10445),
                unfocusedTextColor = Color.DarkGray,
                focusedIndicatorColor = Color.Transparent,
                errorIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = RoundedCornerShape(8.dp),
            contentPadding = TextFieldDefaults.contentPaddingWithoutLabel(
                top = 0.dp,
                bottom = 0.dp
            )
        )
    }
}