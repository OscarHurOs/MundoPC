package com.mundopc.mundopc;

/**
 * Clase que contiene toda la información de un pedido
 *
 * @author Oscar Hurtado
 */
public class Pedido {

    private final int idPedido;

    private static int contadorPedidos;

    private Computadora computadoras[];

    private int contadorComputadoras;

    private static final int MAX_COMPUTADORAS = 10;

    public Pedido() {
        this.idPedido = ++contadorPedidos;
        this.computadoras = new Computadora[Pedido.MAX_COMPUTADORAS];
    }

    public void AgregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras <= Pedido.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Ya ha agregado el maximo de computadoras "
                    + " permitidas en un pedido : " + Pedido.MAX_COMPUTADORAS);
        }
    }

    public void mostrarPedido() {

        System.out.println("Id del pedido " + idPedido);
        System.out.println("Computadoras solicitadas : ");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(computadoras[i].toString());
        }
    }

}
