package hamburgueria.state;

import hamburgueria.model.Order;

public interface OrderState {
    void next(Order order);
    void cancel(Order order);
    String getStatus();
}
package hamburgueria.state;

import hamburgueria.model.Order;

public class ReceivedState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new PreparingState());
    }

    @Override
    public void cancel(Order order) {
        order.setState(new CancelledState());
    }

    @Override
    public String getStatus() {
        return "Recebido";
    }
}
package hamburgueria.state;

import hamburgueria.model.Order;

public class PreparingState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new ReadyState());
    }

    @Override
    public void cancel(Order order) {
        order.setState(new CancelledState());
    }

    @Override
    public String getStatus() {
        return "Em Preparo";
    }
}
package hamburgueria.state;

import hamburgueria.model.Order;

public class ReadyState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new OnDeliveryState());
    }

    @Override
    public void cancel(Order order) {
        order.setState(new CancelledState());
    }

    @Override
    public String getStatus() {
        return "Pronto";
    }
}
package hamburgueria.state;

import hamburgueria.model.Order;

public class OnDeliveryState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new DeliveredState());
    }

    @Override
    public void cancel(Order order) {
        order.setState(new CancelledState());
    }

    @Override
    public String getStatus() {
        return "Em Rota de Entrega";
    }
}
package hamburgueria.state;

import hamburgueria.model.Order;

public class DeliveredState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Pedido já foi entregue. Não há próximo estado.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Pedido já entregue não pode ser cancelado.");
    }

    @Override
    public String getStatus() {
        return "Entregue";
    }
}
package hamburgueria.state;

import hamburgueria.model.Order;

public class CancelledState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Pedido cancelado não pode avançar.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Pedido já está cancelado.");
    }

    @Override
    public String getStatus() {
        return "Cancelado";
    }
}
