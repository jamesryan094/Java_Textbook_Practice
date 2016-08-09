/**
 * Created by james on 4/08/2016.
 * Either one or two string arguments,
 * pass to one of two constructors
 */
public class FormLetterWriter {
    final private static String letterBody = "Thank you for your ongoing support\n";
    public static void main(String[] args){
        displaySalutation("Ryan");
        displaySalutation("James", "Ryan");
    }
    private static void displaySalutation(String lastName){
        System.out.println("Dear Mr and Mrs " + lastName);
        System.out.println(letterBody);
    }
    private static void displaySalutation(String firstName, String lastName){
        System.out.println("Dear " + firstName + " " + lastName);
        System.out.println(letterBody);
    }
}
