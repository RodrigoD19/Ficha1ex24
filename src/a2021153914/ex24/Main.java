package a2021153914.ex24;

import a2021153914.ex24.model.fsm.ElevatorContext;
import a2021153914.ex24.ui.text.ElevatorUI;

public class Main {
    public static void main(String[] args) {
        ElevatorContext fsm=new ElevatorContext();
        ElevatorUI ui= new ElevatorUI(fsm);
        ui.start();
    }
}