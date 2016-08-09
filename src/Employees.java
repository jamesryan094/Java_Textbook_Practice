/**
 * Created by james on 9/08/2016.
 * example employee database, get set and display name, id and salary
 */
//todo: Instantiate object based on user input
public class Employees {
    private String firstName;
    private String lastName;
    private int empNum;
    private int empSalary;

    public void setEmpNum(int num){
        empNum = num;
    }
    public void setEmpSalary(int salary){
        empSalary = salary;
    }
    public void setFirstName(String name){
        firstName = name;
    }
    public void setLastName(String name){
        lastName = name;
    }
    public int getEmpNum(){
        return empNum;
    }
    public int getEmpSalary(){
        return empSalary;
    }
    public String getfirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getWholeName(){
        return ( firstName + ' ' + lastName);
    }
    public void displayDetails(){
        System.out.println("First Name: " +firstName + "\nLast Name: " + lastName + "\nID: " +empNum +"\nSalary: $" + empSalary);
    }
    public Employees(){
        empNum = 0;
        empSalary = 0;
        firstName = "dafaultFirstName";
        lastName = "defaultLastName";
    }

    public Employees(String first, String last, int id,int salary){
        firstName = first;
        lastName = last;
        empNum = id;
        empSalary = salary;
    }

    public static void main(String[] args) {
        Employees james = new Employees();
        Employees two = new Employees("James", "Ryan", 648668, 32000);
        System.out.println(james);
        System.out.println(two);
        james.displayDetails();
        two.displayDetails();
        two.setEmpSalary(1000000);
        two.displayDetails();
        System.out.println(two.getWholeName());
    }

}