package com.mundopc.mundopc;

/**
 *
 * @author Oscar Hurtado
 */
public class Raton extends DispositivoEntrada {

    private final int idRaton;

    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca); //lo primero es apuntar al constructor de la clase padre
        this.idRaton = ++Raton.contadorRatones;
    }

    public int getIdRaton() {
        return idRaton;
    }

    public static int getContadorRatones() {
        return contadorRatones;
    }

    @Override
    public String toString() {
        return super.toString() + "idRaton=" + idRaton + '}';
    }

}
