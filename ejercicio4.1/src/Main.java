public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(5);

        c1.calcularArea();
        System.out.println(c1.getArea());

        c1.calcularLongitud();
        System.out.println(c1.getLongitud());

        c1.calcularVolumen();
        System.out.println(c1.getVolumen());
    }
}