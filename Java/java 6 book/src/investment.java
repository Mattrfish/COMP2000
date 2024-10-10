public class investment {
    public static void main(String[] args) {
        float total = 14000;
        System.out.println("Starting investment: " + total);
        total = total + (total * .10f);
        System.out.println("After year one: £" + total);
        total = total- 1500f;
        System.out.println("After year two: £" + total);
        total = total + (total * .12f);
        System.out.println("After year three: £" + total);



    }
}
