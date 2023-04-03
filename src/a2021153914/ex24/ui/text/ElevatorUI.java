package a2021153914.ex24.ui.text;

import a2021153914.ex24.model.fsm.ElevatorContext;

public class ElevatorUI {
    ElevatorContext fsm;
    public ElevatorUI(ElevatorContext fsm){
        this.fsm=fsm;
    }

    public void startprog(){
        int op;
        do{
            System.out.println("Elevator Current Floor:"+fsm.getcurrentfloor());
            op=PAInput.chooseOption("Elevator","Up","Down","Quit");
            switch (op){
                case 1->fsm.up();
                case 2->fsm.down();
            }
        }while (op!=3);
    }
    boolean finish=false;
    public void start(){
        while (!finish){
            System.out.println("Elevator Current Floor:"+fsm.getcurrentfloor());
            switch (fsm.getCurrentstate()){
                case GROUND_FLOOR -> groundFloorUI();
                case FIRST_FLOOR -> FirstFloorUI();
                case SECOND_FLOOR -> SecondFloorUI();
            }
        }

    }
  /*  public void start2(){
        while (!switch (fsm.getCurrentstate()){
            as ui dos groundfloor teria de ser boolean e retornar true or false
             //   case GROUND_FLOOR -> groundFloorUI();
              //  case FIRST_FLOOR -> FirstFloorUI();
              //  case SECOND_FLOOR -> SecondFloorUI();

        }

    }*/
    void groundFloorUI(){
        System.out.println("Ground Floor");
        switch (PAInput.chooseOption("Elevator","Up","Quit")){
            case 1->fsm.up();
            default -> {finish=true;}
        }
    }
    void FirstFloorUI(){
        System.out.println("First Floor");
        switch (PAInput.chooseOption("Elevator","Up","Down","Quit")){
            case 1->fsm.up();
            case 2->fsm.down();
            default -> {finish=true;}
        }
    }
    void SecondFloorUI(){
        System.out.println("Second Floor");
        switch (PAInput.chooseOption("Elevator","Down","Quit")){
            case 1->fsm.down();
            default -> {finish=true;}
            //default return true para o start 2
        }
    }
}
