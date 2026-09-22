package state;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.setState(new ReadyState(machine));
        machine.action();
        machine.action();
        machine.setState(new PaymentState());
        machine.action();

    }
}
