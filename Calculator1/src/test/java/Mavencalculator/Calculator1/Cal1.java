package Mavencalculator.Calculator1;
import java.util.Scanner;

import org.junit.Test;
public class Cal1 {
	@Test
   public void CalTest(){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number1");
	   int r1=sc.nextInt();
	   System.out.println("Enter number2");
	   int r2=sc.nextInt();
	   System.out.println("1.Addition");
	   System.out.println("2.Subtraction");
	   System.out.println("3.Multiplication");
	   System.out.println("4.Division");
	   System.out.println("Enter choice");
	   int c=sc.nextInt();
	   Test2 obj1=new Test2(r1,r2);
	   if(c>=1 && c<5) {
		   int[] choice= {
				   obj1.add(r1, r2),
				   obj1.sub(r1, r2),
				   obj1.mul(r1,r2),
				   obj1.div(r1, r2)
		   };
		   System.out.println("Result:"+choice[c-1]);
	       }
	   else {
		   System.out.println("Invalid input");
	   }
	   
   }
}
