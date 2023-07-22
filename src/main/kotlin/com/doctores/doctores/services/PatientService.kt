package com.doctores.doctores.services;

import com.doctores.doctores.constants.Patient
import com.doctores.doctores.domains.entity.Patient
import com.doctores.doctores.domains.request.CreatePatientRequest
import com.doctores.doctores.domains.responses.CreateDoctorResponse
import com.doctores.doctores.domains.responses.CreatePatientResponse
import com.doctores.doctores.repositories.PatientRepository
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import  java.time.Instant




@Service
class PatientService {
    @Autowired
    private lateinit var patientRepository: PatientRepository
    fun CreatePatient (request: CreatePatientRequest): CreatePatientResponse{
        val patient = patientRepository.save (
            Patient(
                nombre = request.nombre,
                apellido = request.apellido,
                identificacion = request.identificacion,
                telefono = request.telefono
            )
        )
        return  CreatePatientResponse(
            idPatient = 1,
            nombre = request.nombre,
            apellido = request.apellido,
            identificacion = request.identificacion,
            telefono = 123
        )
    }

    fun getAllPatients(): List<CreatePatientResponse>{
        var response : List<CreatePatientResponse> = listOf(
            CreatePatientResponse(
                idPatient = 1,
                nombre = "test",
                apellido = "test",
                identificacion = "test",
                telefono = 123
            )
        )
        return  response
    }

    fun getPatientById(id: Long): CreatePatientResponse {
        var patient: Patient? = patientRepository.getByPatientId(id)
        if (patient!= null){
            return CreatePatientResponse(
                idPatient = patient.idPatient,
                nombre = "Test",
                apellido = "Test",
                identificacion = "test",
                telefono = 123
            )
        }else{
            return CreatePatientResponse(
                idPatient = 1,
                nombre = "test",
                apellido = "test",
                identificacion = "test",
                telefono = 123
            )
        }
    }

    fun updatePatient(id: Long): CreatePatientResponse{
        return CreatePatientResponse(
            idPatient = 1,
            nombre = "test",
            apellido = "test",
            identificacion = "test",
            telefono = 123
        )
    }
}

