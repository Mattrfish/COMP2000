public class employees { //tasks 1 and 2
    public static void details() {
        String[] employee = {"Brian", "Alex", "Harry"}; //employee name array
        int[] age = {79, 19, 52}; //age array
        int count = 0; //count var

        for (int i = 0; i < 3; i++) {
            System.out.print(employee[i] + " "); //outputs all employees in the array
            System.out.println(age[i]); //outputs ages of employees from age array
            if (age[i] > 50){ //if employee age > 50, add 1 to count

                count++;
            }



        }
        System.out.println("Employees over age 50: " + count); //outputs employees over 50






    }


}
