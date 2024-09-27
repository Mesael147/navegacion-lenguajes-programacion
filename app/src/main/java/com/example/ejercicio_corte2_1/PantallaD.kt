package com.example.ejercicio_corte2_1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
fun PantallaD(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(text = "MySQL")
        }

        item {
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            Text(
                text = "MySQL es un sistema de gestión de bases de datos relacional de código abierto, desarrollado por Oracle. Es ampliamente utilizado para almacenar, organizar y acceder a grandes cantidades de datos, especialmente en aplicaciones web. MySQL utiliza el lenguaje SQL (Structured Query Language) para realizar consultas y operaciones en la base de datos. Es conocido por su eficiencia, escalabilidad y compatibilidad con muchas plataformas y lenguajes de programación."
            )
        }

        item {
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            Image(painter = painterResource(id = R.drawable.mysql), contentDescription = "Logo de MySQL")
        }
        item {
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            Text(
                text = "codigo de ejemplo de mysql"
            )
        }
        item {
            Text(
                text = "CREATE TABLE usuarios (\n" +
                        " id INT AUTO_INCREMENT PRIMARY KEY,\n" +
                        "nombre VARCHAR(100) NOT NULL,\n" +
                        "correo VARCHAR(100) NOT NULL\n" +
                        ");"
            )
        }

        item {
            Spacer(modifier = Modifier.height(5.dp))
        }

        item {
            Button(onClick = { navController.navigate("PC++") }) {
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