package a2021153914.ex24.model.fsm.states;

import a2021153914.ex24.model.data.Elevator;
import a2021153914.ex24.model.fsm.ElevatorContext;
import a2021153914.ex24.model.fsm.ElevatorState;
import a2021153914.ex24.model.fsm.ElevatorStateAdapter;

public class GroundFloorState extends ElevatorStateAdapter {
    public GroundFloorState(ElevatorContext context, Elevator elevator) {
        super(context, elevator);
        elevator.setCurretfloor(0);// isto é uma situação rara de se fazer
    }

    @Override
    public boolean up() {
        changeState(new FirstFloorState(context,elevator));
        return true;
    }

    @Override
    public ElevatorState getState() {
        return ElevatorState.GROUND_FLOOR;
    }
}
