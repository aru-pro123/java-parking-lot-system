package model;
public class ParkingSlot {

    private int slotNumber;
    private Vehicle vehicle;

    public ParkingSlot(int slotNumber){
        this.slotNumber = slotNumber;
        this.vehicle = null;
    }
    public int getSlotNumber() {
        return slotNumber;
    }
    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public boolean isSlotFree(){
        return vehicle == null;
    }

    public void assignVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void removeVehicle(){
        this.vehicle = null;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}