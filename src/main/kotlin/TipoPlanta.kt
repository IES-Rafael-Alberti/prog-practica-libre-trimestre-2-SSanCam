package org.practicatrim2

/**
 * Clase enumerada, recogemos los tipos de plantas de los que vamos a disponer.
 */
enum class TipoPlanta {
    FLORAL, INTERIOR, EXTERIOR, FRUTAL, ACUATICA, TERRESTRE, AEREA, TAPIZANTE, COLGANTE;

    // Formateamos la salida para que visualmente esté mas acorde con el resto del texto a mostrar.
    private fun capitalizarLetra(): String {
        return this.name.lowercase().replaceFirstChar { it.uppercase() }
    }
}