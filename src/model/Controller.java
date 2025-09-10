package model;

import model.Pasajero;
import model.Tarjeta;

public class Controller {

    private Pasajero sofia;
    private Tarjeta miTarjeta;

    public Controller() {
        
    }

    public Tarjeta crearTarjeta(int saldo, boolean personalizada) {
        Tarjeta tarjetica = new Tarjeta(saldo, personalizada);
        return tarjetica;
    }

}