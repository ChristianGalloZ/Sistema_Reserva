package org.example;

import java.util.ArrayList;
import java.util.List;

class Aerolinea {

    //atributos
    private String nombre;
    private static List<Avion> aviones;  // Lista de aviones de la aerolínea
    private List<Vuelo> vuelos;//Lista de vuelos de la aerolinea

    List<Aerolinea> aerolineas = new ArrayList<>();



    public Aerolinea(String nombre) {//constructor
        this.nombre = nombre;
        this.vuelos = new ArrayList<>();
        this.aviones = new ArrayList<>();
        this.aerolineas = new ArrayList<>();
    }

    //Getters-Setters
    public List<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(List<Avion> aviones) {
        this.aviones = aviones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public void agregarVuelo(Vuelo vuelo) {

        vuelos.add(vuelo);
    }


    public void agregarAvion(Avion avion) {
    aviones.add(avion);
    }
}
