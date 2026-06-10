package hamburgueria.model;
package hamburgueria.model;

import hamburgueria.state.OrderState;

public class Order {
    private int id;
    private OrderState state;

    public Order(int id, OrderState initialState) {
        this.id = id;
        this.state = initialState;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void next() {
        state.next(this);
    }

    public void cancel() {
        state.cancel(this);
    }

    public String getStatus() {
        return state.getStatus();
    }
}
