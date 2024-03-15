package org.practicatrim2

import java.time.LocalDate

/**
 * Creamos la clase padre Planta, de la que derivaremos el resto.
 *
 * @property nombre Sring Nombre de la planta.
 * @property tipo TipoPlanta Indica que timpo de planta es.
 * @property embergaduraFinal AlturaPlanta Nos indica el tamaño que puede llegar a alcanzar nuestra planta.
 * @property fechaCrecimiento LocalDate Nos dará información sobre cuánto tiempo lleva creciendo la planta.
 * @property fechaUltimoRiego LocalDate Indicará cuándo fué la fecha del último riego de la planta.
 * @property fechaUltimoAbonado LocalDate Indicará cuándo fué la fecha del último abonado de la planta.
 */
abstract class Planta(
    nombre: String,
    tipo: TipoPlanta,
    humedad: Int,
    estado: EstadoPlanta,
    estadoCrecimiento: Crecimiento,
    embergaduraFinal: AlturaPlanta,
    fechaCrecimiento: LocalDate,
    fechaUltimoRiego: LocalDate,
    fechaUltimoAbonado: LocalDate
) : RealizarCuidados , GestionConsola {

    // Propiedades de Planta
    open var nombre: String = nombre
        set(value) {
            require(nombre.isNotBlank()) { "Éste campo no puede estar vacío." }
            field = value
        }
    open var tipo: TipoPlanta = TipoPlanta.entries.random()
        set(value) {
            require(tipo in TipoPlanta.entries) { "No tenemos registrada ése tipo de planta." }
            field = value
        }
    open var humedad: Int = humedad
        set(value) {
            require(humedad in 1..10) { "El nivel de humedad en la tierra debe estar en la escala 1-10." }
            field = value
        }
    open var estado: EstadoPlanta = EstadoPlanta.entries.random()
        set(value) {
            require(estado in EstadoPlanta.entries) { "Estado del sustrato desconocido." }
            field = value
        }
    var estadoCrecimiento: Crecimiento = Crecimiento.entries.random()
        set(value) {
            require(estadoCrecimiento in Crecimiento.entries) { "No se reconoce el estado de la planta." }
            field = value
        }
    var embergaduraFinal: AlturaPlanta = AlturaPlanta.entries.random()
        set(value) {
            require(embergaduraFinal in AlturaPlanta.entries) { "No tenemos registros de ése tipo de embergadura." }
            field = value
        }

    /* Para las propiedades que van a hacer uso de la fecha del sistema, vamos a indicar que las entradas de dichos
       registros no puedan ser posteriores a la fecha del día en que se realice dicho registro. */

    private var fechaCrecimiento: LocalDate = fechaCrecimiento
        set(value) {
            require(fechaCrecimiento <= LocalDate.now()) { "La fecha no puede ser posterior a la del día de hoy." }
            field = value
        }
    var fechaUltimoRiego: LocalDate = fechaUltimoRiego
        set(value) {
            require(fechaUltimoRiego <= LocalDate.now()) { "La fecha del último riego no puede ser posterior a la del día de hoy." }
            field = value
        }
    var fechaUltimoAbonado: LocalDate = fechaUltimoAbonado
        set(value) {
            require(fechaUltimoAbonado <= LocalDate.now()) { "La fecha del último abonado no puede ser posterior al día de hoy." }
            field = value
        }

    override fun printText(texto: String): String {
        return texto
    }
    override fun toString(): String {
        return "$nombre, es una $tipo, $estadoCrecimiento. " +
                "Estado del ustrato: $estado.\n" +
                "Último riego: $fechaUltimoRiego\n" +
                "Último abonado: $fechaUltimoAbonado\n"
    }
}