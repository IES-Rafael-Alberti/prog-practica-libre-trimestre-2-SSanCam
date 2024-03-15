package org.practicatrim2

enum class EspeciesSuculentas() {
    ECHEVERIA_ELEGANS, ALOE_VERA, CRASSULA_OVATA, HAWORTHIA_ATTENUATA, SEDUM_MORGANIANUM, SEMPERVIVUM_TECTORUM,
    KALANCHOE_TOMENTOSA, GRAPTOPETALUM_PARAGUAYENSE, EUPHORBIA_TRIGONA, SENECIO_ROWLEYANUS, LITHOPS, PACHYPHYTUM_OVIFERUM,
    GASTERIA_BICOLOR, AEONIUM_ARBOREUM, AGAVE_AMERICANA;

    // Formateamos el nombre para mejor visualización cuando recibamos la información.
    private fun formatearSalida(): String {
        val nombreFormateado = this.name.replace("_", " ")
        return nombreFormateado.lowercase().replaceFirstChar { it.uppercase() }
    }
}
