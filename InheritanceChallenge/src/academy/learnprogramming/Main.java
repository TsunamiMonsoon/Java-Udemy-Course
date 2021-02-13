package academy.learnprogramming;

// Challenge:
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behavious (field methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.

public class Main {

    public static void main(String[] args) {
        Chevy chevy = new Chevy(36);
        chevy.steering(45);
        chevy.accelerate(30);
        chevy.accelerate(20);
        chevy.accelerate(-42);
    }
}
