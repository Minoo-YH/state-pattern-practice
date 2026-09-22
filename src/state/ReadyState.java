package state;

public class ReadyState implements State {

    @Override
    public void action() {
        System.out.println("Machine is ready");
    }
}