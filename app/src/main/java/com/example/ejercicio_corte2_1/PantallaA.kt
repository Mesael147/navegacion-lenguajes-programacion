package com.example.ejercicio_corte2_1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun PantallaA(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(text = "Kotlin")
        }

        item {
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            Text(
                text = "Kotlin es un lenguaje de programación moderno desarrollado por JetBrains, diseñado para ser interoperable con Java y centrado en la productividad. Se utiliza ampliamente en el desarrollo de aplicaciones Android, ya que es conciso, seguro y soporta programación funcional y orientada a objetos. Kotlin se destaca por su sintaxis clara y su capacidad para reducir errores comunes en Java, como los null pointers."
            )
        }

        item {
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            Image(painter = painterResource(id = R.drawable.kotlin), contentDescription = "Logo de Kotlin")
        }

        item {
            Spacer(modifier = Modifier.height(16.dp))
        }
        item {
            Text(text = "codigo de ejemplo de kotlin")
        }
        item {
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            Text(text = "fun main() { " +
                    " println(\"Hola Mundo\")" +
                    "}")
        }

        item {
            Spacer(modifier = Modifier.height(10.dp))
        }

        item {
            Button(onClick = { navController.navigate("PJava") }) {
                Text(text = "Siguiente")
            }
        }

        item {
            Button(onClick = { navController.popBackStack() }) {
                Text(text = "Volver")
            }
        }
        item {
            Button(onClick = { navController.navigate("Inicio") }) {
                Text(text = "Regresar a Inicio")
            }
        }
    }
}