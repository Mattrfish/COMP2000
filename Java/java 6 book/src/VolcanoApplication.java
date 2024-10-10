public class VolcanoApplication {
    public static void main(String[] args) {
        VolcanoRobot Brian = new VolcanoRobot();
        Brian.status = "exploring";
        Brian.speed = 2;
        Brian.temperature = 510;

        VolcanoRobot Virgil = new VolcanoRobot();
        Virgil.status = "hunting";
        Virgil.speed = 1;
        Virgil.temperature = 510;

        Virgil.showAttributes();

        Brian.showAttributes();
        System.out.println("Increasing speed to 3.");
        Brian.speed = 3;
        Brian.showAttributes();
        System.out.println("Changing temperature to 670");
        Brian.temperature = 670;
        Brian.showAttributes();
        System.out.println("Checking the temperature");
        Brian.checkTemperature();
        Brian.showAttributes();
    }
}
