package org.practicatrim2
import java.time.LocalDate

/**
 * Clase genérica que representa a las suculentas.
 * @property especie Indica la especie concreta de suculenta.
 * @property fechaUltimoTransplante Indica la fecha en la que se transplantó por última vez.
 */
class Suculentas(
    especie: EspeciesSuculentas,
    fechaUltimoTransplante: LocalDate,
    nombre: String,
    tipo: List<TipoPlanta>,
    humedad: Int,
    estado: EstadoPlanta,
    estadoCrecimiento: Crecimiento,
    embergaduraFinal: AlturaPlanta,
    fechaCrecimiento: LocalDate,
    fechaUltimoRiego: LocalDate,
    fechaUltimoAbonado: LocalDate
) : Planta(
    nombre,
    tipo,
    humedad,
    estado,
    estadoCrecimiento,
    embergaduraFinal,
    fechaCrecimiento,
    fechaUltimoRiego,
    fechaUltimoAbonado
), RealizarCuidados {

    // Propiedades de clase
    private var especie: EspeciesSuculentas = especie
        set(value) {
            require(especie in EspeciesSuculentas.entries) { "Ésta especie no se encuentra registrada." }
            field = value
        }
    private var fechaUltimoTransplante: LocalDate = fechaUltimoTransplante
        set(value) {
            require(fechaUltimoTransplante <= LocalDate.now()) { "La fecha del transplante no puede ser superior a la de hoy." }
            field = value
        }

    // Metodos:
    override fun regar(humedad: Int) {
        println("$nombre está siendo regada...")
        super.humedad = 10
        // TODO ampliacion: Agregar condición, según días pasados desde el último riego, que agrege probabilidad de sobrehidratar la planta.
    }

    override fun abonar() {
        println("$nombre está siendo abonada...")
        // TODO Ampliación: implementación de probabilidad para Crecimiento/Floración de la planta.
    }

    override fun transplantar() {
        println("$nombre está siendo transplantada...")
        TODO("Not yet implemented")
    }

    override fun podar() {
        println("La planta está siendo podada...")
        TODO("Not yet implemented")
    }
}

