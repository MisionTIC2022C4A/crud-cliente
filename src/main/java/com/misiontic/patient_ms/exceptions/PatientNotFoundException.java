package com.misiontic.patient_ms.exceptions;


public class PatientNotFoundException extends RuntimeException {
    public PatientNotFoundException(String message) {
        super(message);
    }
}