import service.ParkingLot;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of parking slots: ");
        int size = scanner.nextInt();
        ParkingLot parkingLot = new ParkingLot(size);

        while (true) {
            System.out.println("\n--- Parking Lot Menu ---");
            System.out.println("1. Park vehicle");
            System.out.println("2. Leave slot");
            System.out.println("3. View status");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Try again.");
                continue;1
            }

            switch (choice) {
                case 1:
                    if (parkingLot.isFull()) {
                        System.out.println("Parking lot is full. No available slots.");
                    } else {
                        System.out.print("Enter vehicle number: ");
                        String vehicleNumber = scanner.next();
                        parkingLot.parkVehicle(vehicleNumber);
                    }
                    break;

                case 2:
                    System.out.print("Enter slot number to free: ");
                    int slotNumber = scanner.nextInt();
                    parkingLot.leaveSlot(slotNumber);
                    break;

                case 3:
                    parkingLot.displayStatus();
                    break;

                case 4:
                    System.out.println("Exiting Parking Lot System");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}