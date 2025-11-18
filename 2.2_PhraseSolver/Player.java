/*
 * Activity 2.2.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  private String name;
  private int points;


  public Player(){//constructor
      points = 0;
      name = "";
      Scanner scanner = new Scanner(System.in);
    System.out.print("Enter name: ");
    name = scanner.nextLine();
    System.out.println("Hello " + name + "! And welcome to the PhraseSolver game!");

  }
  /* your code here - constructor(s) *
  

  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}