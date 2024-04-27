import java.util.*;
public class NumberGame {
   public static void main (String[] args){
      // Instantiate an instance of the Random class
      Random random = new Random(); 
      // Generate a random between 0 and 100
      int randomNum = random.nextInt(100);
      
      Scanner sc = new Scanner(System.in);      
      System.out.println("Welcome to the Number Game.");
      System.out.println("A number between 0 - 100 has been randomly generated.");
      System.out.println("Take a guess what that number is by entering your guess or enter -1 to quit the game.");
      System.out.print("Enter the number you guessed: ");
      int guess = sc.nextInt();
      while (guess != -1){
         if (guess < randomNum){         
            System.out.println("Your number is too low. Please try again.");
         }         
         else if (guess > randomNum){
            System.out.println("Your number is too high. Please try again.");
         }
         else {
            System.out.println("You have guessed correctly. Congratulations!!!");
            break;}
         
         System.out.print("Enter the number you guessed: ");
         guess = sc.nextInt();        
      }
      if (guess == -1)
      {
         System.out.println("Thank you for playing the game. The random number was "+randomNum+". Better luck next time :)");
      }
   
   }
}