class VolcanoRobot {
    String status;
    int speed;
    float temperature;

    void checkTemperature() {
        if (temperature > 660) {
            status = "Returning home";
            speed = 5;
        }
    }

    void showAttributes(){
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);

    }
}