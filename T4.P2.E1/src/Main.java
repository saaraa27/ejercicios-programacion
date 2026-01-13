import java.util.*;
public class Main {

    private static List<Pelicula> peliculas = new ArrayList<>();
    private static Estudio[] estudios = new Estudio[5];

    public static void main(String[] args) {
        crearEstudios();
        crearPeliculas();
        mostrarEstudioPeliculaMasLarga();
        mostarEstudioCanMasPeliculas();

    }

    public static void crearEstudios() {
        Estudio e1 = new Estudio("Universal Pictures", "Los Angeles", "100 Universal City Plaza", "www.universalpictures.com", java.time.LocalDate.of(1912, 4, 30), "USA", "+1 818-777-1000");
        Estudio e2 = new Estudio("Warner Bros", "Burbank", "4000 Warner Blvd", "www.warnerbros.com", java.time.LocalDate.of(1923, 4, 4), "USA", "+1 818-954-3000");
        Estudio e3 = new Estudio("Paramount Pictures", "Hollywood", "5555 Melrose Ave", "www.paramount.com", java.time.LocalDate.of(1912, 5, 8), "USA", "+1 323-956-5000");
        Estudio e4 = new Estudio("20th Century Fox", "Los Angeles", "10201 W Pico Blvd", "www.20thcenturyfox.com", java.time.LocalDate.of(1935, 5, 31), "USA", "+1 310-369-1000");
        Estudio e5 = new Estudio("Columbia Pictures", "Culver City", "10202 Washington Blvd", "www.sonypictures.com", java.time.LocalDate.of(1918, 6, 19), "USA", "+1 310-244-4000");


        estudios[0] = e1;
        estudios[1] = e2;
        estudios[2] = e3;
        estudios[3] = e4;
        estudios[4] = e5;
    }

    public static void crearPeliculas() {
        ArrayList <Estudio> lista = new ArrayList<>();
        lista.add(estudios[0]);
        lista.add(estudios[1]);
        Pelicula p1 = new Pelicula(lista,"ET", 90, "Ciencia Ficción");

        lista = new ArrayList<>();
        lista.add(estudios[2]);
        Pelicula p2 = new Pelicula(lista,"Titanic", 180, "Drama");

        lista = new ArrayList<>();
        lista.add(estudios[3]);
        lista.add(estudios[4]);
        Pelicula p3 = new Pelicula(lista,"El señor de los anillos", 133, "Ciencia Ficción");

        lista = new ArrayList<>();
        lista.add(estudios[1]);
        Pelicula p4 = new Pelicula(lista,"Avatar", 162, "Ciencia Ficción");


        lista = new ArrayList<>();
        lista.add(estudios[0]);
        lista.add(estudios[1]);
        lista.add(estudios[4]);
        Pelicula p5 = new Pelicula(lista,"La La Land", 128, "Musical");

        peliculas.add(p1);
        peliculas.add(p2);
        peliculas.add(p3);
        peliculas.add(p4);
        peliculas.add(p5);
    }

    public static void mostrarEstudioPeliculaMasLarga() {
        ArrayList <String> lista = new ArrayList<>();
        int peliculaMasLarga = 0;
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > peliculaMasLarga) {
                peliculaMasLarga = pelicula.getDuracion();
                lista.clear();
                for(Estudio estudio : pelicula.getListaEstudios()) {
                    lista.add(estudio.getNombre());
                }

            }
        }
        System.out.println("Los estudios que participaron en la película más larga son " + lista );

    }

    public static void mostarEstudioCanMasPeliculas() {
        HashMap<String, Integer> mapaEstudios = new HashMap<>();
        for (Pelicula pelicula : peliculas) {
            for (Estudio estudio : pelicula.getListaEstudios()) {
                mapaEstudios.put(estudio.getNombre(), mapaEstudios.getOrDefault(estudio.getNombre(), 0) + 1);
            }
        }

        String estudioConMasPeliculas = "";
        int maxPeliculas = 0;
        for (Map.Entry<String, Integer> x : mapaEstudios.entrySet()) {
            if (x.getValue() > maxPeliculas) {
                maxPeliculas = x.getValue();
                estudioConMasPeliculas = x.getKey();
            }
        }
        System.out.println("El estudio con más películas es " + estudioConMasPeliculas + " con " + maxPeliculas + " películas.");
    }
}