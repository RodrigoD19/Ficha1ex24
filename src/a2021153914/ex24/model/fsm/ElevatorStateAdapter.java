package a2021153914.ex24.model.fsm;

import a2021153914.ex24.model.data.Elevator;

public abstract class ElevatorStateAdapter implements IElevatorState {// apenas implementos as transições
    protected ElevatorContext context;
    protected Elevator elevator;
    protected ElevatorStateAdapter(ElevatorContext context,Elevator elevator){
        this.context=context;
        this.elevator=elevator;
    }
    protected void changeState(IElevatorState newstate){
        context.changeState(newstate);
    }

    @Override
    public boolean up() {
        return false;
    }

    @Override
    public boolean down() {
        return false;
    }
}
