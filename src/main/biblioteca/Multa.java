package main.biblioteca;

import java.util.Calendar;
import java.util.Date;

public class Multa {
    /**
     * Fecha de inicio de cuando empieza la multa
     */
    Date inicio;
    /**
     * Fecha de fin de la multa cuando han pasado 30 días
     */
    Date fin;

    /**
     * Constructor con todos los atributos:
     *
     * @param inicio setFechaFin()
     */
    public Multa(Date inicio) {
        this.inicio = inicio;
        setFechaFin();
    }

    /**
     * @see Multa#mostrar()
     */
    public String mostrar() {
        return "Multa{" +
                "inicio=" + inicio +
                ", fin=" + fin +
                '}';
    }

    /**
     * Método setFechaFin para que, pasados 30 días
     * sancionar al lector
     */
    private void setFechaFin() {
        Calendar c = Calendar.getInstance();
        c.setTime(this.inicio);
        c.add(Calendar.DATE, 30);
        this.fin = c.getTime();
    }

    /**
     * Método Booleano isSancionado para saber si
     * el lector está sancionado o no.
     */
    public boolean isSancionado() {
        return new Date().before(this.fin);
    }


}
