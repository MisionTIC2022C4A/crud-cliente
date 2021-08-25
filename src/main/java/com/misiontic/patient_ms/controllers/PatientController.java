package com.misiontic.patient_ms.controllers;

import com.misiontic.patient_ms.exceptions.PatientNotFoundException;
import com.misiontic.patient_ms.models.Patient;
import com.misiontic.patient_ms.repositories.PatientRepository;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
public class PatientController {

    private final PatientRepository patientRepository;


    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @GetMapping("/patient/{numeroIdentificacion}/{tipoIdentificacion}")
    public Patient getPatient(@PathVariable String numeroIdentificacion, @PathVariable String tipoIdentificacion){
        return patientRepository.findByNumeroIdentificacionAndTipoIdentificacion(
                numeroIdentificacion, tipoIdentificacion
        ).orElseThrow(() -> new PatientNotFoundException("No se encontro una cuenta con el numeroIdentificacion " +
                        "y el tipoIdentificacion: " + numeroIdentificacion + ", " + tipoIdentificacion));
    }
    @Transactional
    @DeleteMapping("/patient/{numeroIdentificacion}/{tipoIdentificacion}")
    public String deletePatient(@PathVariable String numeroIdentificacion,@PathVariable String tipoIdentificacion){
        patientRepository.deleteByNumeroIdentificacionAndTipoIdentificacion(
                numeroIdentificacion, tipoIdentificacion);
        return "Se ha eliminado el paciente con el numeroIdentificacion " +
                "y el tipoIdentificacion: " + numeroIdentificacion + ", " + tipoIdentificacion;
    }
    @PostMapping("/patient")
    public Patient newPatient(@RequestBody Patient newPatient){
        //TODO check if Patient already exist
        return patientRepository.save(newPatient);
    }
}
