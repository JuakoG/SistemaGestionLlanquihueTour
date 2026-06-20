    package app;

    import service.GestorDatos;

    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
        mostrarMenu();
        }
        private static void mostrarMenu() {
            GestorDatos gestor = new GestorDatos();
            //  cargar datos archivo txt
            gestor.cargarDatos("tour.txt");
            Scanner scanner = new Scanner(System.in);
            boolean salir = false;
            while (!salir) {
                System.out.println("SISTEMA DE GESTION LLANQUIHUE TOUR");
                System.out.println("Seleccione una opcion");
                System.out.println("1.- Ver informacion de personas ");
                System.out.println("2.- Mostrar cantidad de registros");
                System.out.println("3.- Filtrar informacion por Pais");
                System.out.println("4.- Buscar por rut");
                System.out.println("5.- Salir");

                String alternativa = scanner.nextLine();
                switch (alternativa) {
                    case "1":
                        System.out.println("Mostrando personas");
                        gestor.mostrarTodo();

                        break;
                    case "2":
                        System.out.println("Mostrar cantidad de registros");
                        gestor.contarCantidad();
                        break;

                    case "3":
                        System.out.println("Buscar por Pais");
                        System.out.println("Escriba Pais para filtrar");

                        String filtrarPorPais = scanner.nextLine();
                        gestor.buscarPorPais(filtrarPorPais);
                        break;
                    case "4":
                        System.out.println("Buscar por rut");
                        System.out.println("Ingrese rut con puntos y guion ");
                        String filtrarPorRut = scanner.nextLine();

                        gestor.buscarPorRut(filtrarPorRut);
                        break;
                    case "5":
                        System.out.println("Saliendo del programa");
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida");
                }


            }


        }
    }