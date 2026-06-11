package clases;

public class Persona {
    // ATRIBUTOS
    private String nombre;
    private int edad;

    // CONSTRUCTOR
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // MÉTODO
    public void despliegaInformacion(){
        System.out.println("Nombre:\t\t" + this.nombre);
        System.out.println("Edad:\t\t" + this.edad);
    }
}
