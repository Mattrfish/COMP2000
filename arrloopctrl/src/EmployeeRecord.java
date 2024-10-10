public class EmployeeRecord {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String nm){
        name=nm;
    }
    public static void main(String [] args){
        EmployeeRecord emp = new EmployeeRecord(); //creates new record emp
        emp.setName("Helen"); //stores a name in emp
        String e= emp.getName();//returns name to private string
        System.out.println(emp.name); //print name
    }
}