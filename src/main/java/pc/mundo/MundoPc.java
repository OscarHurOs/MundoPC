package pc.mundo;

import com.mundopc.mundopc.*;

/**
 *
 * @author Oscar Hurtado
 */
public class MundoPc {

    public static void main(String[] args) {

        Raton raton1 = new Raton("no se", "microsoft");
        Teclado teclado1 = new Teclado("tampoco se", "genius");
        Monitor monitor1 = new Monitor("Samnsung", 45.5);
        Computadora computadora1 = new Computadora("Gozila", monitor1, teclado1, raton1);

        Pedido pedido = new Pedido();
        pedido.AgregarComputadora(computadora1);

        Raton raton2 = new Raton("no se", "microsoft");
        Teclado teclado2 = new Teclado("tampoco se", "genius");
        Monitor monitor2 = new Monitor("LG", 24);
        Computadora computadora2 = new Computadora("Depredadora", monitor2, teclado2, raton2);

        Pedido pedido2 = new Pedido();

        pedido2.AgregarComputadora(computadora1);
        pedido2.AgregarComputadora(computadora2);

        pedido.mostrarPedido();
        pedido2.mostrarPedido();

    }
}
