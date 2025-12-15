import java.util.Deque;
import java.util.Scanner;

public class Main {

    final private static Scanner sc = new Scanner(System.in);
    private static Deque<String> pilaLibros= new java.util.LinkedList<>();
    private static String opcion;

    public static void main(String[] args) {
        do {
            menu();
            switch (opcion) {
                case "a":
                    anadirLibro();
                    break;
                case "b":
                    eliminarSuperior();
                    break;
                case "c":
                    parteInferior();
                    break;
                case "d":
                    mostrarLibros();
                    break;
                case "e":
                    verificarVacia();
                    break;
                case "f":
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida.");

            }
        }while (opcion != "f");

    }

    public static void menu(){
        System.out.println("a) Anadir un libro a la pila: Solicitar al usuario el tıtulo del libro y colocarlo en la parte superior de la pila.\n" +
                "b) Consultar el libro en la parte superior: Mostrar el tıtulo del libro que esta en la parte superior sin eliminarlo.\n" +
                "c) Retirar el libro en la parte superior: Eliminar el libro de la parte superior de la pila y mostrar su t´ıtulo.\n" +
                "d) Mostrar todos los libros en la pila: Listar todos los libros, desde el mas reciente hasta el mas antiguo.\n" +
                "e) Verificar si la pila esta vacıa: Informar al usuario si no hay libros en la pila.\n" +
                "f) Salir del programa");
        opcion = sc.nextLine();

    }


    public static void anadirLibro(){
        System.out.println("Ingrese el nombre del libro: ");
        String nombreLibro = sc.nextLine();
        pilaLibros.add(nombreLibro);
    }



    public static void eliminarSuperior(){
        System.out.println("El libro eliminado de la parte superior es: " + pilaLibros.removeFirst());
    }


    public static void parteInferior(){
        System.out.println("El libro en la parte inferior es: " + pilaLibros.getLast());
    }


    public static void mostrarLibros(){
        for(String libro : pilaLibros){
            System.out.println(libro);
        }
    }


    public static void verificarVacia(){
        if(pilaLibros.isEmpty()){
            System.out.println("La pila esta vacia.");
        } else {
            System.out.println("La pila no esta vacia.");
        }
    }


}