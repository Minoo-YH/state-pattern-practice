package state;

public class PaymentState implements State {

    @Override
    public void action() {
        System.out.println("Waiting for payment");
    }
}