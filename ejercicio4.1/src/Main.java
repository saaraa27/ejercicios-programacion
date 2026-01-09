import java.util.Scanner;
public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa el valor del radio");
        int radio =  sc.nextInt();
        Circulo c1 = new Circulo(radio);


        System.out.println( c1.calcularArea());

        System.out.println(c1.calcularLongitud());

        System.out.println(c1.calcularVolumen());
    }
}