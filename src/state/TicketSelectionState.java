package state;

public class TicketSelectionState implements State {

    private Machine machine;

    public TicketSelectionState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void action() {
        System.out.println("Selecting ticket");

        machine.setState(new PaymentState());
    }
}