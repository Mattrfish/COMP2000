// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Test {
    public static void main(String[] args) {
       int[] numbers = {10, 20, 30, 40, 50}; //array to store ints

       for(int x: numbers){ //loop to store each number into x
           System.out.print(x); //prints each numbers that gets stored in x
           System.out.print(","); //prints comma after numbers
       }
       System.out.print("\n"); //newline
       String []names = {"James", "Larry", "Tom", "lacy"}; //same as numbers

       for (String name : names){
           System.out.print(name);
           System.out.print(",");
       }

    }
}