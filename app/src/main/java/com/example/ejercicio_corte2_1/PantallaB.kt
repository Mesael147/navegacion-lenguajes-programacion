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
fun PantallaB(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(text = "Java")
        }

        item {
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            Text(
                text = "Java es un lenguaje de programación orientado a objetos, desarrollado por Sun Microsystems en 1995, ahora propiedad de Oracle. Es ampliamente utilizado en aplicaciones empresariales, desarrollo web, y Android. Su principal característica es la portabilidad, ya que el código Java puede ejecutarse en cualquier plataforma que soporte la Máquina Virtual de Java (JVM). También es conocido por su enfoque en la seguridad y la robustez."
            )
        }

        item {
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            Image(painter = painterResource(id = R.drawable.java), contentDescription = "Logo de Java")
        }

        item {
            Spacer(modifier = Modifier.height(16.dp))
        }
        item {
            Text(text = "codigo de ejemplo de java")
        }
        item {
            Spacer(modifier = Modifier.height(10.dp))
        }
        item {
            Text(text = "public class HolaMundo {\n" +
                    " public static void main(String[] args) {\n" +
                    " System.out.println(\"Hola Mundo\");\n" +
                    " }\n" +
                    "}")
        }
        item {
            Spacer(modifier = Modifier.height(5.dp))
        }

        item {
            Button(onClick = { navController.navigate("PJavaScript") }) {
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