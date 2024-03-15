package org.practicatrim2

/**
 * Definición de la clase Estanteria dónde iremos guardando plantas.
 */
class Estanteria(private val numEstantes: Int, private val tamanoEstante: Int) {
    private val estantes: Array<Array<Planta?>> = Array(numEstantes) { arrayOfNulls(tamanoEstante) }
    fun agregarElemento(planta: Planta): Boolean {
        for (hueco in estantes.indices) {
            for (maceta in estantes[hueco].indices) {
                if (estantes[hueco][maceta] == null) {
                    estantes[hueco][maceta] = planta
                    return true
                }
            }
        }
        return false
    }
}