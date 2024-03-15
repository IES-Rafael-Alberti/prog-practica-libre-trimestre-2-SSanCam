package org.practicatrim2

enum class Crecimiento {
    GERMINACION, JUVENIL, ADULTO;

    // Formateamos la salida para que visualmente esté mas acorde con el resto del texto a mostrar.
    private fun capitalizarLetra(): String {
        return this.name.lowercase().replaceFirstChar { it.uppercase() }
    }
}