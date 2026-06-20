package model;


// hereda a persona

public class Empleado extends Persona {
    private String cargo;
    private boolean estaEnTurno;

    public Empleado(String nombre, int edad, String rut, String telefono, Direccion direccion, String cargo, boolean estaEnTurno) {
        super(nombre, edad, rut, telefono, direccion);
        this.cargo = cargo;
        this.estaEnTurno = estaEnTurno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isEstaEnTurno() {
        return estaEnTurno;
    }

    public void setEstaEnTurno(boolean estaEnTurno) {
        this.estaEnTurno = estaEnTurno;
    }

    @Override
    public String toString() {
        return "Empleado { " +
                "Nombre: " + getNombre() +
                " | Edad: " + getEdad() +
                " | Rut: " + getRut() +
                " | Telefono: " + getTelefono() +
                " | Direccion: " + getDireccion() +
                " | Cargo: " + cargo +
                " | En turno: " + estaEnTurno +
                " }";
    }

}

