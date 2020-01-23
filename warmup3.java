import java.util.Scanner;

public class warmup3
{
  public static void main(String[] args)
  { 
    int width; 
    int length;

    Scanner sc= new Scanner(System.in);

   /* System.out.println("How big should the width of the square be?");
    width = sc.nextInt();

    System.out.println("How big should the length of the square be?");
    length= sc.nextInt(); */

    {
    for (int y= 0; y < 5; y++)
    {
      for (int x= 0; x < 5; x++)
      { 
        if (x == 0 || y == 0)
        {
          System.out.print("#");
        }
        else if (x != 5 && y == 5-1)
        {
          System.out.print("#");
        }
        else if (y != 5 && x == 5-1)
        {
	System.out.print("#");
        }
        else
        {
           System.out.print(" ");
        }
      }
    System.out.println(" ");
    }
    }
  }
}