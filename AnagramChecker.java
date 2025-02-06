import java.util.HashMap;
import java.util.Scanner;
public class AnagramChecker 
{
    public static boolean areAnagrams(String s1, String s2) 
    {
        if (s1.length() != s2.length()) 
        {
            return false;
        }
        HashMap<Character, Integer> charCountMap1 = new HashMap<>();
        HashMap<Character, Integer> charCountMap2 = new HashMap<>();
        for (char c : s1.toCharArray()) 
        {
            charCountMap1.put(c, charCountMap1.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) 
        {
            charCountMap2.put(c, charCountMap2.getOrDefault(c, 0) + 1);
        }
        return charCountMap1.equals(charCountMap2);
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first string: ");
        String s1 = scanner.nextLine();
        System.out.print("enter second string: ");
        String s2 = scanner.nextLine();
        if (areAnagrams(s1, s2)) 
        {
            System.out.println("they are anagrams");
        } 
        else 
        {
            System.out.println("they are not anagrams");
        }
        scanner.close();
    }
}
