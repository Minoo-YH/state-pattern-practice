package state;

public class ReadyState implements State {

    private Machine machine;

    public ReadyState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void action() {
        System.out.println("Machine is ready");
        machine.setState(new TicketSelectionState(machine));
    }
}