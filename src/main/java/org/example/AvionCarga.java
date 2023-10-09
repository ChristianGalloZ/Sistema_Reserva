package org.example;

public class AvionCarga extends Avion {
    private String modeloCarga;
    private int toneladasCarga;

    private int tipoCarga;

    private String descripcionCarga;

    public AvionCarga(String modeloCarga,int toneladasCarga, int tipoCarga,String descripcionCarga){
        super(modeloCarga,toneladasCarga);
        this.modeloCarga = modeloCarga;
        this.toneladasCarga = toneladasCarga;
        this.tipoCarga = tipoCarga;
        this.descripcionCarga = descripcionCarga;
    }

    public int getToneladasCarga() {

        return toneladasCarga;
    }

    public void setToneladasCarga(int toneladasCarga) {

        this.toneladasCarga = toneladasCarga;
    }


    public String getModeloCarga() {
        return modeloCarga;
    }


    public void setModeloCarga(String modeloCarga) {

        this.modeloCarga = modeloCarga;
    }

    public int getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(int tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public String getDescripcionCarga() {
        return descripcionCarga;
    }

    public void setDescripcionCarga(String descripcionCarga) {
        this.descripcionCarga = descripcionCarga;
    }
}
