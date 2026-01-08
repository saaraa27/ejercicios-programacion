public class Circulo {
    private int radio;
    private double area;
    private double longitud;
    private double volumen;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    void calcularLongitud(){ longitud = 2 * Math.PI * radio; }

    void calcularArea(){ area = Math.PI * (radio * 2);}

    void calcularVolumen(){ volumen = (4 * Math.PI * radio * radio * radio / 3);}
}