import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class Main {

    final private static Scanner sc = new Scanner(System.in);
    private static int opcion;
    private static Set<String> porteros = new LinkedHashSet<>();
    private static Set<String> defensas = new LinkedHashSet<>();
    private static Set<String> delanteros = new LinkedHashSet<>();
    private static Set<String> centrocampistas = new LinkedHashSet<>();


    public static void main(String[] args) {
        do {
            menu();
            switch (opcion) {
                case 1:
                    altaJugador();
                    break;
                case 2:
                    bajaJugador();
                    break;
                case 3:
                    modificarJugador();
                    break;
                case 4:
                    mostrar();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);
    }

    public static void menu() {
        System.out.println("1. Alta jugador");
        System.out.println("2. Baja jugador");
        System.out.println("3. Modificar jugador");
        System.out.println("4. Mostrar todos los jugadores");
        System.out.println("5. Salir");
        opcion = sc.nextInt();
        sc.nextLine();
    }

    public static void altaJugador() {
        System.out.print("Introduce nombre del jugador: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce la posicion (portero, defensa, delantero, centrocampista): ");
        String posicion = sc.nextLine().toLowerCase();
        Pattern pattern = Pattern.compile("portero|defensa|delantero|centrocampista");
        if (!pattern.matcher(posicion).matches()){
            System.out.println("posicion incorrecto.");
        } else {
            switch (posicion) {
                case "portero":
                    porteros.add(nombre);
                    break;
                case "defensa":
                    defensas.add(nombre);
                    break;
                case "delantero":
                    delanteros.add(nombre);
                    break;
                case "centrocampista":
                    centrocampistas.add(nombre);
                    break;
            }
        }
    }

    public static void bajaJugador() {
        System.out.print("Introduce nombre del jugador a eliminar: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce la posicion (portero, defensa, delantero, centrocampista): ");
        String posicion = sc.nextLine().toLowerCase();
        Pattern pattern = Pattern.compile("portero|defensa|delantero|centrocampista");
        if (!pattern.matcher(posicion).matches()) {
            System.out.println("posicion incorrecto.");
        } else {
            switch (posicion) {
                case "portero":
                    porteros.remove(nombre);
                    break;
                case "defensa":
                    defensas.remove(nombre);
                    break;
                case "delantero":
                    delanteros.remove(nombre);
                    break;
                case "centrocampista":
                    centrocampistas.remove(nombre);
                    break;
            }
        }
    }

    public static void modificarJugador() {
        System.out.print("Introduce nombre actual del jugador: ");
        String nombreViejo = sc.nextLine();

        System.out.print("Introduce la posicion vieja (portero, defensa, delantero, centrocampista): ");
        String posicionVieja = sc.nextLine().toLowerCase();
        Pattern pattern = Pattern.compile("portero|defensa|delantero|centrocampista");
        if (!pattern.matcher(posicionVieja).matches()) {
            System.out.println("posicion incorrecto.");
        } else {
            System.out.print("Introduce nuevo nombre: ");
            String nombreNuevo = sc.nextLine();
            switch (posicionVieja) {
                case "portero":
                    porteros.remove(nombreViejo);
                    porteros.add(nombreNuevo);
                    break;

                case "defensa":
                    defensas.remove(nombreViejo);
                    defensas.add(nombreNuevo);
                    break;

                case "delantero":
                    delanteros.remove(nombreViejo);
                    delanteros.add(nombreNuevo);
                    break;

                case "centrocampista":
                    centrocampistas.remove(nombreViejo);
                    centrocampistas.add(nombreNuevo);
                    break;
            }
        }
    }


    public static void mostrar() {
        System.out.println("Porteros: " + porteros);
        System.out.println("Defensas: " + defensas);
        System.out.println("Delanteros: " + delanteros);
        System.out.println("Centrocampistas: " + centrocampistas);
    }
}
