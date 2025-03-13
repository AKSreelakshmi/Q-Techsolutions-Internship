import java.util.Stack;
import java.util.Scanner;
public class PalindromeChecker 
{ 
    public static boolean isPalindrome(String str) 
    {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) 
        {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) != stack.pop()) 
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter string: ");
        String input = s.nextLine();
        if (isPalindrome(input)) 
        {
            System.out.println(input + " is a palindrome");
        } 
        else 
        {
            System.out.println(input + " is not a palindrome");
        }
        s.close();
    }
}
