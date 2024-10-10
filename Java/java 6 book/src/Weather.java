public class Weather {
    public static void main(String[] args) {
        float fah = 86;
        System.out.println(fah + " degrees fahrenheit is ...");

        //To convert fahrenheit into celsius
        // begin by subtracting 32
        fah = fah - 32;
        //divide by 9
        fah = fah / 9;
        //multiply by 5
        fah = fah * 5;
        System.out.println(fah + " degrees celsius\n");

        float cel = 33;
        System.out.println(cel + " degrees celsius is ...");
        //To convert celsius to fahrenheit
        // begin by multiplying by 9
        cel = cel * 9;
        //divide by 5;
        cel = cel / 5;
        //add 32
        cel = cel + 32;
        System.out.println(cel + " degrees fahrenheit");

    }
}
