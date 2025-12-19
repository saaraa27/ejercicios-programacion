import java.util.*;

public class Main {

    final private static Scanner sc = new Scanner(System.in);
    private static String [] especies = {"perro", "gato", "conejo", "tortuga", "loro" };
    private static ArrayList<ArrayList<String>> animalesRescatados = new ArrayList<>();
    private static Map<String, String> asociaciones = new HashMap<String, String>();
    private static Deque<String> colaEspera= new java.util.LinkedList<>();
    private static String respuesta;

    public static void main(String[] args) {
        try {
            do {
                menu();
                switch (respuesta) {
                    case "a":
                        fverEspecies();
                        break;

                    case "b":
                        fagregarrRescatados();
                        break;

                    case "c":
                        fasignarCuidador();
                        break;

                    case "d":
                        fpasarColaEspera();
                        break;

                    case "e":
                        fadoptarAnimal();
                        break;

                    case "f":
                        flistarAnimalesCuidadores();
                        break;

                    case "g":
                        System.out.println("Saliendo del programa...");
                        System.exit(0);

                    default:
                        System.out.println("Opcion no valida");
                        ;
                        break;
                }

            } while (!respuesta.equals("g"));
        }catch (Exception e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }


    public static void menu(){
        System.out.println("a) Ver especies aceptadas.\n" +
                "b) Agregar un nuevo animal al listado de rescatados.\n" +
                "c) Asignar un cuidador a un animal.\n" +
                "d) Pasar un animal a la cola de espera de adopcion. ´\n" +
                "e) Adoptar un animal.\n" +
                "f) Lista todos los animales y sus cuidadores actuales.\n" +
                "g) Salir\n");
        System.out.print("Introduce una opcion: ");
        respuesta = sc.nextLine().toLowerCase();
    }

    public static void fverEspecies(){
        System.out.println("Especies aceptadas:");
        for (String especie : especies) {
            System.out.println("- " + especie);
        }
    }

    public static void fagregarrRescatados() {
        List<String> especiesList = Arrays.asList(especies);
        String respuesta;
        do {
            ArrayList<String> fila1 = new ArrayList<>();
            System.out.println("Introduce el nombre");
            String nombre = sc.nextLine();
            fila1.add(nombre);

            ArrayList<String> fila2 = new ArrayList<>();
            System.out.println("Introduce la especie: ");
            String especie = sc.nextLine();
            if(especiesList.contains(especie)) {
                System.out.println("Especie valida");
                fila2.add(especie);

                animalesRescatados.add(fila1);
                animalesRescatados.add(fila2);
            }
            else {
                System.out.println("Especie no valida");
            }


            System.out.println("Quiere introducir otro animal rescatado? (s/n)");
            respuesta = sc.nextLine().toLowerCase();

        }while (respuesta.equalsIgnoreCase("s"));
    }

    public static void fasignarCuidador() {
        System.out.println("Introduce el nombre del animal al que quieres asignar un cuidador:");
        String nombreAnimal = sc.nextLine();

        boolean encontrado = false;
        for (ArrayList<String> animal : animalesRescatados) {
            if (animal.get(0).equalsIgnoreCase(nombreAnimal)) {
                System.out.println("Introduce el nombre del cuidador:");
                String nombreCuidador = sc.nextLine();
                asociaciones.put(nombreAnimal, nombreCuidador);
                System.out.println("Cuidador asignado correctamente.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Animal no encontrado en la lista de rescatados.");
        }
    }

    public static void fpasarColaEspera(){
        System.out.println("Introduce el nombre del animal que quieres pasar a la cola de espera de adopcion:");
        String nombreAnimal = sc.nextLine();

        boolean encontrado = false;
        for (ArrayList<String> animal : animalesRescatados) {
            if (animal.get(0).equalsIgnoreCase(nombreAnimal)) {
                animalesRescatados.remove(nombreAnimal);
                colaEspera.add(nombreAnimal);
                System.out.println("El animal ha sido pasado a la cola de espera de adopcion.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Animal no encontrado en la lista de rescatados.");
        }

    }

    public static void fadoptarAnimal(){
        System.out.println("Introduce el nombre del animal que quieres adoptar");
        String nombreAnimal = sc.nextLine();

        boolean encontrado = false;
        for (String animal : colaEspera) {
            if (animal.equalsIgnoreCase(nombreAnimal)) {
                colaEspera.remove(nombreAnimal);
                System.out.println("El animal ha sido adoptado correctamente.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Animal no encontrado en la cola de espera.");
        }
    }

    public static void flistarAnimalesCuidadores(){
        System.out.println("Lista de animales y sus cuidadores actuales:");
        for (Map.Entry<String, String> entry : asociaciones.entrySet()) {
            System.out.println("Animal: " + entry.getKey() + ", Cuidador: " + entry.getValue());
        }
    }

}