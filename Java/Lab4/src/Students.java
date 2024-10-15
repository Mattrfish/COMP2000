import java.util.Arrays;
import java.util.Scanner;
public class Students {

    public static String[] Name = new String[5];
    public static int[] Mark = new int[5];


    public static void details() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < Name.length; i++) {
            System.out.println("Enter your name: ");
            Name[i] = input.nextLine();

            System.out.println("Enter your mark: ");
            Mark[i] = Integer.parseInt(input.nextLine());

        }
        for (int i: Mark){
            if (i < 40){
                System.out.println("These are the students that have got over 40: " + Name[] + ", " + Mark[]);
            }
        }


    }



}




