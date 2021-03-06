package main.biblioteca;


import java.util.ArrayList;
import java.util.List;

/**
 * Una <code>Biblioteca</code> que presta libros durante un determinado tiempo.
 *
 * @author Sandra L
 * @version 1.0
 * @see Autores
 * @see Copia
 * @since 1.0
 */
public class Libro {
    /**
     * Nombre del libro
     */
    String titulo;
    /**
     * Nombre de la editorial
     */
    String editorial;
    /**
     * Año de publicacion
     */
    Integer year;
    /**
     * Genero del libro
     */
    Genero tipo;
    /**
     * Lista de autores
     */
    List<Autores> autores;
    /**
     * Lista de copias de los libros
     */
    List<Copia> copia;


    /**
     * Constructor vacio
     */
    public Libro() {
        this.autores = new ArrayList<>(autores);
    }

    /**
     * Constructor con todos los atributos:
     *
     * @param titulo
     * @param editorial
     * @param year
     * @param autores
     * @param copia
     */
    public Libro(String titulo, String editorial, Integer year, Genero tipo, List<Autores> autores, List<Copia> copia) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.year = year;
        this.tipo = tipo;
        this.autores = autores;
        this.copia = copia;
    }


    /**
     * @see Libro#mostrar()
     */
    public String mostrar() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", year=" + year +
                ", tipo=" + tipo +
                ", autores=" + autores +
                ", copia=" + copia +
                '}';
    }

    /**
     * Añade un autor a la lista de autores
     *
     * @param autor
     */
    public void addAutor(Autores autor) {
        if (this.autores == null)
            this.autores = new ArrayList<>();
        this.autores.add(autor);
    }

    /**
     * Añade una Copia a la lista de copias
     *
     * @param copia
     */
    public void addCopia(Copia copia) {
        if (this.copia == null)
            this.copia = new ArrayList<>();
        this.copia.add(copia);
    }


}
