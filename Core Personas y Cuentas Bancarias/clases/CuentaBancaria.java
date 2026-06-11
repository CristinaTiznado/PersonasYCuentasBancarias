package clases;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
    // ATRIBUTOS
    private double saldo;
    private Persona titular;
    private int numeroCuenta;
    private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();

    // CONSTRUCTOR
    public CuentaBancaria(double saldo, Persona titular){
        this.saldo = saldo;
        this.titular = titular;

        Random rand = new Random();
        this.numeroCuenta = rand.nextInt(900000) + 100000;

        listaDeCuentasBancarias.add(this);
    }

    // GETTERS Y SETTERS
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public static ArrayList<CuentaBancaria> getListaDeCuentasBancarias() {
        return listaDeCuentasBancarias;
    }

    // MÉTODOS
    public void depositar(double monto){
        setSaldo(getSaldo() + monto);
    }

    public void retirar(double monto){
        if(getSaldo() > monto){
            setSaldo(getSaldo() - monto);
        }
    }

    public void despliegaInformacion(){
        int indice = listaDeCuentasBancarias.indexOf(this);
        System.out.println("Cuenta #" + indice);
        System.out.println("Titular:\t" + this.titular.getNombre());
        System.out.println("Saldo:\t\t" + this.saldo);
        System.out.println("Nro cuenta:\t" + this.numeroCuenta);
    }

    public void imprimeInformacionDeTodasLasCuentas(){
        System.out.println("Informacion de Todas las Cuentas Bancarias\n");
        for (CuentaBancaria cuentaBancaria : listaDeCuentasBancarias) {
            cuentaBancaria.despliegaInformacion();
            System.out.println("-----------------");
        }
    }
}
