package state;
import state.State;

public class Machine {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void action() {
        state.action();
    }
}