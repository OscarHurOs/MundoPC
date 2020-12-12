package com.mundopc.mundopc;

/**
 *
 * @author oahur
 */
public class Teclado extends DispositivoEntrada {

    private int idTeclado;

    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca); //lo primero es apuntar al constructor de la clase padre
        this.idTeclado = ++contadorTeclados;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public static int getContadorTeclados() {
        return contadorTeclados;
    }

    @Override
    public String toString() {
        return super.toString() + "idTeclado=" + idTeclado + '}';
    }

}
