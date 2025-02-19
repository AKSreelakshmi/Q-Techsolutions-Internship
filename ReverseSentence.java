import java.util.Scanner;
public class ReverseSentence 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter sentence:");
        String input = s.nextLine();
        String[] words = input.split(" ");
        String reversedSentence = ""; 
        for (int i = words.length - 1; i >= 0; i--) 
        {
            reversedSentence += words[i]; 
            if (i > 0) 
            {
                reversedSentence += " ";
            }
        }
        System.out.println("reversed sentence:");
        System.out.println(reversedSentence);
        s.close();
    }
}
