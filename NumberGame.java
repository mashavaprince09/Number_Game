import java.util.*;
public class NumberGame {
   public static void main (String[] args){
      // Instantiate an instance of the Random class
      Random random = new Random(); 
      
      String play = "Y";
      while (play.equalsIgnoreCase("Y") ){
         // Generate a random between 0 and 100
         int randomNum = random.nextInt(100);  
         int score = 0;
         Scanner sc = new Scanner(System.in);      
         System.out.println("Welcome to the Number Game.");
         System.out.println("A number between 0 - 100 has been randomly generated.");
         System.out.println("Take a guess what that number is by entering your guess.");
         System.out.print("How many rounds do you want to play: ");                
         int rounds  = sc.nextInt();           
         while (rounds<=0){
            System.out.println("Invalid number of rounds. Number must be greater than zero.");
            System.out.print("How many rounds do you want to play: ");         
            rounds  = sc.nextInt(); 
         }
         for (int i=0; i<rounds-1;i++){          
            System.out.println();
            System.out.println("This is round "+(i+1));
            System.out.print("Enter the number you guessed: ");                  
            int guess = sc.nextInt();
            while ((guess<0) || (guess>100)){
               System.out.println("Your guess is invalid. Number should be between 0 - 100.");
               System.out.print("Enter the number you guessed: ");         
               guess  = sc.nextInt(); 
            }            
   
               if (guess < randomNum){         
                  System.out.println("Your number is too low. Please try again.");
               }         
               else if (guess > randomNum){
                  System.out.println("Your number is too high. Please try again.");
               }
               else {
                  score++;
                  System.out.println("You have guessed correctly. Congratulations!!!");
                  randomNum = random.nextInt(100);
                  }                  
         }    
            System.out.println();
            System.out.println("This is round "+rounds);
            System.out.print("Enter the number you guessed: ");      
            int guess = sc.nextInt();
   
               if (guess < randomNum){         
                  System.out.println("Your number is too low.");
               }         
               else if (guess > randomNum){
                  System.out.println("Your number is too high.");
               }
               else {
                  score++;
                  System.out.println("You have guessed correctly. Congratulations!!!");
                  }               
        
            System.out.println();
            System.out.println("Thank you for playing the game.");
            System.out.println("Your score is "+score+"/"+rounds);
            System.out.println("========================================");
            System.out.println("Enter 'Y' to play again and 'N' to quit.");
            play = sc.next();    
      
      }
      

   
   }
}