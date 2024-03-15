package org.practicatrim2
import java.time.LocalDate

/**
 * Clase genérica que representa a las suculentas.
 * @param T Indica el tipo específico de suculenta.
 * @property especie Indica la especie concreta de suculenta.
 * @property fechaUltimoTransplante Indica la fecha en la que se transplantó por última vez.
 */
abstract class Suculentas<T> (
    especie: String,
    fechaUltimoTransplante: LocalDate,
    nombre: String,
    tipo: List<TipoPlanta>,
    estadoCrecimiento: Crecimiento,
    embergaduraFinal: AlturaPlanta,
    fechaCrecimiento: LocalDate,
    fechaUltimoRiego: LocalDate,
    fechaUltimoAbonado: LocalDate
): Planta(nombre, tipo, estadoCrecimiento, embergaduraFinal, fechaCrecimiento, fechaUltimoRiego, fechaUltimoAbonado){

    var especie: String = especie
        set(value) {
            require(especie.isNotBlank()) {"Éste campo no puede estar vacío."}
            field = value
        }
    var fechaUltimoTransplante: LocalDate = fechaUltimoTransplante
        set(value) {
            require(fechaUltimoTransplante <= LocalDate.now()) {"La fecha del transplante no puede ser superior a la de hoy."}
            field = value
        }
}