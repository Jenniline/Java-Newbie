//11. Write a Java program to print the area and perimeter of a circle.
public class MianClass {

    public static void main(String[] args) {
	double radius = 7.5;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area is :" + area);
    }
}

//12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
import java.util.Scanner;
 
public class MainClass {
 
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
   
  System.out.println("Input first number: ");
  int num1 = input.nextInt();
  System.out.println("Input second number: ");
  int num2 = input.nextInt(); 
  System.out.println("Input third number: ");
  int num3 = input.nextInt();
  System.out.println("Input fourth number: ");
  int num4 = input.nextInt();
  System.out.print("Enter fifth number: ");
  int num5 = input.nextInt();
  
  System.out.println("Average: " + (num1 + num2 + num3 + num4 + num5) / 5);
 }
}

//13. Write a Java program to print the area and perimeter of a rectangle
public class MainClass {
 
   public static void main(String[] args) {

         double width = 5.6;
         double height = 8.5;

        double perimeter = 2*(height + width);
		
        double area = width * height;			
		
	System.out.println("Perimeter is 2*(%.2f + %.2f) = %.2f \n", height, width, perimeter);

        System.out.println("Area is %.2f * %.2f = %.2f \n", width, height, area);
    }
}

//14. Write a Java program to print an American flag on the screen.

public class MainClass{
	public static void main(String[] args){

	System.out.println("* * * * * * ==================================")                         
 	System.out.println("* * * * *  ================================== ")                         
	System.out.println("* * * * * * ==================================")                          
 	System.out.println("* * * * *  ================================== ")                         
	System.out.println("* * * * * * ==================================")                        
 	System.out.println("* * * * *  ================================== ")                         
	System.out.println("* * * * * * ==================================")                          
 	System.out.println("* * * * *  ================================== ")                         
	System.out.println("* * * * * * ==================================")                          
	System.out.println("==============================================")                          
	System.out.println("==============================================")                          
	System.out.println("==============================================")                         
	System.out.println("==============================================")                         
	System.out.println("==============================================")                          
	System.out.println("==============================================")
       }
}

//15. Write a Java program to swap two variables.

public class MainClass {
  public static void main(String[] args) {
   int a=15, b=27;
   
   System.out.println("Before : a, b = "+a+", "+ + b);
   a = a + b;
   b = a - b;
   a = a - b;
   System.out.println("After : a, b = "+a+", "+ + b);
 }
 
}


//16. Write a Java program to print a face

public class MainClass{

	public static main void(String[] args){
	 
	 System.out.println("+\"\"\"\"\"+")                                                
	 System.out.println("[| o o |] ")                                                
	 System.out.println(" |  ^  | ")                                                 
	 System.out.println(" | '-' |")                                                  
	 System.out.println(" +-----+ ") 
	
	}
}
//17. Write a Java program to add two binary numbers.

import java.util.Scanner;
public class MainClass {
 public static void main(String[] args){

  long b1, b2;
  int i = 0, remainder = 0;
  int sum[] = new int[20];
  Scanner input = new Scanner(System.in);

  System.out.println("First binary number: ");
  b1 = input.nextLong();
  System.out.println("Second binary number: ");
  b2 = input.nextLong();

  while (b1 != 0 || b2 != 0) 
  {
   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
   b1 = b1 / 10;
   b2 = b2 / 10;
  }
  if (remainder != 0) {
   sum[i++] = remainder;
  }
  --i;
  System.out.println("Sum of two binary numbers: ");
  while (i >= 0) {
   System.out.println(sum[i--]);
  } 
 }
}

//20. Write a Java program to convert a decimal number to hexadecimal number.
import java.util.Scanner;
public class MainClass {
      public static void main(String args[])
    {
        int decimal, remainder;
        String hexdecimal="";
        char hexVals[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner input = new Scanner(System.in);
		
        System.out.println("Input decimal number: ");
        decimal = input.nextInt();
		
        while(decimal>0)
        {
            remainder = decimal % 16;
            hexadecimal = hexVals[remainder] + hexadecimal;
            decimal= decimal / 16;
        }
        System.out.println("Hexadecimal number is : " + hexdec_num);         
    }
}

