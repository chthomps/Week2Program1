
/*
 Programming Fundamentals
 Christopher Thompson
 Programming Assignment1
 */

import java.util.Scanner;
import java.util.Random;

public class Cipher {

	public static void main(String[] args) {
		
		int entry1, entry2, entry3, entry4, entry5, sum, key, tens, ones, tensCoded, onesCoded;
		
		System.out.println("Welcome to the Cipher Program!");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 5 numbers between 0 and 19: ");
		
		entry1 = scan.nextInt();
			if (entry1>0 || entry1<19)
				System.out.println("1st number: "+entry1);
			else
			{
				System.out.println("Please read directions and try again!");
				System.exit(0);
			}
		
		entry2 = scan.nextInt();
			if (entry2>0 || entry2<19)
				System.out.println("2nd number: "+entry2);
			else
			{
				System.out.println("Please read directions and try again!");
				System.exit(0);
			}
			
		entry3 = scan.nextInt();
			if (entry3>0 || entry3<19)
				System.out.println("3rd number: "+entry3);
			else
			{
				System.out.println("Please read directions and try again!");
				System.exit(0);
			}
		
		entry4 = scan.nextInt();
			if (entry4>0 || entry4<19)
				System.out.println("4th number: "+entry4);
			else
			{
				System.out.println("Please read directions and try again!");
				System.exit(0);
			}
		
		entry5 = scan.nextInt();
			if (entry5>0 || entry5<19)
				System.out.println("5th number: "+entry5);
			else
			{
				System.out.println("Please read directions and try again!");
				System.exit(0);
			}
	
		scan.close();
		
		//computes the sum
		sum= (entry1 + entry2 + entry3 + entry4 + entry5);
			System.out.println("Total= "+sum);
		
		//generates random key
		Random generator = new Random();
		key = generator.nextInt(10);
			System.out.println("Your random key is: "+ key);
		
		//encoded number broken down by tens and ones
		tens = (sum/10);
		ones = (sum%10);
		 
		tensCoded =(tens+key)%10;
		onesCoded =(ones+key)%10;
		
			System.out.println("Your encoded number is: " +tensCoded+onesCoded);
		
	}

}

