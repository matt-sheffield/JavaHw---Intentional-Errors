import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        String question = "Which is the best NFL team?";
        String choiceOne = "Cardinals";
        String choiceTwo = "Eagles";
        String choiceThree = "Bears";

        String correctAnswer = choiceTwo;

        System.out.println("Which is the best NFL team?") // Testing with missing semi-colon
        System.out.println(choiceOne + "\n" + choiceTwo + "\n" + choiceThree);
        Scanner input = new Scanner(System.in);
        string userInput = input.next(); // Testing with incorrect capitalization of String
        if (correctAnswer.equals(userInput)) {
            String league = "NFL"; // Testing with variable out of scope in the else statement
            System.out.println("Congrats! They are definitely the best team in the " + league);
        } else {
            System.out.println("Incorrect, they are not the best team in the " + league); // Testing printing with out of scope variable
        }
    }
}

/*
Here's the working version:

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        String question = "Which is the best NFL team?";
        String choiceOne = "Cardinals";
        String choiceTwo = "Eagles";
        String choiceThree = "Bears";

        String correctAnswer = choiceTwo;

        System.out.println("Which is the best NFL team?");
        System.out.println(choiceOne + "\n" + choiceTwo + "\n" + choiceThree);
        Scanner input = new Scanner(System.in);
        String userInput = input.next();
        if (correctAnswer.equals(userInput)) {
            System.out.println("Congrats!");
        } else {
            System.out.println("Incorrect");
        }
    }
}
*/