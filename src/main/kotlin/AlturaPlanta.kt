package org.practicatrim2

/**
 * Clase enumerada con las distintas alturas que pueden alcanzar nuestras plantas.
 */
enum class AlturaPlanta {
    ARBOL, ARBUSTO, PLANTA, HIERBA;

    // Formateamos la salida para que visualmente esté mas acorde con el resto del texto a mostrar.
    private fun capitalizarLetra(): String {
        return this.name.lowercase().replaceFirstChar { it.uppercase() }
    }
}