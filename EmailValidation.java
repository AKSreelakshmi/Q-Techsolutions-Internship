import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidation
{
    public static boolean isValidEmail(String email) 
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the email address: ");
        String email = s.nextLine();
        if (isValidEmail(email)) 
        {
            System.out.println("email address " + email + " is valid");
        } 
        else 
        {
            System.out.println("email address " + email + " is not valid");
        }
        s.close();
    }
}
