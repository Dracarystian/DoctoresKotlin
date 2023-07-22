package com.doctores.doctores.domains.responses

data class CreatePatientResponse (
    val idPatient: Long,
    val nombre: String,
    val apellido: String,
    val identificacion: String,
    val telefono: Number
)