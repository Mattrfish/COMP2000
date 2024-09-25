public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World"); //this is a comment
        String name = "Matt"; // string var
        String lastName = "Fish"; // second name
        int age = 19; //integer var
        float shoeSize = 9.5F; //float var
        char myLetter = 'M'; //character var
        boolean myBool = true; //boolean var
        System.out.println("Hello " + name + " " + lastName);
        System.out.println("You are " + age);
        System.out.println("Your shoe size is " + shoeSize);
        System.out.println("Your letter is " + myLetter);
        System.out.println("Your bool is " + myBool);

        int x = 20, y = 5;
        int z = (x + y);

        System.out.println("You live at " + z + " Forest View" );

        byte one = 1; //Stores whole numbers from -128 to 127
        short two = 2; //Stores whole numbers from -32,768 to 32,767
        int four = 4; //Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long eight = 8; //Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float fourF = 4.0f; //Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double eightF = 8.0; //Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean	oneTruth = true; //Stores true or false values
        char twoByte = 2;  //Stores a single character/letter or ASCII values

        //automatic casting
        int myInt = 9;
        double myDouble = myInt; //auto casting
        System.out.println(myInt); //outputs 9
        System.out.println(myDouble); //outputs 9.0

        //narrow casting
        double myNewDouble = 9.78d;
        int myNewInt = (int) myNewDouble; // Manual casting: double to int
        System.out.println(myNewDouble);   // Outputs 9.78
        System.out.println(myNewInt);      // Outputs 9

    }
}
