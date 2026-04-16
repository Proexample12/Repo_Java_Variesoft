package com.variesoft.model;

public class Empleado extends Persona {
    protected String correo;
    protected String turno;

    public Empleado(int id, String nombre, String correo, String turno) {
        super(id, nombre);
        this.correo = correo;
        this.turno = turno;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTurno() {
        return turno;
    }

    public void cambiarTurno(String nuevoTurno) {
        this.turno = nuevoTurno;
    }

    public boolean validarCredenciales(String correoIngresado) {
        return this.correo.equalsIgnoreCase(correoIngresado);
    }

    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre='" + nombre + "', correo='" + correo + "', turno='" + turno + "'}";
    }
}