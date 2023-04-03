package a2021153914.ex24.model.fsm;

public interface IElevatorState {
    boolean up();
    boolean down();
    ElevatorState getState();
}
