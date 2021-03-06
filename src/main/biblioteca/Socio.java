package main.biblioteca;


public class Socio {

    /**
     * Número de socio
     */
    int numero;

    /**
     * Nombre del socio
     */
    String nombre;

    /**
     * Dirección del socio
     */
    String direccion;

    /**
     * Teléfono del socio
     */
    String telefono;

    /**
     * Conocer si socio es sancionado
     */
    boolean sancionado;


    /**
     * Constructor vacio
     */
    public Socio() {
    }


    /**
     * Constructor con todos los atributos:
     *
     * @param numero
     * @param nombre
     * @param direccion
     * @param telefono
     */
    public Socio(int numero, String nombre, String direccion, String telefono) {
        this.numero = numero;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }


    /**
     * Método booleano para saber si el estado del
     * lector es sancionado.
     */
    public Boolean isSancionado() {
        if (sancionado)
            return true;
        else
            return false;
    }


    /**
     * @see Socio#mostrar()
     */
    public String mostrar() {
        return "Socio{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }


}

