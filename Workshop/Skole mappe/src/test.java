import java.util.Scanner; 
import java.util.Random; 


public class test 
{ 
public static void main(String[] args) 
{ 
    String personPlay; 
    String computerPlay = ""; 
    int computerInt; 
                 
    Scanner scan = new Scanner(System.in); 
    Random generator = new Random(); 

    computerInt = generator.nextInt(3); 


    if (computerInt == 0) 
       computerPlay = "0"; 
    else if (computerInt == 1) 
       computerPlay = "1"; 
    else if (computerInt == 2) 
       computerPlay = "2"; 
    
    System.out.println("Scissors = 0, Rock = 1 or Paper = 2");
    personPlay = scan.next();
    scan.close();

    if (personPlay.equals(computerPlay)) 
       System.out.println("The computer is: " + computerPlay + " You are: " + personPlay + " It's a draw!"); 
    else if (personPlay.equals("1")) 
       if (computerPlay.equals("0")) 
          System.out.println("The computer is scissors. You are rock. You won!");
    else if (computerPlay.equals("2")) 
            System.out.println("The computer is paper. You are rock. You lose!"); 
    else if (personPlay.equals("2")) 
       if (computerPlay.equals("0")) 
       System.out.println("The computer is scissor. You are paper. You lose!"); 
    else if (computerPlay.equals("1")) 
            System.out.println("You are paper. The computer is rock. You win!"); 
    else if (personPlay.equals("0")) 
         if (computerPlay.equals("2")) 
         System.out.println("You are scissor. The computer is paper. You win!"); 
    else if (computerPlay.equals("1")) 
            System.out.println("The computer is rock. You are scissor. You lose!"); 
    else 
         System.out.println("Feil input."); 
}
}