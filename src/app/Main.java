
package app;

/** Importar models */
import model.Direccion;
import model.Persona;
import model.Empleado;

public class Main {


    public static void main(String[] args) {
        // 1. Crear objetos de composición
        Direccion dir1 = new Direccion("Chile","Santiago","Maipu","5 de abril ");
        Direccion dir2 = new Direccion("Chile","Santiago","Recoleta","Av.Peru 1255");
        Direccion dir3 = new Direccion("Argentina","Buenos aires","San Cristobal","Av.San Juan 1012");

        // 2. Crear al menos tres instancias de objetos [5]
        Persona cliente = new Persona("Jose Barrios",28,"17.555.436-2","+56935998571",dir2);
        Persona segundoCliente = new Persona("Camila Quezada",26,"18.043.333-8","+56933252892",dir2);
        Empleado presencial = new Empleado("Mario Balmaceda",33,"16.431.333-1","+56922194871",dir1,"Guia",true);
        Empleado remoto = new Empleado("Fernanda Muñoz", 44,"14.432.652-2","+56949332861",dir3,"Soporte Tecnico",true);

        // 3. Mostrar resultados por consola usando toString() [5, 8]
        System.out.println("  SISTEMA LLANQUIHUE TOUR ");
        System.out.println(cliente.toString());
        System.out.println(segundoCliente.toString());
        System.out.println(presencial.toString());
        System.out.println(remoto.toString());
    }
}

