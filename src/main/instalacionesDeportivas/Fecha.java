package main.instalacionesDeportivas;

import java.sql.Date;

public class Fecha {
    /**
     * Hora inicial de la reserva
     */
    Date horaInicio;

    /**
     * Hora final de la reserva
     */
    Date horaFinal;


    /**
     * Constructor con todos los atributos:
     * @param horaInicio
     * @param horaFinal
     */
    public Fecha(Date horaInicio, Date horaFinal) {
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }


    /**
     * Sobrescribe el método de la clase madre
     * @see Fecha#toString()
     */
    @Override
    public String toString() {
        return "Fecha{" +
                "horaInicio=" + horaInicio +
                ", horaFinal=" + horaFinal +
                '}';
    }


}
