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
    public Patient getPatient(@PathVariable String numeroIdentificacion,@PathVariable String tipoIdentificacion){
        return patientRepository.findByNumeroIdentificacionAndTipoIdentificacion(
                numeroIdentificacion, tipoIdentificacion
        ).orElseThrow(() -> new PatientNotFoundException("No se encontro una cuenta con el numeroIdentificacion " +
                        "y el tipoIdentificacion: " + numeroIdentificacion + ", " + tipoIdentificacion));
    }
    @Transactional
    @DeleteMapping("/patient/{numeroIdentificacion}/{tipoIdentificacion}")
    public void deletePatient(@PathVariable String numeroIdentificacion,@PathVariable String tipoIdentificacion){
        patientRepository.deleteByNumeroIdentificacionAndTipoIdentificacion(
                numeroIdentificacion, tipoIdentificacion);
    }
    @PostMapping("/patient")
    public Patient newPatient(@RequestBody Patient newPatient){
        return patientRepository.save(newPatient);
    }
}
