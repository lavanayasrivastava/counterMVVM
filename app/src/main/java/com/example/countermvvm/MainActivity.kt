package com.example.countermvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.countermvvm.ui.theme.CounterMVVMTheme
import androidx.lifecycle.viewmodel.compose.viewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModel: CounterViewModel = viewModel() // Correct way to get ViewModel
            CounterMVVMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CounterApp( Modifier.padding(innerPadding), viewModel)
                }
            }
        }
    }
}

@Composable
fun CounterApp(modifier: Modifier, viewModel: CounterViewModel) {
    val decor=TextStyle(fontFamily = FontFamily.Default,
        fontSize = 30.sp,
        color = Color.Black

    )
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Count: ${viewModel.countt.value}", style = decor, fontWeight = FontWeight.Bold)
        Spacer(modifier.padding(4.dp))
        Row {
            Button(onClick = { viewModel.onIncrement() }) {
                Text("Increment")
            }
            Spacer(modifier.padding(16.dp))
            Button(onClick = { viewModel.onDecrement() }) {
                Text("Decrement")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CounterAppPrev() {
    val previewViewModel : CounterViewModel = viewModel()
    CounterApp(Modifier, previewViewModel)
}
