package com.misiontic.patient_ms.models;

import java.io.Serializable;
import java.util.Objects;

public class PatientId implements Serializable {
        private String numeroIdentificacion;

        private String tipoIdentificacion;

    public PatientId() {
    }

    public PatientId(String numeroIdentificacion, String tipoIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoIdentificacion = tipoIdentificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientId patientId = (PatientId) o;
        return Objects.equals(numeroIdentificacion, patientId.numeroIdentificacion) && Objects.equals(tipoIdentificacion, patientId.tipoIdentificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroIdentificacion, tipoIdentificacion);
    }
}
