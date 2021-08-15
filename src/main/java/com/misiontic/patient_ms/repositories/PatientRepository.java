package com.misiontic.patient_ms.repositories;

import com.misiontic.patient_ms.models.Patient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PatientRepository extends CrudRepository<Patient, String> {

    List<Patient> findByNombreCompleto(String nombreCompleto);

    Optional<Patient> findByNumeroIdentificacionAndTipoIdentificacion(
            String numeroIdentificacion,
            String tipoIdentificacion);

    void deleteByNumeroIdentificacionAndTipoIdentificacion(
            String numeroIdentificacion,
            String tipoIdentificacion);
}