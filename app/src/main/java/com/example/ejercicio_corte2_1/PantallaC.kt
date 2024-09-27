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
fun PantallaC(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(text = "JavaScript")
        }

        item {
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            Text(
                text = "JavaScript es un lenguaje de programación dinámico y ligero, utilizado principalmente para el desarrollo web. Permite crear páginas interactivas y mejorar la experiencia del usuario en el navegador. Se ejecuta del lado del cliente, aunque también puede utilizarse en el servidor con tecnologías como Node.js. JavaScript es esencial para la creación de aplicaciones web modernas y es compatible con HTML y CSS."
            )
        }

        item {
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            Image(painter = painterResource(id = R.drawable.javascript), contentDescription = "Logo de JavaScript")
        }
        item {
            Spacer(modifier = Modifier.height(16.dp))
        }
        item {
            Text(text = "JavaScript")
        }
        item {
            Spacer(modifier = Modifier.height(10.dp))
        }
        item {
            Text(text = "console.log(\"Hola Mundo\");")
        }

        item {
            Spacer(modifier = Modifier.height(5.dp))
        }

        item {
            Button(onClick = { navController.navigate("PMySQL") }) {
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