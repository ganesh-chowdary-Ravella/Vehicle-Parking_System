import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParkingLot parkingLot = new ParkingLot();

        while (true) {

            System.out.println("\n--- Vehicle Parking System ---");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Display Vehicles");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter vehicle number: ");
                    String number = sc.nextLine();

                    System.out.print("Enter vehicle type (Car/Bike): ");
                    String type = sc.nextLine();

                    Vehicle vehicle = new Vehicle(number, type);
                    parkingLot.addVehicle(vehicle);
                    break;

                case 2:
                    System.out.print("Enter vehicle number to remove: ");
                    String removeNumber = sc.nextLine();
                    parkingLot.removeVehicle(removeNumber);
                    break;

                case 3:
                    parkingLot.displayVehicles();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
