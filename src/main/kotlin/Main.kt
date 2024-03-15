package org.practicatrim2

import java.time.LocalDate

// TEST
fun main() {
    try {
        // Crear un objeto de alguna clase que herede de Planta o Suculentas
        val suculenta = Suculentas(EspeciesSuculentas.LITHOPS,LocalDate.of(2023, 1, 1),"Lolithops",
            listOf(TipoPlanta.EXTERIOR,),3,EstadoPlanta.SANA,Crecimiento.JUVENIL,AlturaPlanta.HIERBA,LocalDate.of(2023, 1, 1),LocalDate.of(2023, 1, 1),LocalDate.of(2023, 1, 1))

        // Ejecutar las funciones definidas en RealizarCuidados
        suculenta.regar(8) // Simplemente pasamos un valor de humedad para la función regar
        suculenta.abonar()
        suculenta.transplantar()
        suculenta.podar()
    }catch (e: IllegalArgumentException){
        println (e.message)
    }


}