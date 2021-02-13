package academy.learnprogramming;

public class Vehicle {
    private String size, name;
    private int currentVelocity, currentDirection;

    public Vehicle(String size, String name, int currentVelocity, int currentDirection) {
        this.size = size;
        this.name = name;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steering (int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle is steering at " + currentDirection + " degrees!");
    }

    public void moving (int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle is moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop () {
        this.currentVelocity = 0;
    }
}
