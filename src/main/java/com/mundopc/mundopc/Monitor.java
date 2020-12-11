package com.mundopc.mundopc;

/**
 *
 * @author Oscar Hurtado
 */
public class Monitor {

    private Integer idMonitor;

    private String marca;

    private Double tamano;

    private static Integer contadorMonitores;

    private Monitor() {
        this.idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, Double tamano) {
        this(); //con this llamo al constructor vacío de esta misma clase
        this.marca = marca;
        this.tamano = tamano;
    }

    public Integer getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getTamano() {
        return tamano;
    }

    public void setTamano(Double tamano) {
        this.tamano = tamano;
    }

    public static Integer getContadorMonitores() {
        return contadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamano + '}';
    }

}
