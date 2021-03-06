package main.biblioteca;

public class Copia {

    /**
     * Código de referencia del libro
     */
    int referencia;

    /**
     * Enumerado sobre el estado de la copia
     */
    EstadoCopia estado;

    /**
     * Libro referencia
     */
    Libro libro;


    /**
     * Constructor
     *
     * @param referencia
     * @param estado
     * @param libro
     */
    public Copia(int referencia, EstadoCopia estado, Libro libro) {
        this.referencia = referencia;
        this.estado = estado;
        this.libro = libro;
    }

    /**
     * Sobrescribe el método de la clase madre
     *
     * @see Copia#mostrar()
     */
    public String mostrar() {
        return "Copia{" +
                "referencia=" + referencia +
                ", estado=" + estado +
                ", libro=" + libro +
                '}';
    }


    /**
     * Método para conocer el estado de la copia
     */
    public void estadoCopia(EstadoCopia estado) {

        if (estado == EstadoCopia.PRESTADO) {
            System.out.println("Está en la biblioteca");
            if (estado == EstadoCopia.PRESTADO)
                System.out.println("Está prestado");
            if (estado == EstadoCopia.REPARACION)
                System.out.println("Está en reparación.");
            else
                System.out.println("Tiene retaraso.");
        }
    }
}
