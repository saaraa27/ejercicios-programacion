import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    final private static Scanner sc = new Scanner(System.in);
    private static Queue<String > lista = new ArrayDeque<>();
    private static Queue<LocalDate> lista2 = new ArrayDeque<>();
    private static LocalDate fecha2;

    public static void main(String[] args) {
        try{
        fDatos();
        fSolicitarFecha();
        fEliminarProductos();
        fMostar();

    }catch (Exception e){
        System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

    public static void fDatos () {
        String respuesta;
        do {
            try {
                nombre();
            }catch (NullPointerException e){
                System.out.println("Error al introducir el nombre del producto");
            }

            try{
            fecha();
            }catch (DateTimeParseException e){
                System.out.println("Error al introducir la fecha del producto:");
            }

            do{
                System.out.println("Quiere introducir otro producto? (s/n)");
                respuesta = sc.nextLine();
            }while (!respuesta.equals("s") && !respuesta.equals("n"));

        }while (respuesta.equals("s"));
    }

    public static void fSolicitarFecha (){
        try {
            System.out.println("Introduce la fecha a partir de la cual quiere eliminar los productos");
            String fechaSolicitada = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            fecha2 = LocalDate.parse(fechaSolicitada, formatter);
        }catch (DateTimeParseException e){
            System.out.println("Error al introducir la fecha:");
        }
    }

    public static void fEliminarProductos (){
        while (!lista.isEmpty() && !lista2.isEmpty()){
            LocalDate fechaProducto = lista2.peek();
            if (fechaProducto.isBefore(fecha2) || fechaProducto.isEqual(fecha2)){
                lista.poll();
                lista2.poll();
            } else {
                break;
            }
        }
    }

    public static void fMostar(){
            for (String producto : lista) {
                System.out.print("Producto " + producto);
            }
            for (LocalDate fecha : lista2) {
                System.out.print("Con fecha " + fecha);
            }
    }




    public static void nombre(){
        System.out.print("Introduce el nombre del producto");
        String nombreProducto = sc.nextLine();
        lista.offer(nombreProducto);
    }

    public static void fecha(){
        System.out.println("Introduce la fecha de caducidad del producto");
        String fechaCaducidad = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(fechaCaducidad, formatter);
        lista2.offer(fecha);
    }

}