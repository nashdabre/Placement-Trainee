package com.example.placementtrainee.screens

import android.content.Context
import android.util.Patterns
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes
import com.example.placementtrainee.viewModel.AuthViewModel

@Composable
fun Login(navController: NavHostController) {

    val visualTransformation = PasswordVisualTransformation()
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    fun Context.doLogin() {
        Toast.makeText(
            this,
            "Something went wrong, try again later!",
            Toast.LENGTH_SHORT
        ).show()
    }

    var validateEmail by rememberSaveable { mutableStateOf(true) }
    var validatePassword by rememberSaveable { mutableStateOf(true) }
    var isPasswordVisible by remember {
        mutableStateOf(false)
    }

    val focusManager = LocalFocusManager.current
    val authViewModel: AuthViewModel = viewModel()
    val firebaseUser by authViewModel.firebaseUser.observeAsState(null)
    val error by authViewModel.error.observeAsState(null)
    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White), contentAlignment = Alignment.TopCenter
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {

                Image(
                    painter = painterResource(id = R.drawable.login_image),
                    contentDescription = "login",
                    modifier = Modifier
                        .fillMaxWidth()
                        .width(100.dp)
                        .height(260.dp)
                        .padding(10.dp)
                )

            }

        }

        LaunchedEffect(firebaseUser) {
            if (firebaseUser != null) {
                navController.navigate(Routes.BottomNav.routes) {
                    popUpTo(navController.graph.startDestinationId)
                    launchSingleTop = true
                }
            }
        }



        error?.let {
            Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {

            Text(
                text = "Login",
                style = TextStyle(
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 34.sp,

                    ),
                // modifier = Modifier.height( 10.dp)
            )



            Box(modifier = Modifier.height(30.dp))
            androidx.compose.material3.OutlinedTextField(value = email,
                onValueChange = { email = it },
                label = {
                    Text(text = "email")
                },
                placeholder = { Text(text = "abc@domain.com") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Next
                ),
                shape = RoundedCornerShape(20.dp),
                keyboardActions = KeyboardActions(
                    onNext = { focusManager.moveFocus(FocusDirection.Down) }
                ),
                isError = !validateEmail,
                trailingIcon = {
                    if (email.isNotBlank()) {
                        IconButton(onClick = { email = "" }) {
                            Icon(
                                imageVector = Icons.Filled.Clear,
                                contentDescription = "Clear email"
                            )

                        }
                    }
                }
            )

            OutlinedTextField(value = password, onValueChange = { password = it }, label = {
                Text(text = "password",)
            }, keyboardActions = KeyboardActions(onDone = {
                focusManager.clearFocus()
                context.doLogin() /*keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password*/
            }), singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                isError = !validatePassword,
                trailingIcon = {
                    IconButton(onClick = { isPasswordVisible = !isPasswordVisible }) {
                        Icon(
                            imageVector = if (isPasswordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                            contentDescription = "Toggle password visiblitly"
                        )
                    }
                },

                visualTransformation = if (isPasswordVisible) VisualTransformation.None
                else PasswordVisualTransformation()
            )

            val passwordRegex = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#\$%^&+=]).{8,}".toRegex()


            validateEmail = Patterns.EMAIL_ADDRESS.matcher(email).matches()
            validatePassword = passwordRegex.matches(password)



            Box(modifier = Modifier.height(30.dp))

            Button(onClick = {
                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(context, "Please fill all details", Toast.LENGTH_SHORT).show()
                } else if (validateEmail == false) {
                    Toast.makeText(context, "Please Enter a valid email", Toast.LENGTH_SHORT).show()
                } else if (validatePassword == false) {
                    Toast.makeText(
                        context,
                        "Password should contain 1 capital lettler, 1 small letter, 1 speacial character and 1 number",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    authViewModel.login(email, password, context)

                }



            }, modifier = Modifier.fillMaxWidth(),
                colors =  ButtonDefaults.outlinedButtonColors(
                    backgroundColor = Color(android.graphics.Color.parseColor("#637f57")))//
                , shape = RoundedCornerShape(20.dp),


                )

            {
                Text(
                    text = "login", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,

                        ), modifier = Modifier.padding(vertical = 6.dp),color = Color.White
                )

            }

            TextButton(
                onClick = {
                    navController.navigate(Routes.Register.routes) {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {

                Text(
                    text = "new user? click here...",
                    style = TextStyle(fontSize = 16.sp)
                )


            }

        }
    }
}
