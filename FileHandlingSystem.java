import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileHandlingSystem 
{

    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        String filePath = "sample.txt";

        while (true) 
		{
            System.out.println("1.write to file");
            System.out.println("2.read from file");
            System.out.println("3.exit");
            System.out.print("choose an option");
            int choice = s.nextInt();
            s.nextLine();

            switch (choice) 
			{
                case 1:
                    writeToFile(filePath, s);
                    break;
                case 2:
                    readFromFile(filePath);
                    break;
                case 3:
                    System.out.println("exiting program");
                    s.close();
                    return;
                default:
                    System.out.println("try again");
            }
        }
    }
    private static void writeToFile(String filePath, Scanner s) 
	{
        System.out.print("enter text: ");
        String text = s.nextLine();
        try (FileWriter w = new FileWriter(filePath, true)) 
		{
            w.write(text + "\n");
            System.out.println("text was successfully written into file");
        } 
		catch (IOException e) 
		{
            System.out.println("error: " + e.getMessage());
        }
    }
    private static void readFromFile(String filePath) 
	{
        try (FileReader r = new FileReader(filePath)) 
		{
            int character;
            System.out.println("contents in file:");
            while ((character = r.read()) != -1) 
			{
                System.out.print((char) character);
            }
            System.out.println();
        } 
		catch (IOException e) 
		{
            System.out.println("error: " + e.getMessage());
        }
    }
}
