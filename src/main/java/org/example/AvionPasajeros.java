package org.example;

public class AvionPasajeros extends Avion {
    private String modeloAvion;
    private int totalAsientos;

    public AvionPasajeros(String modeloAvion, int totalAsientos) {
        super(modeloAvion, totalAsientos);
        this.modeloAvion = modeloAvion;
        this.totalAsientos = totalAsientos;
    }

    public String getModeloAvion() {
        return modeloAvion;
    }

    public void setModeloAvion(String modeloAvion) {
        this.modeloAvion = modeloAvion;
    }

    public int getTotalAsientos() {
        return totalAsientos;
    }

    public void setTotalAsientos(int totalAsientos) {
        this.totalAsientos = totalAsientos;
    }
}
