package main.instalacionesDeportivas;

import java.util.List;

public class Socios {

    /**
     * Nombre del socio
     */
    String nombre;

    /**
     * Direccion del socio
     */
    String direccion;

    /**
     * Nombre de la ciudad
     */
    String ciudad;

    /**
     * Nombre de la provincia
     */
    String provincia;

    /**
     * Numero de telefono
     */
    Integer telefono;

    /**
     * Cuota a pagar
     */
    Integer cuota;

    /**
     * Lista de Socios
     */
    List<Socios> socios;


    /**
     * Constructor con todos los atributos:
     * @param nombre
     * @param direccion
     * @param ciudad
     * @param provincia
     * @param telefono
     * @param cuota
     */
    public Socios(String nombre, String direccion, String ciudad, String provincia, Integer telefono, Integer cuota) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.telefono = telefono;
        this.cuota = cuota;
    }


    /**
     * Sobrescribe el método de la clase madre
     * @see Socios#toString()
     */
    @Override
    public String toString() {
        return "Socios{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", telefono=" + telefono +
                ", cuota=" + cuota +
                '}';
    }


    /**
     * Metodo de añadir socios
     */
    public void addSocio(Socios socios) {
        Socios s = new Socios(nombre,direccion,ciudad,provincia,telefono,cuota);
            this.socios.add(s);
    }


}
