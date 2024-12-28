import java.util.ArrayList;
import java.util.Scanner;

class Question 
{
    String questionText;
    String[] choices;
    int correctAnswer;
    Question(String questionText, String[] choices, int correctAnswer) 
	{
        this.questionText = questionText;
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }
    void displayQuestion() 
	{
        System.out.println(questionText);
        for (int i=0;i<choices.length;i++) 
		{
            System.out.println((i + 1)+". "+choices[i]);
        }
    }
    boolean isCorrect(int userAnswer)

	{
        return userAnswer==correctAnswer;
    }
}
class OnlineQuizApp 
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question("What Italian city is famous for its system of canals?", new String[]{"Rome", "Maples", "Venice"}, 3));
        questions.add(new Question("What is the strongest muscle in the human body?", new String[]{"Jaw", "Heart", "Glutes"}, 1));
        questions.add(new Question("The Playstation game console was developed by which company?", new String[]{"Nintendo", "Sony", "Sega"}, 2));
        int score=0;
        for (int i=0;i<questions.size();i++) 
		{
            questions.get(i).displayQuestion();
            System.out.print("Your answer: ");
            int userAnswer = s.nextInt();
            if (questions.get(i).isCorrect(userAnswer)) 
			{
                System.out.println("correct");
                score++;
            } 
			else 
			{
                System.out.println("wrong");
            }
        }
        System.out.println("your score: " + score + "/" + questions.size());
        s.close();
    }
}