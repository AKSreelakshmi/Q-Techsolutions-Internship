import java.util.Scanner;

class PrintPatterns 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter no of rows: ");
        int rows = s.nextInt();
        System.out.println("choose pattern to print:");
        System.out.println("1.triangle");
        System.out.println("2.diamond");
        System.out.println("3.pyramid");
        int choice = s.nextInt();
        switch (choice) 
        {
            case 1:
                Triangle(rows);
                break;
            case 2:
                Diamond(rows);
                break;
            case 3:
                Pyramid(rows);
                break;
            default:
                System.out.println("please try again ");
        }
        s.close();
    }
    static void Triangle(int rows) 
    {
        for (int i=1;i<=rows;i++) 
        {
            for (int j=1;j<=i;j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Diamond(int rows) 
    {
        for (int i=1;i<=rows;i++) 
        {
            for (int j=1;j<=rows-i;j++) 
            {
                System.out.print("  ");
            }
            for (int j=1;j<=2*i-1;j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=rows-1;i>=1;i--) 
        {
            for (int j=1;j<=rows-i;j++) 
            {
                System.out.print("  ");
            }
            for (int j=1;j<=2*i-1;j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pyramid(int rows) 
    {
        for (int i=1;i<=rows;i++) 
        {
            for (int j=1;j<=rows-i;j++) 
            {
                System.out.print("  ");
            }
            for (int j=1;j<=2*i-1;j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
