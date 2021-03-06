package main.biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Autores {

    /**
     * Nombre del autor
     */
    private String nombre;

    /**
     * Nacionalidad del autor
     */
    private String nacionalidad;

    /**
     * Fecha de nacimiento del autor
     */
    private Date fechaNacimiento;

    /**
     * Lista de libros
     */
    private List<Libro> libros;


    /**
     * Constructor
     *
     * @param nombre
     * @param nacionalidad
     * @param fechaNacimiento
     * @param libros
     */
    public Autores(String nombre, String nacionalidad, Date fechaNacimiento, List<Libro> libros) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.libros = libros;
    }

    /**
     * @see Autores#mostrar()
     */
    public String mostrar() {
        return "Autores{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", libros=" + libros +
                '}';
    }

    /**
     * Añade un libro a la lista de autores
     *
     * @param libro
     */
    public void addLibro(Libro libro) {
        if (this.libros == null)
            this.libros = new ArrayList<>();
        this.libros.add(libro);
    }
}
