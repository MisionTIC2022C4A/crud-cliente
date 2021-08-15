package com.misiontic.patient_ms.models;
import javax.persistence.*;
import java.time.LocalDate;
@Entity
@IdClass(PatientId.class)
public class Patient {

    @Id
    private String numeroIdentificacion;

    @Id
    private String tipoIdentificacion;

    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private String estadoCivil;
    private String ocupacion;
    private String direccion;
    private String ciudad;
    private String telefono;
    private String email;
    private String nombreAcompanante;
    private String aseguradora;
    private String vinculacion;
    private LocalDate fechaIngreso;

    public Patient(String numeroIdentificacion, String tipoIdentificacion, String nombreCompleto, LocalDate fechaNacimiento, String estadoCivil, String ocupacion, String direccion, String ciudad, String telefono, String email, String nombreAcompanante, String aseguradora, String vinculacion, LocalDate fechaIngreso) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoIdentificacion = tipoIdentificacion;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.email = email;
        this.nombreAcompanante = nombreAcompanante;
        this.aseguradora = aseguradora;
        this.vinculacion = vinculacion;
        this.fechaIngreso = fechaIngreso;
    }

    public Patient() {
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreAcompanante() {
        return nombreAcompanante;
    }

    public void setNombreAcompanante(String nombreAcompanante) {
        this.nombreAcompanante = nombreAcompanante;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    public String getVinculacion() {
        return vinculacion;
    }

    public void setVinculacion(String vinculacion) {
        this.vinculacion = vinculacion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", tipoIdentificacion='" + tipoIdentificacion + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", nombreAcompanante='" + nombreAcompanante + '\'' +
                ", aseguradora='" + aseguradora + '\'' +
                ", vinculacion='" + vinculacion + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }

}