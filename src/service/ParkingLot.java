package service;

import java.util.ArrayList;
import java.util.List;
import model.*;

public class ParkingLot {
    private List<ParkingSlot> slots;

    public ParkingLot(int slotSize) {
        this.slots = new ArrayList<>();

        for (int i = 1; i < slotSize; i++) {
            ParkingSlot parkingSlot = new ParkingSlot(i);
            slots.add(parkingSlot);
        }

    }

    public void parkVehicle(String vehicleNumber) {
        Vehicle vehicle = new Vehicle(vehicleNumber);

        for(ParkingSlot slot : slots){
            if (slot.isSlotFree()){
                slot.assignVehicle(vehicle);
                System.out.println("Vehicle parked in slot " + slot.getSlotNumber());
                return;
            }
        }
        System.out.println("Parking lot is full");
    }

    public void leaveSlot(int slotNumber) {

        for (ParkingSlot slot : slots) {
            if (slot.getSlotNumber() == slotNumber) {

                if (slot.isSlotFree()) {
                    System.out.println("Slot " + slotNumber + " is already empty");
                } else {
                    slot.removeVehicle();
                    System.out.println("Slot " + slotNumber + " is now free");
                }
                return;
            }
        }

        System.out.println("Invalid slot number");
    }

    public void displayStatus() {
        System.out.println("Slot\tVehicle Number");

        for (ParkingSlot slot : slots) {
            if (slot.isSlotFree()) {
                System.out.println(slot.getSlotNumber() + "\tEmpty");
            } else {
                System.out.println(
                        slot.getSlotNumber() + "\t" +
                                slot.getVehicle().getVehicleNumber()
                );
            }
        }
    }

    public boolean isFull() {
        for (ParkingSlot slot : slots) {
            if (slot.isSlotFree()) {
                return false;
            }
        }
        return true;
    }
}