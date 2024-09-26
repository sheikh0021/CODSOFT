import java.util.Scanner;


public class NumberGame {

    // code for implementing the function

public static void NumberGame() {

    //Scanner class 

Scanner sc = new Scanner(System.in);

//number generation

int number = 1 + (int)(100 * Math.random());

// Giving trials for guessing numbers

int j = 4;
int i, guess;

System.out.println(
    "A number is chosen"
    + " between 1 to 100"
    + " Guess the number"
    +" within 4 trials"
);

for (i = 0; i < j; i++) {
    System.out.println(
        "Guess the number:"
    );

    //input for the guessing number
guess = sc.nextInt();

if (number == guess) {
    System.out.println(
        "Bingo" 
        + " you guessed the number"
    );
    break;
}

else if (number > guess && i !=j - 1){
    System.out.println("The number is greater than " + guess);
}
else if (number < guess && i != j - 1){
    System.out.println(
        "The number is less than " + guess
    );
}

}

if (i == j) {

    System.out.println(
        "You have Exhausted" +
        " 4 trials"
      );
      System.out.println(
        "The number was " + number
       );
}

}

// this is the function call part 

public static void main(String[] args) {
    
NumberGame();

}



}