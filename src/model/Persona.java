package model;

public class Persona {
    private String nombre;
    private int edad;
    private String rut;
    private String telefono;
    private Direccion direccion;
// composicion
    public Persona(String nombre, int edad, String rut, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Persona() {
    }
 // Getters y Setters
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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona {" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", rut='" + rut + '\'' +
                ", telefono=" + telefono +
                ", direccion=" + direccion +
                '}';
    }
}



