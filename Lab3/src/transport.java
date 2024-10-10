public class transport { //exercise 4

    String[] model = {"Ford", "Lambo", "Porche"}; //car models
    int[] price = {500, 2000, 1000}; //car price
    public void move(int speed) { //car.move will do this:
        System.out.println("I am moving at " + speed + " MPH");
    }
    public void stop() { //car.stop will do this:
        System.out.println("Slamming the brakes!");
    }
    public void start() { //car.stop will do this:
        System.out.println("I am accelerating!");
    }

    public static void details(){ //All the class Car functionality
        transport car = new transport();
        transport car1 = new transport();

        //first car
        car.start();
        car.move(100);
        car.stop();
        System.out.println("My car is a: " + car.model[0]); //gets the car model
        System.out.println("My price is a: " + car.price[0]); //gets the car price

        System.out.println(" ");

        //second car
        car1.start();
        car1.move(500);
        car1.stop();
        System.out.println("My car is a: " + car.model[1]);
        System.out.println("My price is a: " + car.price[1]);
    }




}


