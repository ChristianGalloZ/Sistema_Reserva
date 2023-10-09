package org.example;
import java.util.ArrayList;
import java.util.List;


class Reserva {
    private Vuelo vuelo;
    private List<Persona> pasajeros;
    private int AvionAsientos;

    public Reserva(Vuelo vueloSeleccionado, Persona personaSeleccionada,int avionAsientos) {
        this.vuelo = vueloSeleccionado;
        this.pasajeros = new ArrayList<>();
        this.pasajeros.add(personaSeleccionada);
        this.AvionAsientos = avionAsientos;

    }


    public int getAvionAsientos() {
        return AvionAsientos;
    }

    public void setAvionAsientos(int avionAsientos) {
        AvionAsientos = avionAsientos;
    }
    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public List<Persona> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Persona> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void add(Reserva reserva) {
    }
    public String determinarClase(){
        if(getAvionAsientos()<= 15){
            return "First Class";
        }
        else if (getAvionAsientos()>15 && getAvionAsientos()<= 30) {
            return "Business Class";
        }
        else {
            return "Economy Class";
        }
    }


}
