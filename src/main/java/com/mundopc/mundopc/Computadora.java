package com.mundopc.mundopc;

/**
 * Clase con los atributos de la computadora
 *
 * @author OscarHurtado
 */
public class Computadora {

    private Integer idComputadora;

    private String nombre;

    private Monitor monitor;

    private Teclado teclado;

    private Raton raton;

    private Computadora() {

    }

    private Computadora(String nombre, Monitor monitor,
            Teclado teclado, Raton raton) {

    }

    public Integer getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }

}
