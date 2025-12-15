import java.util.Map;
import java.util.Scanner;

public class Main {

    final private static Scanner sc = new Scanner(System.in);
    private static Map<String, Integer> agenda;
    private static int opcion;

    public static void main(String[] args) {
        do{
            menu();
            switch(opcion){
                case 1:
                    añadirNumero();
                    break;
                case 2:
                    borrarNumero();
                    break;
                case 3:
                    buscarNumero();
                    break;
                case 4:
                    borrarNombre();
                    break;
                case 5:
                    buscarNombre();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida.");
            }

    }while(opcion!=6);
    }

    public static void menu(){
        System.out.println("1.- Anadir un nuevo numero. \n" +
                "2.- Borrar un numero. \n" +
                "3.- Buscar un numero. \n" +
                "4.- Borrar por nombre.\n" +
                "5.- Buscar por nombre.\n" +
                "6.- Salir.\n");
        opcion = sc.nextInt();
    }

    public static void añadirNumero() {
        String respuesta;
        do {
            System.out.println("Introduce el nombre:");
            String nombre = sc.next();
            System.out.println("Introduce el numero:");
            int numero = sc.nextInt();
            agenda.put(nombre, numero);

            System.out.println("Quieres introducir un contacto mas? (si/no)");
            respuesta = sc.next();
        }while(respuesta.equalsIgnoreCase("si"));
    }


    public static void borrarNumero(){
        System.out.println("Introduce el numero del contacto a borrar:");
        int numero = sc.nextInt();
        if(agenda.containsKey(numero)){
            agenda.remove(numero);
            System.out.println("Contacto borrado.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }


    public static void buscarNumero(){
        System.out.println("Introduce el numero del contacto a buscar:");
        int numero = sc.nextInt();
        if(agenda.containsKey(numero)){
            System.out.println("Contacto encontrado: " + agenda.get(numero));
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }


    public static void borrarNombre() {
        System.out.println("Introduce el nombre del contacto a borrar:");
        String nombre = sc.next();
        if(agenda.containsKey(nombre)){
            agenda.remove(nombre);
            System.out.println("Contacto borrado.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }


    public static void buscarNombre() {
        System.out.println("Introduce el nombre del contacto a buscar:");
        String nombre = sc.next();
        if(agenda.containsKey(nombre)){
            System.out.println("Contacto encontrado: " + agenda.get(nombre));
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }


}