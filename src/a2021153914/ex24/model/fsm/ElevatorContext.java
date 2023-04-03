package a2021153914.ex24.model.fsm;

import a2021153914.ex24.model.data.Elevator;
import a2021153914.ex24.model.fsm.states.GroundFloorState;

public class ElevatorContext {// nao pode haver nenhum set aqui, tem de ser feito via transições
    private IElevatorState currentstate;
    private Elevator elevator;//data
    public ElevatorContext(){
        elevator=new Elevator(0);
        currentstate= new GroundFloorState(this,elevator);
    }

    public ElevatorState getCurrentstate() {
        return currentstate.getState();
    }
     void changeState(IElevatorState newstate){// nao ter aqui nada para manter package private, manter acesso separado da ui
        this.currentstate=newstate;
    }
    //transições
    public boolean up(){
        return currentstate.up();
    }
    public boolean down(){
        return currentstate.down();
    }
    //dados
    public int getcurrentfloor(){
        return elevator.getCurretfloor();
    }
}
