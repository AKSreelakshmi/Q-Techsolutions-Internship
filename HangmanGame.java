import java.util.Random;
import java.util.Scanner;
public class HangmanGame 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String[] words = {"princess", "earthquake", "dazzle", "watermelon", "refrigerator", "computer", "whitener", "technology"};
        Random random = new Random();
        String wordToGuess = words[random.nextInt(words.length)];
        char[] wordArray = wordToGuess.toCharArray();
        char[] guessedWord = new char[wordToGuess.length()];
        for (int i = 0; i < guessedWord.length; i++) 
        {
            guessedWord[i] = '_';
        }
        int attempts = 10; 
        boolean wordGuessed = false;
        System.out.println("welcome to the hangman game");
        System.out.println("you have " + attempts + " attempts");
        System.out.println("word: " + String.valueOf(guessedWord));
        while (attempts > 0 && !wordGuessed) 
        {
            System.out.print("enter your guess: ");
            char guess = s.nextLine().toLowerCase().charAt(0);
            boolean correctGuess = false;
            for (int i = 0; i < wordArray.length; i++) 
            {
                if (wordArray[i] == guess && guessedWord[i] == '_') 
                {
                    guessedWord[i] = guess;
                    correctGuess = true;
                }
            }
            if (!correctGuess) 
            {
                attempts--;
                System.out.println("wrong. attempts left: " + attempts);
            } 
            else 
            {
                System.out.println("right. word now: " + String.valueOf(guessedWord));
            }
            wordGuessed = String.valueOf(guessedWord).equals(wordToGuess);
        }
        if (wordGuessed) 
        {
            System.out.println("congratulations you guessed the word: " + wordToGuess);
        } 
        else 
        {
            System.out.println("out of attempts the word was: " + wordToGuess);
        }
        s.close();
    }
}
