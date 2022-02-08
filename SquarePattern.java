import java.util.Scanner;
public class  SquarePattern {  // Save as "Swap2Integers.java"
   public static void main (String[] args) {
	   int number1, number2, temp;   // 2 intengers input
	   
	   Scanner in = new Scanner(System.in);  // Scan the keyboard
       System.out.print("Enter first integer: ");
	   number1 = in.nextInt();
	   System.out.print("Enter second integer: ");
	   number2 = in.nextInt();
	  
       in.close();
	   
	   temp = number1;
	   number1 = number2;
	   number2 = temp;
	   
	   System.out.println("After the swap, first integer is: " + number1 + ", second integer is: " + number2);
	   


	   

	  
   }
 }
 