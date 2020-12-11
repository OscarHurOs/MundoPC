package com.mundopc.mundopc;

/**
 *
 * @author oahur
 */
public class Teclado extends DispositivoEntrada {

    private Integer idTeclado;

    private static Integer contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca); //lo primero es apuntar al constructor de la clase padre
        this.idTeclado = ++contadorTeclados;
    }

    public Integer getIdTeclado() {
        return idTeclado;
    }

    public static Integer getContadorTeclados() {
        return contadorTeclados;
    }

    @Override
    public String toString() {
        return super.toString() + "Teclado{" + "idTeclado=" + idTeclado + '}';
    }

}
