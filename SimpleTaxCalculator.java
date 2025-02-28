import java.util.Scanner;
public class SimpleTaxCalculator 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter annual income: ");
        double income = s.nextDouble();
        double tax = 0.0;
        if (income <= 250000) 
        {
            tax = 0.0;
        } 
        else if (income <= 500000) 
        {
            tax = (income - 250000) * 0.05;
        } 
        else if (income <= 1000000) 
        {
            tax = (250000 * 0.05) + (income - 500000) * 0.2; 
        }
        else 
        {
            tax = (250000 * 0.05) + (500000 * 0.2) + (income - 1000000) * 0.3;
        }
        System.out.println("tax amount is: " + tax);
        s.close();
    }
}
