package org.example;

import java.util.List;
import java.util.ArrayList;

class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private String pasaporte;
    private static List<Reserva> reservas;


    public Persona(String nombre, String apellido, String pasaporte) {//Constructor
        this.nombre = nombre;
        this.apellido = apellido;
        this.pasaporte = pasaporte;
        this.reservas = new ArrayList<>();
    }

    //Getters-Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public void agregarReserva(Reserva reserva) {

        reservas.add(reserva);
    }
    public static List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}

