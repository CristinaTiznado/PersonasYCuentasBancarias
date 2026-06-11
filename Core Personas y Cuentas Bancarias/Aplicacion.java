import clases.CuentaBancaria;
import clases.Persona;

public class Aplicacion {
    public static void main(String[] args) {
        Persona persona1 = new Persona("nombre1", 30);
        Persona persona2 = new Persona("nombre2", 40);
        Persona persona3 = new Persona("nombre3", 25);

        CuentaBancaria cuenta1 = new CuentaBancaria(500000, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(100000, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(200000, persona3);

        cuenta1.depositar(200000);
        cuenta1.despliegaInformacion();
        System.out.println("-----------");

        cuenta2.retirar(45000);
        cuenta2.despliegaInformacion();
        System.out.println("-----------");

        cuenta3.depositar(10000);
        cuenta3.despliegaInformacion();
        System.out.println("-----------");
        System.out.println("-----------");

        cuenta1.imprimeInformacionDeTodasLasCuentas();
    }
}
