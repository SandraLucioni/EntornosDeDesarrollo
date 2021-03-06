package main.biblioteca;

import java.util.Date;

public class Prestamo {

    /**
     * Fecha de inicio del préstamo
     */
    private Date inicio;

    /**
     * Fecha fin del préstamo
     */
    private Date fin;

    /**
     * Constructor
     * @param fin
     * @param inicio
     */
    public Prestamo(Date inicio, Date fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    /**
     * Método para ponerle un límite de 3 libros,
     * Devuelve flase si es mayor.
     */
    public boolean BlockPrestamo() {
        int numeroLibros = 0;
        if (numeroLibros > 3)
            return true;
        else
            return false;
    }

    /**
     * @see Prestamo#mostrar()
     */

    public String mostrar() {
        return "Prestamo{" +
                "inicio=" + inicio +
                ", fin=" + fin +
                '}';
    }
}
