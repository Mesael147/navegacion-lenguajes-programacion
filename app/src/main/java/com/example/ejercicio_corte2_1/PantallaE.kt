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
    fun PantallaE(navController: NavHostController) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Text(text = "C++")
            }

            item {
                Spacer(modifier = Modifier.height(16.dp))
            }

            item {
                Text(
                    text = "C++ es un lenguaje de programación de propósito general, desarrollado por Bjarne Stroustrup en 1985 como una extensión de C. Combina la programación orientada a objetos con la programación de bajo nivel, lo que permite un control detallado del hardware y la gestión de memoria. Es utilizado en aplicaciones de alto rendimiento, como videojuegos, sistemas operativos, software de simulación y sistemas embebidos. C++ es conocido por su eficiencia, flexibilidad y amplia biblioteca estándar."
                )
            }

            item {
                Spacer(modifier = Modifier.height(16.dp))
            }

            item {
                Image(painter = painterResource(id = R.drawable.cpp), contentDescription = "Logo de C++")
            }
            item {
                Spacer(modifier = Modifier.height(16.dp))
            }
            item {
                Text(text = "Código de ejemplo de C++")
            }
            item {
                Spacer(modifier = Modifier.height(16.dp))
            }
            item {
                Text(
                    text = """
                #include <iostream>
                int main() {
                    std::cout << "Hola Mundo" << std::endl;
                    return 0;
                }
                """.trimIndent()
                )
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