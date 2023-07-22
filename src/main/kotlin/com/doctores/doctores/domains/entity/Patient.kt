package com.doctores.doctores.domains.entity

import jakarta.persistence.*
import java.time.Instant


@Entity
@Table(name = "pacientes")
open class Patient (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_patient")
    open var idPatient: Long=0,

    @Column(name = "nombre")
    open var nombre: String,

    @Column(name = "apellido")
    open var apellido: String,

    @Column(name = "identificacion")
    open var identificacion: String,

    @Column(name = "telefono")
    open var telefono: Number,

    @Column(name = "created_at")
    open var created_at: Instant = Instant.now(),


    )