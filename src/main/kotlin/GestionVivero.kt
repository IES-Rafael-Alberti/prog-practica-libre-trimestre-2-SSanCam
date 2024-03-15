package org.practicatrim2

interface GestionVivero {
    fun agregarPlanta(planta: Planta): Boolean
    fun eliminarPlanta(nombrePlanta: String): Boolean
}