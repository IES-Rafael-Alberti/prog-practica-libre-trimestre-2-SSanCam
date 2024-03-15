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
    tipo: TipoPlanta,
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
    private var especie: EspeciesSuculentas = EspeciesSuculentas.entries.random()
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
        this.humedad = 10
        this.fechaUltimoRiego = LocalDate.now()
        // TODO ampliacion: Agregar condición, según días pasados desde el último riego, que agrege probabilidad de sobrehidratar la planta.
    }

    override fun abonar() {
        println("${this.nombre} está siendo abonada...")
        this.fechaUltimoAbonado = LocalDate.now()
        // TODO Ampliación: implementación de probabilidad para Crecimiento/Floración de la planta.
    }

    override fun transplantar() {
        println("${this.nombre} está siendo transplantada...")
        // TODO Ampliacion: implantación probabilidad éxito según riego y abonado.
    }

    override fun podar() {
        println("${this.nombre} está siendo podada...")
    }
}

