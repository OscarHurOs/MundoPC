package com.mundopc.mundopc;

/**
 *
 * @author Oscar Hurtado
 */
public class Raton extends DispositivoEntrada {

    private Integer idRaton;

    private static Integer contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca); //lo primero es apuntar al constructor de la clase padre
        this.idRaton = ++contadorRatones;
    }

    public Integer getIdRaton() {
        return idRaton;
    }

    public static Integer getContadorRatones() {
        return contadorRatones;
    }

    @Override
    public String toString() {
        return super.toString() + "Raton{" + "idRaton=" + idRaton + '}';
    }

}
