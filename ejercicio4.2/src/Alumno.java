public class Alumno {
    private String codigo;
    private String nombre;
    private String domicilio;
    private String telefono;

    public Alumno(String codigo, String nombre, String domicilio, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String toString() {
        return "Alumno (Codigo: " + codigo + ", Nombre: " + nombre + ", Domicilio: " + domicilio + ", Telefono: " + telefono + ")";
    }
}
