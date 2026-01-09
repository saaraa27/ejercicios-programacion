public class Circulo {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double calcularLongitud(){ return 2 * Math.PI * radio; }

    public double calcularArea(){ return Math.PI * (radio * radio);}

    public double calcularVolumen(){ return  (4 * Math.PI * radio * radio * radio / 3);}
}