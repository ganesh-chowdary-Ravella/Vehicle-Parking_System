import java.time.LocalTime;

public class Vehicle {

    String vehicleNumber;
    String vehicleType;
    LocalTime entryTime;

    public Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.entryTime = LocalTime.now(); // store entry time
    }
}
