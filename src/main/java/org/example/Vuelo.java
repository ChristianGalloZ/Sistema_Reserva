package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

class Vuelo {
    //atributos
    private String numeroVuelo;
    private String origen;
    private String destino;

    private Date FechaVuelo;
    private Avion avion;
    private List<Reserva> reservas;

    public Vuelo(String numeroVuelo, String origen, String destino, Date fechaVuelo,  Avion avion) {//constructor
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.FechaVuelo = fechaVuelo;
        this.avion = avion;
        this.reservas = new ArrayList<>();
    }

    // getters-Setters
    public Date getFechaVuelo() {
        return FechaVuelo;
    }

    public void setFechaVuelo(Date fechaVuelo) {
        FechaVuelo = fechaVuelo;
    }
    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public String getNumeroVuelo() {

        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {

        this.numeroVuelo = numeroVuelo;
    }

    public String getDestino() {

        return destino;
    }

    public void setDestino(String destino) {

        this.destino = destino;
    }

    public String getOrigen() {

        return origen;
    }

    public void setOrigen(String origen) {

        this.origen = origen;
    }

    public List<Reserva> getReservas() {

        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {

        this.reservas = reservas;
    }


    //Metodos
    public void realizarReserva(Reserva reserva) {

        reservas.add(reserva);
    }

    public void cancelarReserva(Reserva reserva) {

        reservas.remove(reserva);
    }



}