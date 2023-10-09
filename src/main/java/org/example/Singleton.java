package org.example;

import org.example.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Iterator;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton (){
        Scanner sc = new Scanner(System.in);
        List<Aerolinea> aerolineas = new ArrayList<>();
        List<Vuelo> vuelos = new ArrayList<>();
        List<Persona> pasajeros = new ArrayList<>();
        List<Reserva> reservas = new ArrayList<>();
        List<Avion> aviones = new ArrayList<>();
        List<Asiento> asientos = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n************************* Menú Principal *************************");
            System.out.println("1️⃣. Crear Aerolínea 🏢");
            System.out.println("2️⃣. Crear Avión ✈️ de  pasajero 🧍");
            System.out.println("3️⃣. Crear Avión ✈️ de carga 📦 ");
            System.out.println("4️⃣. Crear Vuelo 🛫");
            System.out.println("5️⃣. Crear Pasajero 🧍");
            System.out.println("6️. Crear Reserva 🗒️");
            System.out.println("️️️7️⃣. Listar Vuelos por Fecha 🗓️");
            System.out.println("8️. Listar Vuelos por Pasajero 🧍");
            System.out.println("9️⃣. Listar Vuelos por Aerolinea 🧍");
            System.out.println("1️⃣0️⃣. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste la opcion:" + opcion);
                    System.out.print("-----------------------------------------------------------------------------");
                    System.out.print("\n--------------------Crear Aerolinea 🏢--------------------");
                    System.out.print("\n-----------------------------------------------------------------------------");

                    System.out.print("\nIngrese el nombre de la aerolínea: ");
                    String nombreAerolinea = sc.nextLine();

                    Aerolinea aerolinea = new Aerolinea(nombreAerolinea);

                    int tamanoInicial = aerolineas.size();
                    aerolineas.add(aerolinea);

                    int tamanoFinal = aerolineas.size();

                    if (tamanoInicial < tamanoFinal) {
                        System.out.println("Aerolinea " + nombreAerolinea + " creada con exito ✅");
                    } else {
                        System.out.println("Aerolinea no creada ✖");
                    }
                    break;

                case 2:
                    System.out.println("Seleccionaste la opcion:" + opcion);
                    System.out.print("-----------------------------------------------------------------------------");
                    System.out.print("\n--------------------Crear Avion ✈️ de pasajeros 🧍 --------------------");
                    System.out.print("\n-----------------------------------------------------------------------------");
                    System.out.print("\n❗OBSERVACIÓN:Para poder crear un avion de pasajeros debe de estar creada de antemano una aerolinea.");

                    System.out.print("\nIngrese el modelo del avion: ");
                    String modelo = sc.nextLine();

                    System.out.print("\nIngrese numero de asientos del avion: ");
                    int numeroAsientos = sc.nextInt();

                    Avion avion = new Avion(modelo, numeroAsientos);

                    aviones.add(avion);

                    if (!aerolineas.isEmpty()) {

                        System.out.println("Aerolíneas existentes:");

                        int optionAerolinea = 1;
                        Iterator<Aerolinea> iterator = aerolineas.iterator();
                        while(iterator.hasNext()){
                            Aerolinea airlines = iterator.next();
                            System.out.println(optionAerolinea + ". " + airlines.getNombre());
                            optionAerolinea++;
                        }

                        System.out.println("Seleccione una aerolínea para agregar el avión (ingrese el índice): ");
                        int indiceAerolinea = sc.nextInt() - 1;//el indice seleccionado por el usuario se le resta 1 porque la lista va desde 0.
                        sc.nextLine();

                        if (indiceAerolinea >= 0 && indiceAerolinea < aerolineas.size()) {
                            aerolineas.get(indiceAerolinea).agregarAvion(avion);
                            System.out.println("Avión agregado a la aerolínea  " + aerolineas.get(indiceAerolinea).getNombre());
                        } else {
                            System.out.println("Índice de aerolínea no válido.");
                        }
                    } else {
                        System.out.println("No hay aerolíneas para agregar el avión.");
                    }
                    break;

                case 3:
                    System.out.println("Seleccionaste la opcion:" + opcion);
                    System.out.print("-----------------------------------------------------------------------------");
                    System.out.print("\n--------------------Crear Avion ✈️ de carga 📦--------------------");
                    System.out.print("\n-----------------------------------------------------------------------------");
                    System.out.print("\n❗OBSERVACIÓN:Para poder crear un avion de carga debe de estar creada de antemano una aerolinea.");

                    System.out.print("\nIngrese el modelo del avion de carga: ");
                    String modeloCarga = sc.nextLine();

                    System.out.print("\nIngrese la capadidad de carga del avion en toneladas (T) : ");
                    int toneladasCarga = sc.nextInt();

                    System.out.print("\nSeleccione una opcion para el tipo de carga a transportar:");
                    System.out.print("\n-----------------------------------------------------------------------------");

                    System.out.print("\n1-Mercancia peligrosa");
                    System.out.print("\n2-Mercancia perecedera");
                    System.out.print("\n3-Mercancia urgente");
                    System.out.print("\n4-Mercancia considerada lujosa");
                    System.out.print("\n5-Mercancia voluminosa");

                    int tipoCarga = sc.nextInt();
                    String descripcionCarga = " \n";

                    switch (tipoCarga) {
                        case 1:
                            System.out.println("Opcion seleccionada : 1-Mercancia peligrosa");
                            System.out.println("Descripcion sobre la carga:");
                            descripcionCarga = sc.nextLine();
                            break;
                        case 2:
                            System.out.println("Opcion seleccionada : 2-Mercancia perecedera");
                            System.out.println("Descripcion sobre la carga:");
                            descripcionCarga = sc.nextLine();
                            break;
                        case 3:
                            System.out.println("Opcion seleccionada : 3-Mercancia urgente");
                            System.out.println("Descripcion sobre la carga:");
                            descripcionCarga = sc.nextLine();
                            break;
                        case 4:
                            System.out.println("Opcion seleccionada : 4-Mercancia considerada lujosa");
                            System.out.println("Descripcion sobre la carga:");
                            descripcionCarga = sc.nextLine();
                            break;
                        case 5:
                            System.out.println("Opcion seleccionada : 5-Mercancia voluminosa");
                            System.out.println("Descripcion sobre la carga:");
                            descripcionCarga = sc.nextLine();
                            break;
                        default:
                            System.out.println("Opcion inexistente ❌");
                            break;
                    }

                    AvionCarga avionCarga = new AvionCarga(modeloCarga, tipoCarga, toneladasCarga, descripcionCarga);
                    aviones.add(avionCarga);

                    if (!aerolineas.isEmpty()) {

                        System.out.println("Aerolíneas existentes:");

                        int optionAerolinea = 1;
                        Iterator<Aerolinea> iterator = aerolineas.iterator();
                        while (iterator.hasNext()) {
                            Aerolinea airlines = iterator.next();
                            System.out.println(optionAerolinea + ". " + airlines.getNombre());
                            optionAerolinea++;
                        }

                        System.out.println("Seleccione una aerolínea para agregar el avión de carga (ingrese el índice): ");
                        int indiceAerolinea = sc.nextInt() - 1;//el indice seleccionado por el usuario se le resta 1 porque la lista va desde 0.
                        sc.nextLine();

                        if (indiceAerolinea >= 0 && indiceAerolinea < aerolineas.size()) {
                            aerolineas.get(indiceAerolinea).agregarAvion(avionCarga);
                            System.out.println("Avión de carga  agregado a la aerolínea " + aerolineas.get(indiceAerolinea).getNombre()+"✅");
                        } else {
                            System.out.println("Índice de aerolínea no válido❌");
                        }
                    } else {
                        System.out.println("No hay aerolíneas para agregar el avión.");
                    }
                    break;

                case 4:
                    System.out.println("Seleccionaste la opcion: " + opcion);
                    System.out.print("-----------------------------------------------------------------------------");
                    System.out.print("\n--------------------Crear Vuelo 🛫--------------------");
                    System.out.print("\n-----------------------------------------------------------------------------");
                    System.out.print("\n❗OBSERVACIÓN:Para poder crear un avion de carga debe de estar creada de antemano una aerolinea.");

                    System.out.print("\nIngrese el número de vuelo: ");
                    String numeroVuelo = sc.nextLine();

                    System.out.print("Ingrese el origen del vuelo: ");
                    String origen = sc.nextLine();

                    System.out.print("Ingrese el destino del vuelo: ");
                    String destino = sc.nextLine();

                    System.out.print("Ingrese la fecha del vuelo  en el formato yyyy-MM-dd: ");
                    String dateString = sc.nextLine();

                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date date = null;

                    try {
                        date = dateFormat.parse(dateString);
                    } catch (ParseException e) {
                        System.err.println("❌Invalid date format. Please use yyyy-MM-dd❌");

                    }
                    System.out.println("Seleccione el avión para el vuelo (ingrese el índice): ");

                    int optionAvion = 1;
                    Iterator<Avion> iterator = aviones.iterator();
                    while(iterator.hasNext()){
                        Avion airplane = iterator.next();
                        System.out.println(optionAvion + ". " + airplane.getModelo());
                        optionAvion++;
                    }
                    int indiceAvion = sc.nextInt() - 1;
                    Avion avionSeleccionado = aviones.get(indiceAvion);
                    Vuelo vuelo = new Vuelo(numeroVuelo, origen, destino, date, avionSeleccionado);
                    vuelos.add(vuelo);
                    System.out.println("Vuelo creado exitosamente✅");
                    break;


                case 5:
                    System.out.println("Seleccionaste la opcion: " + opcion);
                    System.out.print("-----------------------------------------------------------------------------");
                    System.out.print("\n----------Crear Pasajero 🧍--------------------");
                    System.out.print("\n-----------------------------------------------------------------------------");

                    System.out.print("\nIngrese su nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("\nIngrese su apellido: ");
                    String apellido = sc.nextLine();

                    System.out.print("\nIngrese numero de pasaporte: ");
                    String pasaporte = sc.nextLine();

                    Persona pasajero = new Persona(nombre, apellido, pasaporte);
                    pasajeros.add(pasajero);
                    System.out.println("\n----Informacion recibida--- ");
                    System.out.println("\nNombre completo del pasajero: " + nombre + " " + apellido);
                    System.out.println("\nPasaporte: " + pasaporte);
                    break;

                case 6:
                    System.out.println("Seleccionaste la opcion:" + opcion);
                    System.out.print("-----------------------------------------------------------------------------");
                    System.out.print("\n--------------------Crear Reserva 🗒️--------------------");
                    System.out.print("\n-----------------------------------------------------------------------------");
                    System.out.print("\n❗OBSERVACIÓN:Para poder crear un reserva de vuelos debe de estar creado de antemano un pasajero,aerolinea, avion y vuelo.");

                    System.out.println("Seleccione el vuelo ✈️(Ingrese el indice)");

                    int optionVuelo = 1;

                    Iterator<Vuelo> iteratorVuelo = vuelos.iterator();
                    while(iteratorVuelo.hasNext()){
                        Vuelo flight = iteratorVuelo.next();
                        System.out.println(optionVuelo+". "+flight.getOrigen()+"-"+flight.getDestino());
                        optionVuelo++;
                    }

                    int indiceVuelo = sc.nextInt() - 1;
                    Vuelo vueloSeleccionado = vuelos.get(indiceVuelo);

                    System.out.println("Seleccione el Pasajero de esta reserva(Ingrese el indice) ");
                    int optionPasajero = 1;

                    Iterator<Persona> iteratorPasajero = pasajeros.iterator();
                    while(iteratorPasajero.hasNext()){
                        Persona passenger = iteratorPasajero.next();
                        System.out.println(optionPasajero+". "+passenger.getNombre()+" "+passenger.getApellido());
                        optionPasajero++;
                    }

                    int indicePasajero = sc.nextInt() - 1;
                    Persona personaSeleccionada = pasajeros.get(indicePasajero);

                    System.out.println("Ingrese el numero del asiento que desea: ");
                    int asientoPasajero = sc.nextInt();
                    if (vueloSeleccionado != null) {
                        Reserva reserva = new Reserva(vueloSeleccionado, personaSeleccionada,asientoPasajero);

                        personaSeleccionada.agregarReserva(reserva); // Agregar la reserva al pasajero especifico.
                        reservas.add(reserva);

                        System.out.println("Reserva creada con exito ✅");
                        System.out.println("\n--------------------Informacion sobre la  reserva 🗒️----------------------:");
                        System.out.println("Número de vuelo: " + reserva.getVuelo().getNumeroVuelo());
                        System.out.println("Origen: " + reserva.getVuelo().getOrigen());
                        System.out.println("Destino: " + reserva.getVuelo().getDestino());
                        System.out.println("Asiento: " + reserva.getAvionAsientos()+" "+ reserva.determinarClase());
                    }
                    else {
                        System.out.println("El vuelo seleccionado es nulo. No se puede crear la reserva.❌");
                    }
                    break;

                case 7:
                    System.out.println("Seleccionaste la opción: " + opcion);
                    System.out.print("-----------------------------------------------------------------------------");
                    System.out.print("\n--------------------Listar Vuelos por Fecha ✈️🗓️--------------------");
                    System.out.print("\n-----------------------------------------------------------------------------");


                    System.out.println("Ingrese la fecha inicial para filtar  los vuelos  que coincidan;utilice el  siguiente formato(año-mes-dia): ");
                    String fechaInicialStr = sc.nextLine();

                    System.out.println("Ingrese la fecha final para filtar  los vuelos  que coincidan;utilice el  siguiente formato(año-mes-dia): ");
                    String fechaFinalStr = sc.nextLine();

                    SimpleDateFormat dateFormatC = new SimpleDateFormat("yyyy-MM-dd");
                    Date fechaInicial = null;
                    Date fechaFinal = null;

                    try {
                        fechaInicial = dateFormatC.parse(fechaInicialStr);
                        fechaFinal = dateFormatC.parse(fechaFinalStr);
                    } catch (ParseException e) {
                        System.err.println("❌Formato de fecha invalido.Por favor use el siguiente formato yyyy-MM-dd❌");
                    }

                    for (Vuelo vueloActual : vuelos) {
                        Date fechaVuelo = (Date) vueloActual.getFechaVuelo();

                        if (fechaVuelo != null && fechaVuelo.compareTo(fechaInicial) >= 0 && fechaVuelo.compareTo(fechaFinal) <= 0) {
                            System.out.println("Número de vuelo: " + vueloActual.getNumeroVuelo());
                            System.out.println("Origen: " + vueloActual.getOrigen());
                            System.out.println("Destino: " + vueloActual.getDestino());
                            System.out.println("Fecha del vuelo: " + dateFormatC.format(fechaVuelo));
                            System.out.println();

                        }
                        else{
                            System.out.println("No hay vuelos en esta fecha");
                        }

                    }
                    break;
                case 8:
                    System.out.println("Seleccionaste la opción: " + opcion);
                    System.out.print("-----------------------------------------------------------------------------");
                    System.out.print("\n--------------------Listar vuelos por pasajero  ✈️🧍---------------------");
                    System.out.print("\n-----------------------------------------------------------------------------");

                    System.out.println("\nSeleccione el Pasajero de esta reserva 🪪(Ingrese el índice)");

                    int optionPasajero1 = 1;

                    Iterator<Persona> iteratorPasajero1 = pasajeros.iterator();
                    while(iteratorPasajero1.hasNext()){
                        Persona passenger = iteratorPasajero1.next();
                        System.out.println(optionPasajero1+". "+passenger.getNombre()+" "+passenger.getApellido());
                        optionPasajero1++;
                    }

                    int indiceListarPasajero = sc.nextInt() - 1;
                    sc.nextLine();

                    if (indiceListarPasajero >= 0 && indiceListarPasajero < pasajeros.size()) {
                        Persona personaListar = pasajeros.get(indiceListarPasajero);

                        System.out.println("Vuelos de " + personaListar.getNombre() + ":");

                        for (Reserva reserva : reservas) {

                            System.out.println("Número de vuelo: " + reserva.getVuelo().getNumeroVuelo()+" / Origen: " + reserva.getVuelo().getOrigen()+
                                    " / Destino: " + reserva.getVuelo().getDestino());
                        }
                    }
                    else {
                        System.out.println("Índice de pasajero no válido ❌");
                    }
                    break;

                case 9:
                    System.out.println("Seleccionaste la opcion: " + opcion);
                    System.out.print("-----------------------------------------------------------------------------");
                    System.out.print("\n--------------------Listar vuelos por aerolineas 🏢--------------------");
                    System.out.print("\n-----------------------------------------------------------------------------");

                    System.out.println("Aerolíneas disponibles:");

                    int optionAerolinea = 1;
                    Iterator<Aerolinea> iteratorAerolinea = aerolineas.iterator();
                    while(iteratorAerolinea.hasNext()){
                        Aerolinea airlines = iteratorAerolinea.next();
                        System.out.println(optionAerolinea + ". " + airlines.getNombre());
                        optionAerolinea++;
                    }
                    int seleccionAerolinea = sc.nextInt() - 1;
                    sc.nextLine();
                    if (seleccionAerolinea >= 0 && seleccionAerolinea < aerolineas.size()) {
                        Aerolinea aerolineamostrar = aerolineas.get(seleccionAerolinea);
                        System.out.println("Los vuelos de la aerolinea " + aerolineamostrar.getNombre());

                        int iteradorVuelos = 1;
                        for (Vuelo Vuelos : vuelos) {
                            System.out.println(iteradorVuelos + ". " + Vuelos.getNumeroVuelo()+" "+Vuelos.getOrigen()+" - "+Vuelos.getDestino()+" "+Vuelos.getFechaVuelo());
                            iteradorVuelos++;
                        }
                    }
                    break;

                case 10:
                    System.out.println("Seleccionaste la opcion:" + opcion);
                    System.out.print("-----------------------------------------------------------------------------");
                    System.out.println("Finalizacion del programa");
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
        while (opcion != 10);
    }

    //metodo
    public static Singleton getSingleton(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
}

}