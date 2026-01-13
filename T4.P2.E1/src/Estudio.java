import java.time.LocalDate;

public class Estudio {

    private String nombre;
    private String ciudad;
    private String direccion;
    private String direccionWeb;
    private LocalDate fechaFundacion;
    private String pais;
    private String telefono;

    public Estudio(String nombre, String ciudad, String direccion, String direccionWeb, LocalDate fechaFundacion, String pais, String telefono) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.direccionWeb = direccionWeb;
        this.fechaFundacion = fechaFundacion;
        this.pais = pais;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }
}
