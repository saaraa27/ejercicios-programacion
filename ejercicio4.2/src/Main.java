import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static List<Alumno> listaClase = new ArrayList<>();

    public static void main(String[] args) {
        String respuesta;
        do {
            System.out.println("ingrese su codigo:");

            String codigo = sc.nextLine();
            System.out.println("ingrese su nombre:");
            String nombre = sc.nextLine();
            System.out.println("ingrese su domicilio:");
            String domicilio = sc.nextLine();
            System.out.println("ingrese su telefono:");
            String telefono = sc.nextLine();

            Alumno a = new Alumno(codigo, nombre, domicilio, telefono);
            listaClase.add(a);

            System.out.println("quiere ingresra otro alumno? s/n");
            respuesta = sc.nextLine().toLowerCase();
        }while(respuesta.equalsIgnoreCase("s"));

        System.out.println("introduzca el codigo del alumno a buscar:");
        int codigoBuscado = sc.nextInt();
        for (Alumno a : listaClase) {
            if (a.getCodigo().equals(String.valueOf(codigoBuscado))) {
                System.out.println(a.toString());
            }
            else {System.out.println("alumno no encontrado");
            }
        }


    }
}