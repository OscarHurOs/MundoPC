package com.mundopc.mundopc;

/**
 * Clase que contiene toda la información de un pedido
 *
 * @author Oscar Hurtado
 */
public class Pedido {

    private Integer idOrden;

    private Computadora computadora[];

    private Integer contadorOrdenes;

    private Integer contadorComputadoras;

    private static final Integer MAX_COMPUTADORAS = 10;

    public Pedido() {
        this.idOrden = ++contadorOrdenes;
    }

    public void AgregarComputadora(Computadora computadora) {

        if (idOrden <= MAX_COMPUTADORAS) {

        } else {
            System.out.println("Ya a agregado el maximo de computadoras permitidas en un pedido");
        }
    }

    public double calcularTotal() {
        double var = 0;

        return var;
    }

    public void mostrarOrden() {

    }

}
