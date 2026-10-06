package com.example.practice3

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// ---------- BOX ----------
@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(modifier = Modifier.size(50.dp).background(Color.Cyan))
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun MyBoxScroll() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterEnd) {
        Box(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .background(Color.Cyan)
                .verticalScroll(rememberScrollState())
        ) {
            Text("esto es un ejemplo")
        }
    }
}

// ---------- COLUMN ----------
@Preview(showBackground = true)
@Composable
fun MyColumn() {
    Column {
        Text("Ejemplo 1")
        Text("Ejemplo 2")
        Text("Ejemplo 3")
        Text("Ejemplo 4")
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun MyColumnWeight() {
    Column(Modifier.fillMaxSize()) {
        Text("Ejemplo 1", modifier = Modifier.background(Color.Red).weight(1f))
        Text("Ejemplo 2", modifier = Modifier.background(Color.Black).weight(1f))
        Text("Ejemplo 3", modifier = Modifier.background(Color.Cyan).weight(1f))
        Text("Ejemplo 4", modifier = Modifier.background(Color.Blue).weight(1f))
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun MyColumnSpaceBetween() {
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        Text("Ejemplo 1", modifier = Modifier.background(Color.Red))
        Text("Ejemplo 2", modifier = Modifier.background(Color.Black))
        Text("Ejemplo 3", modifier = Modifier.background(Color.Cyan))
        Text("Ejemplo 4", modifier = Modifier.background(Color.Blue))
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun MyColumnScroll() {
    Column(Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {
        repeat(15) {
            Text(
                "Ejemplo 1",
                modifier = Modifier.background(Color.Red).fillMaxWidth().height(100.dp)
            )
        }
    }
}

// ---------- ROW ----------
@Preview(showBackground = true, widthDp = 360, heightDp = 100)
@Composable
fun MyRow() {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Text("Ejemplo 1")
        Text("Ejemplo 2")
        Text("Ejemplo 3")
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 100)
@Composable
fun MyRowWeight() {
    Row(Modifier.fillMaxWidth()) {
        Text("Ejemplo 1", Modifier.weight(1f))
        Text("Ejemplo 2", Modifier.weight(1f))
        Text("Ejemplo 3", Modifier.weight(1f))
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 100)
@Composable
fun MyRowScroll() {
    Row(Modifier.fillMaxWidth().horizontalScroll(rememberScrollState())) {
        repeat(6) {
            Text("Ejemplo ${it % 3 + 1}", modifier = Modifier.width(100.dp).background(Color.Cyan))
        }
    }
}

// ---------- COMBINANDO LAYOUTS ----------
@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun MyComplexLayout() {
    Column(Modifier.fillMaxSize()) {
        Box(Modifier.fillMaxWidth().weight(1f).background(Color.Cyan))
        Row(Modifier.fillMaxWidth().weight(1f)) {
            Box(Modifier.weight(1f).fillMaxHeight().background(Color.Yellow))
            Box(Modifier.weight(1f).fillMaxHeight().background(Color.Green))
        }
        Box(Modifier.fillMaxWidth().weight(1f).background(Color.Magenta))
    }
}

// ---------- ACTIVIDAD 1 ----------
@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun Actividad1() {
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier.fillMaxWidth().weight(1f).background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) { Text("Ejemplo 1") }
        Row(Modifier.fillMaxWidth().weight(1f)) {
            Box(
                Modifier.weight(1f).fillMaxHeight().background(Color.Red),
                contentAlignment = Alignment.Center
            ) { Text("Ejemplo 2") }
            Box(
                Modifier.weight(1f).fillMaxHeight().background(Color.Green),
                contentAlignment = Alignment.Center
            ) { Text("Ejemplo 3") }
        }
        Box(
            Modifier.fillMaxWidth().weight(1f).background(Color.Magenta),
            contentAlignment = Alignment.BottomCenter
        ) { Text("Ejemplo 4") }
    }
}