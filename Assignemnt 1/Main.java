

public class Main {

    public static void main(String[] args) {
        int speed = Integer.valueOf(args[0]);
        int gear = Integer.valueOf(args[1]);
        int doors = Integer.valueOf(args[2]);

        Car car = new Car(speed,gear,doors);

        car.printState();
    }
}
