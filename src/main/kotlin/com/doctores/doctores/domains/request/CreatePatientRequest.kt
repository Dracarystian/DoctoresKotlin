package com.doctores.doctores.domains.request;

import  org.jetbrains.annotations.NotNull

data class CreatePatientRequest(
        @field:NotNull("Id Paciente is required")
        val idPatient: Number,

        val nombre: String,
        val apellido: String,
        val identificacion: String,
        val telefono: Number
)

