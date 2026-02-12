
import java.util.ArrayList;
import java.time.Duration;
import java.time.LocalTime;

public class ParkingLot {

    ArrayList<Vehicle> parkedVehicles = new ArrayList<>();
    int capacity = 5; // parking limit

    public void addVehicle(Vehicle vehicle) {

        if (parkedVehicles.size() >= capacity) {
            System.out.println("Parking lot is full!");
            return;
        }

        for (Vehicle v : parkedVehicles) {
            if (v.vehicleNumber.equals(vehicle.vehicleNumber)) {
                System.out.println("Vehicle already parked!");
                return;
            }
        }

        parkedVehicles.add(vehicle);
        System.out.println("Vehicle parked successfully.");
    }

    public void removeVehicle(String vehicleNumber) {

        for (int i = 0; i < parkedVehicles.size(); i++) {

            Vehicle v = parkedVehicles.get(i);

            if (v.vehicleNumber.equals(vehicleNumber)) {

                LocalTime exitTime = LocalTime.now();
                long minutes = Duration.between(v.entryTime, exitTime).toMinutes();

                if (minutes == 0) {
                    minutes = 1; // minimum 1 minute charge
                }

                double fee = minutes * 1; // ₹1 per minute

                System.out.println("Parking fee: ₹" + fee);

                parkedVehicles.remove(i);
                System.out.println("Vehicle removed successfully.");
                return;
            }
        }

        System.out.println("Vehicle not found.");
    }

    public void displayVehicles() {

        if (parkedVehicles.isEmpty()) {
            System.out.println("No vehicles parked.");
        } else {
            for (Vehicle v : parkedVehicles) {
                System.out.println("Vehicle Number: " + v.vehicleNumber +
                                   " | Type: " + v.vehicleType +
                                   " | Entry Time: " + v.entryTime);
            }
        }
    }
}
