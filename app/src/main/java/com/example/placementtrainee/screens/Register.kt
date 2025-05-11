package com.example.placementtrainee.screens


import android.content.Context
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.util.Patterns
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController

import coil.compose.rememberAsyncImagePainter

import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes
import com.example.placementtrainee.viewModel.AuthViewModel

val  visualTransformation = PasswordVisualTransformation()
@Composable
fun Register(navHostController:NavHostController){

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var phoneno: String by remember { mutableStateOf("") }
    var phonenoInt : Long by remember { mutableStateOf(0) }
    var address by remember { mutableStateOf("") }
    var imageUri by remember { mutableStateOf<Uri?>(null) }

    var validateName by rememberSaveable { mutableStateOf(true) }
    var validateEmail by rememberSaveable { mutableStateOf(true) }
    var validatePhoneno by rememberSaveable { mutableStateOf(true) }
    var validateAddress by rememberSaveable { mutableStateOf(true) }
    var validatePassword by rememberSaveable { mutableStateOf(true) }
    var validateImage by rememberSaveable { mutableStateOf(true) }
    var isPasswordVisible by remember {
        mutableStateOf(false)
    }

    fun Context.doLogin() {
        Toast.makeText(
            this,
            "Something went wrong, try again later!",
            Toast.LENGTH_SHORT
        ).show()
    }


    val focusManager = LocalFocusManager.current
    val authViewModel: AuthViewModel = viewModel()
    val firebaseUser by authViewModel.firebaseUser.observeAsState(null)

    val permission = if (Build.VERSION.SDK_INT >=Build.VERSION_CODES.TIRAMISU){
        android.Manifest.permission.READ_MEDIA_IMAGES
    }else android.Manifest.permission.READ_EXTERNAL_STORAGE

    val context = LocalContext.current

    val launcher = rememberLauncherForActivityResult(contract = ActivityResultContracts.GetContent()){
            uri: Uri? -> imageUri = uri
    }

    val permissionlauncher =
        rememberLauncherForActivityResult(
            contract = ActivityResultContracts.RequestPermission()){

                isGranted: Boolean ->
            if(isGranted){

            }else{

            }
        }

    LaunchedEffect(firebaseUser) {
        if(firebaseUser!=null){
            navHostController.navigate(Routes.Login.routes) {
                popUpTo(navHostController.graph.startDestinationId)
                launchSingleTop = true
            }
        }
    }





    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = "Register", style = TextStyle(
                fontWeight = FontWeight.ExtraBold,
                fontSize = 24.sp,
                textAlign = TextAlign.Start
            )
        )

        Box(modifier = Modifier.height(25.dp))

        Image(painter =if (imageUri == null) painterResource(id = R.drawable.person)
        else rememberAsyncImagePainter(model = imageUri)
            , contentDescription = "person",
            modifier= Modifier
                .size(96.dp)
                .clip(CircleShape)
                .background(Color.LightGray)
                .clickable {

                    val isGranted = ContextCompat.checkSelfPermission(
                        context, permission
                    ) == PackageManager.PERMISSION_GRANTED

                    if (isGranted) {
                        launcher.launch("image/*")
                    } else {
                        permissionlauncher.launch(permission)
                    }

                }, contentScale = ContentScale.Crop)


        Box(modifier = Modifier.height(25.dp))

        OutlinedTextField(value = name, onValueChange = { name = it }, label = {
            androidx.compose.material.Text(text = "name")
        }, keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text
        ), singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp)
        )
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
        OutlinedTextField(value = phoneno, onValueChange = { phoneno = it

            if (phoneno.isNotEmpty()){phonenoInt = phoneno.toLong()}}, label = {
            androidx.compose.material.Text(text = "phone no")
        }, keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text
        ), singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp)
        )
        OutlinedTextField(value = address, onValueChange = { address = it }, label = {
            androidx.compose.material.Text(text = "address")
        }, keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text
        ), singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp)
        )
        OutlinedTextField(value = password, onValueChange = { password = it }, label = {
            androidx.compose.material.Text(text = "password")
        },keyboardActions = KeyboardActions(onDone = {
            focusManager.clearFocus()
            context.doLogin() /*keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password*/
        } ), singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            isError = !validatePassword,
            trailingIcon = {
                IconButton(onClick = { isPasswordVisible= !isPasswordVisible }) {
                    Icon(imageVector = if(isPasswordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                        contentDescription = "Toggle password visiblitly")
                }
            },

            visualTransformation = if(isPasswordVisible) VisualTransformation.None
            else PasswordVisualTransformation()
        )

        val passwordRegex ="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#\$%^&+=]).{8,}".toRegex()

        validateName = name.isNotBlank()
        validateEmail = Patterns.EMAIL_ADDRESS.matcher(email).matches()
        validatePhoneno = Patterns.PHONE.matcher(phoneno).matches()
        validateAddress = address.isNotBlank()
        validatePassword = passwordRegex.matches(password)
        validateImage = (imageUri == null)



        Box(modifier = Modifier.height(30.dp))


        Button(onClick = {
            if(name.isEmpty()||email.isEmpty()||phoneno.isEmpty()||address.isEmpty()||password.isEmpty()){
                Toast.makeText(context,"Please fill all details", Toast.LENGTH_SHORT).show()
            }else if(validateName == false){
                Toast.makeText(context,"Please Enter name", Toast.LENGTH_SHORT).show()
            }else if(validateEmail == false){
                Toast.makeText(context,"Please Enter a valid email", Toast.LENGTH_SHORT).show()
            }else if(validatePhoneno == false){
                Toast.makeText(context,"Please Enter a valid phone no", Toast.LENGTH_SHORT).show()
            }else if(validateAddress == false){
                Toast.makeText(context,"Please Enter Address", Toast.LENGTH_SHORT).show()

            }else if(validatePassword == false){
                Toast.makeText(context,"Password should contain 1 capital lettler, 1 small letter, 1 speacial character and 1 number", Toast.LENGTH_SHORT).show()
            }else if(validateImage == true){
                Toast.makeText(context,"Please Select a profile picture", Toast.LENGTH_SHORT).show()
            }
            else{
                authViewModel.register(email, password, name, phonenoInt, address, imageUri!!,context)

            }
            navHostController.navigate(Routes.Login.routes) {
                popUpTo(navHostController.graph.startDestinationId)
                launchSingleTop = true
            }


        }, modifier = Modifier.fillMaxWidth(),
            colors =  ButtonDefaults.outlinedButtonColors(
                backgroundColor = Color(android.graphics.Color.parseColor("#637f57")))//
            , shape = RoundedCornerShape(20.dp),


            )

        {
            androidx.compose.material.Text(
                text = "Register", style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,

                    ), modifier = Modifier.padding(vertical = 6.dp),color = Color.White
            )

        }

        TextButton(
            onClick = {
                navHostController.navigate(Routes.Login.routes) {
                    popUpTo(navHostController.graph.startDestinationId)
                    launchSingleTop = true
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {

            androidx.compose.material.Text(
                text = "already register, login...",
                style = TextStyle(fontSize = 16.sp)
            )


        }

    }

}


