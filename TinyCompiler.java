/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class TinyCompiler
{
	public static void main(String[] args) 
	{
		Scanner keyin = new Scanner(System.in);
		
		keyin.next();
		keyin.next();
		keyin.next();
		int first = keyin.nextInt();
		keyin.next();
		int second = keyin.nextInt();
		keyin.next();
		int third = keyin.nextInt();
		keyin.next();
		
		System.out.println("MOVI R1, " + first);
		System.out.println("MOVI R2, " + second);
		System.out.println("ADD R0, R1, R2");
		System.out.println("MOVI R2, " + third);
		System.out.println("ADD R0, R0, R2");
		System.out.println("STORE [0], R0");
	}

}