package a2021153914.ex24.model.data;

public class Elevator {
    private int curretfloor;
    public Elevator(int floor){
        this.curretfloor=floor;
    }

    public int getCurretfloor() {
        return curretfloor;
    }

    public void setCurretfloor(int curretfloor) {
        if(curretfloor>=0&&curretfloor<=2)
            this.curretfloor = curretfloor;
    }

    @Override
    public String toString() {
        return "CurrentFloor"+curretfloor;
    }
}
