package state;

public class PaymentState implements State {

    private Machine machine;

    public PaymentState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void action() {
        System.out.println("Waiting for payment");
        machine.setState(new PrintingState(machine));
    }
}