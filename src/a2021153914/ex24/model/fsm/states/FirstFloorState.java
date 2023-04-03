package a2021153914.ex24.model.fsm.states;

import a2021153914.ex24.model.data.Elevator;
import a2021153914.ex24.model.fsm.ElevatorContext;
import a2021153914.ex24.model.fsm.ElevatorState;
import a2021153914.ex24.model.fsm.ElevatorStateAdapter;

public class FirstFloorState extends ElevatorStateAdapter {


    public FirstFloorState(ElevatorContext context, Elevator elevator) {
        super(context, elevator);
        elevator.setCurretfloor(1);
    }

    @Override
    public boolean up() {
        changeState(new SecondFloorState(context,elevator));
        return true;
    }

    @Override
    public boolean down() {
        changeState(new GroundFloorState(context,elevator));
        return true;
    }

    @Override
    public ElevatorState getState() {
        return ElevatorState.FIRST_FLOOR;
    }
}
