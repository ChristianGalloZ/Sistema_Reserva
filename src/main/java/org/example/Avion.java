package org.example;

class Avion {
    //Atributos
    private String modelo;
    private int NumeroAsientos;


    public Avion(String modelo, int numeroAsientos) {//constructor
        this.modelo = modelo;
        this.NumeroAsientos = numeroAsientos;
        //this.asientos = new ArrayList<>();
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
