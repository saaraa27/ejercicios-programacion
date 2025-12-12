import java.util.Scanner;

public class Main {

    final private static Scanner sc = new Scanner(System.in);
    private static String opcion;

    public static void main(String[] args) {

        menu();
        switch(opcion){

        }

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


}