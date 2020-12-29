package com.mundopc.mundopc;

/**
 *
 * @author Oscar Hurtado
 */
public class Monitor {

    private final int idMonitor;

    private static int contadorMonitores;

    private String marca;

    private double tamanio;

    private Monitor() {
        this.idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamanio) {
        this(); //con this llamo al constructor vacío de esta misma clase
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    @Override
    public String toString() {
        return " Monitor{ " + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamanio + '}';
    }

}
