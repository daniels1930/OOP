package model;

public class Tarjeta {
    private int saldo;
    private boolean personalizada;

    public Tarjeta(int saldo, boolean personalizadaNueva) {
        this.saldo = saldo;
        this.personalizada = personalizada;
    }

    // GETTERs

    public int getSaldo() {
        return saldo;
    }

    public boolean getPersonalizada() {
        return personalizada;
    }

    // SETTERs

    public void setSaldo(int nuevoSaldo) {
        saldo = nuevoSaldo;
    }

    public void setPersonalizada(boolean nuevoPersonalizada) {
        personalizada = nuevoPersonalizada;
    }
}