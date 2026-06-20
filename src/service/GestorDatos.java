package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Empleado;
import model.Persona;
import model.Direccion;

public class GestorDatos {

    private ArrayList<Persona> listaDatos = new ArrayList<>();

    public void cargarDatos(String rutaArchivo) {  //m
        try {
            File archivo = new File(rutaArchivo); // abre archivo
            Scanner lector = new Scanner(archivo); // lee archivo

            while (lector.hasNextLine()) {
                String[] partes = lector.nextLine().split(";");
                // CLIENTE
                if (partes.length == 9) {
                    Direccion d = new Direccion(partes[5], partes[6], partes[7], partes[8]);
                    Persona p = new Persona(partes[1], Integer.parseInt(partes[2]), partes[3], partes[4], d);

                    listaDatos.add(p);
                }

                // EMPLEADO
                if (partes.length == 11) {

                    Direccion d = new Direccion(partes[5], partes[6], partes[7], partes[8]);
                    Empleado e = new Empleado(partes[1], Integer.parseInt(partes[2]), partes[3], partes[4], d, partes[9], Boolean.parseBoolean(partes[10]));

                    listaDatos.add(e);
                }
            }
            lector.close();
        } catch(FileNotFoundException e){
            System.out.println("El archivo tour.txt no se encontro.");
        } catch (IOException e ) {
            System.out.println("Error en la carga: " + e.getMessage());
        }
    }

    public void mostrarTodo() { //m
        listaDatos.forEach(System.out::println);
    }

    public void contarCantidad() {
        System.out.println("Total de registros: " + listaDatos.size());
    }

    public void buscarPorPais(String pais) {

        System.out.println("Listado de personas del país " + pais + ":");

        boolean encontrado = false;
        for (Persona p : listaDatos) {

            if (p.getDireccion().getPais().equalsIgnoreCase(pais)){
                System.out.println(p);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No existen coincidencias de paises");
        }

    }

    public void buscarPorRut(String rut) {

        System.out.println("Resultados de búsqueda para el rut " + rut + ":");
        boolean encontrado = false;
        for (Persona p : listaDatos) {

            if (p.getRut().equalsIgnoreCase(rut)) {
                {
                    System.out.println(p);
                }
                encontrado = true;
            }

            }  if (!encontrado) {
            System.out.println("Rut no encontrado");

        }
    }

}