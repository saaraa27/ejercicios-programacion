import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    final private static Scanner sc = new Scanner(System.in);
    private static Map<String, Double> gastosPorMes;

    public static void main(String[] args) {
        gastosPorMes = new HashMap<>();

        fdatos();
        fmostrar();
    }

    public static void fdatos(){
        Pattern pattern = Pattern.compile("^(enero|febrero|marzo|abril|mayo|junio|julio|agosto|septiembre|octubre|noviembre|diciembre)$");
        String continuar;
        String mes;

        do {
            System.out.print("Introduce el día: ");
            int dia = sc.nextInt();
            sc.nextLine();

            do{
                System.out.print("Introduce el mes (en letra): ");
                mes = sc.nextLine().toLowerCase();
                Matcher matcher = pattern.matcher(mes);
                if (matcher.matches()) {
                System.out.println("Mes válido.");}
                else {
                System.out.println("Mes no válido. Inténtalo de nuevo.");}
            }while (!pattern.matcher(mes).matches());

            System.out.print("Introduce la cantidad pagada: ");
            Double cantidad = sc.nextDouble();
            sc.nextLine();

            gastosPorMes.put(mes, gastosPorMes.getOrDefault(mes, 0.0) + cantidad);

            System.out.print("¿Quieres introducir otro pago? (s/n): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("s"));
    }


    public static void fmostrar(){
        System.out.println(gastosPorMes.toString());
    }

}