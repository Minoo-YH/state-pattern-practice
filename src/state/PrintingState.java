package state;

public class PrintingState implements State {

    private Machine machine;

    public PrintingState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void action() {
        System.out.println("Printing ticket");
        machine.setState(new ReadyState(machine));
    }
}
