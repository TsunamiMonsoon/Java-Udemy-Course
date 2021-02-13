package academy.learnprogramming;

public class Car extends Vehicle{
    private int wheels, doors, gears, currentGear;
    private boolean isManual;

    public Car(String size, String name, int currentVelocity, int currentDirection, int wheels, int doors, int gears, int currentGear, boolean isManual) {
        super(size, name, currentVelocity, currentDirection);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = currentGear;
        this.isManual = isManual;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Current Gear is " + this.currentGear);
    }

    public void changeVelocity (int speed, int direction) {
        System.out.println("Velocity changed to " + speed + " direction " + direction);
        moving(speed, direction);
    }
}
