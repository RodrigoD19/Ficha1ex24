package a2021153914.ex24.model.fsm.states;

import a2021153914.ex24.model.data.Elevator;
import a2021153914.ex24.model.fsm.ElevatorContext;
import a2021153914.ex24.model.fsm.ElevatorState;
import a2021153914.ex24.model.fsm.ElevatorStateAdapter;
import a2021153914.ex24.model.fsm.states.FirstFloorState;

public class SecondFloorState extends ElevatorStateAdapter {

    public SecondFloorState(ElevatorContext context, Elevator elevator) {
        super(context, elevator);
        elevator.setCurretfloor(2);
    }

    @Override
    public boolean down() {
        changeState(new FirstFloorState(context,elevator));
        return true;
    }

    @Override
    public ElevatorState getState() {
        return ElevatorState.SECOND_FLOOR;
    }
}
