package hamburgueria.app;

import hamburgueria.model.Order;
import hamburgueria.state.ReceivedState;

public class Main {
    public static void main(String[] args) {
        Order pedido = new Order(1, new ReceivedState());

        System.out.println("Status inicial: " + pedido.getStatus());

        pedido.next(); // Recebido -> Em Preparo
        System.out.println("Status: " + pedido.getStatus());

        pedido.next(); // Em Preparo -> Pronto
        System.out.println("Status: " + pedido.getStatus());

        pedido.next(); // Pronto -> Em Rota de Entrega
        System.out.println("Status: " + pedido.getStatus());

        pedido.next(); // Em Rota -> Entregue
        System.out.println("Status final: " + pedido.getStatus());
    }
}
