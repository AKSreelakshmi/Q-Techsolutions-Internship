import java.util.Scanner;
public class GradeManagementSystem 
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        System.out.print("enter no of subjects: ");
        int sub=s.nextInt();
        double[] marks = new double[sub];
        double tot=0.0;
        for (int i=0;i<sub;i++) 
		{
            System.out.print("enter marks for each subject " + (i + 1) + ": ");
            marks[i]=s.nextDouble();
            tot+=marks[i];
        }
        double avg=tot/sub;
        char grade;
        if (avg>=90) 
		{
            grade='A';
        } 
		else if (avg>=80) 
		{
            grade='B';
        } 
		else if (avg>=70) 
		{
            grade='C';
        } 
		else if (avg>=60) 
		{
            grade='D';
        } 
		else 
		{
            grade='F';
        }
        System.out.println("average marks: " + avg);
        System.out.println("grade: " + grade);
        s.close();
    }
}
