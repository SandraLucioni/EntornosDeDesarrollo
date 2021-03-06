package main.instalacionesDeportivas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva {

    /**
     * Hora de entrada
     */
    Date inicio;

    /**
     * Hora de salida
     */
    Date fin;

    /**
     * Fecha de la reserva
     */
    Date fecha;

    /**
     * Lista de instalaciones
     */
    List<Instalaciones> instalaciones;

    /**
     * Lista de articulos
     */
    List<Articulos> articulos;

    /**
     * Lista de socios
     */
    List<Socios> socios;

    /**
     * Constructor
     * @param instalaciones
     * @param articulos
     * @param inicio
     * @param fin
     * @param fecha
     */
    public Reserva(Date inicio, Date fin, Date fecha, List<Instalaciones> instalaciones, List<Articulos> articulos) {
        this.inicio = inicio;
        this.fin = fin;
        this.fecha = fecha;
        this.instalaciones = instalaciones;
        this.articulos = articulos;
    }

    /**
     * Añade una instalacion a la lista de instalaciones a reservar
     * @param instalacion
     */
    public void addInstalacion(Instalaciones instalacion) {
        if (this.instalaciones == null)
            this.instalaciones = new ArrayList<>();
        this.instalaciones.add(instalacion);
    }

    /**
     * Añade una articulo a la lista de articulos a reservar
     * @param articulo
     */
    public void addArticulo(Articulos articulo) {
        if (this.articulos == null)
            this.articulos = new ArrayList<>();
        this.articulos.add(articulo);
    }

    /**
     * Añade unas horas de inicio y fin de reserva
     * @param inicio
     * @param fin
     */
    public void Reserva(Date inicio, Date fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    /**
     * Añade una fecha de reserva
     * @param fecha
     */
    public void fechaReserva(Date fecha) {
        this.fecha = fecha;
    }


    /**
     * Añade un socio a la lista de socios
     * @param socio
     */
    public void addSocio(Socios socio) {
        if (this.socios == null)
            this.socios = new ArrayList<>();
        this.socios.add(socio);
    }
}
