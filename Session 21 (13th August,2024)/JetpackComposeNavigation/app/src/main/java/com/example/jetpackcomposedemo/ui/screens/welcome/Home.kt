package com.example.jetpackcomposedemo.ui.screens.welcome

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.jetpackcomposedemo.Routes
import com.example.jetpackcomposedemo.ui.components.CustomButton
import com.example.jetpackcomposedemo.ui.components.CustomText
import com.example.jetpackcomposedemo.ui.theme.JetpackComposeDemoTheme

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Home(navController: NavHostController?) {
    HomeScreenContent(navController)
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
private fun HomeScreenContent(navController: NavHostController?) {
    Column(modifier = Modifier.fillMaxSize().padding(top = 30.dp)) {
        CustomButton(
            initialBackgroundColor = Color.Red,
            text = "Welcome Screen 1",
            textColor = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            navController?.navigate(Routes.WelcomeScreen1)
        }
        CustomButton(
            initialBackgroundColor = Color.Yellow,
            text = "Welcome Screen 2",
            textColor = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            navController?.navigate(Routes.WelcomeScreen2)
        }

        CustomButton(
            initialBackgroundColor = Color.Green,
            text = "Welcome Screen 3",
            textColor = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            navController?.navigate(Routes.WelcomeScreen3)
        }
        CustomButton(
            initialBackgroundColor = Color.Magenta,
            text = "Welcome Screen 4",
            textColor = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            navController?.navigate(Routes.WelcomeScreen4)
        }
    }

}
@RequiresApi(Build.VERSION_CODES.O)
@Preview
@Composable
fun PreviewHomeScreenContent()
{
    JetpackComposeDemoTheme {
        HomeScreenContent(null)
    }
}


