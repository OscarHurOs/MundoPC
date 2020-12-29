package com.mundopc.mundopc;

/**
 *
 * @author Oscar Hurtado
 */
public class Teclado extends DispositivoEntrada {

    private final int idTeclado;

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
