/**
 * A simple Car class
 *
 * @author (Ihsan Ullah)
 * @version (19/9/2018)
 */



public class Car
{
    // instance variables - replace the example below with your own
    private int speed;
    private int gear;
    private int doors;

    /**
     * Constructor for objects of class Car
     */
    public Car(int speed, int gear, int doors)
    {
        // initialise instance variables
        this.speed = speed;
        this.gear = gear;
        this.doors = doors;
    }

    /**
     * accessor method for speed field
     * @return the value of the speed field
     */
    public int getSpeed()
    {
        return speed;
    }

    /**
     * accessor method for gear field
     * @return the value of the gear field
     */
    public int getGear()
    {
        return gear;
    }

    /**
     * accessor method for doors field
     * @return the value of the doors field
     */
    public int getDoors()
    {
        return doors;
    }

    /**
     * mutator method for the gear field
     * @param gear:  a gear value
     */
    public void setGear(int gear)
    {
        if(gear >= 1 && gear <= 18) { // this protects the gear field from unrealistic values
            this.gear = gear;
            System.out.printf("# Gear : %d \n ", gear);
        }
        else {
            System.out.println("gear input value not in the correct range \n");
        }

    }
    /**
     * mutator method for the doors field
     * @param doors:  a doors value
     */
    public void setDoors(int doors)
    {
        if(doors >= 1 && doors <= 6) {
            this.doors = doors;
            System.out.printf("# Doors: %d \n", doors);
        }
        else {
            System.out.println("doors input value not in the correct range \n");
        }

    }

    /**
     * mutator method for the speed field
     * @param speed:  a speed value
     */
    public void setSpeed(int speed)
    {
        if(speed >= 1 && speed <= 100) {
            this.speed = speed;
            System.out.printf("# Speed: %d \n ", speed);

        }
        else {
            System.out.println("speed input value not in the correct range \n");
        }

    }

    public void printState()
    {
        // Simulates output from a bike computer.
        System.out.println("##################");
        setSpeed(speed);
        setGear(gear);
        setDoors(doors);
        System.out.println("##################");
        System.out.println();
    }
}

