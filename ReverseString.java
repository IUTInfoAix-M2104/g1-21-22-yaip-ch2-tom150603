import java.util.Scanner;
public class  ReverseString {  // Save as "Swap2Integers.java"
   public static void main (String[] args) {
	   
	    // Define variables
       String inStr;        // input String
       int inStrLen;    	   // length of the input String
	   char result;
       

      // Prompt and read input as "String"
	   Scanner in = new Scanner(System.in);  // Scan the keyboard
       System.out.print("Enter a String: ");
       inStr = in.next();   // use next() to read a String
       inStrLen = inStr.length();
	   in.close();
	   System.out.print("The reverse of the string " + inStr + " is "  );
   
      // Use inStr.charAt(index) in a loop to extract each character
      // The String's index begins at 0 from the left.
      // Process the String from the right
       for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {  
            // charIdx = inStrLen-1, inStrLen-2, ... ,0
			result = inStr.charAt(charIdx);
			System.out.print(result);
       }
   }
 }
 