package org.example;
import java.util.ArrayList;
import java.util.List;


class Asiento {
    //Atributos
    private String Asiento;
;

    public Asiento(String asiento) {
        this.Asiento = asiento;

    }

    public String determinarAsiento(){

        if(Asiento.endsWith("A") || Asiento.endsWith("F")){
            return "Ventana";
        }

        else if(Asiento.endsWith("C") || Asiento.endsWith("D")){
            return "Pasillo";
        }

        else{
            return "Medio";
        }


    }

}