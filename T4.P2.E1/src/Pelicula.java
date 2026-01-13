import java.util.List;

public class Pelicula {

    private String titulo;
    private int duracion;
    private String tipo;

    private List<Estudio> listaEstudios;


    public Pelicula(List<Estudio> listaEstudios, String titulo, int duracion, String tipo) {
        this.listaEstudios = listaEstudios;
        this.titulo = titulo;
        this.duracion = duracion;
        this.tipo = tipo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Estudio> getListaEstudios() {
        return listaEstudios;
    }

    public void setListaEstudios(List<Estudio> listaEstudios) {
        this.listaEstudios = listaEstudios;
    }
}
