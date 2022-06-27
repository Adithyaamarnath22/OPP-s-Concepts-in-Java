package Prgm;

import java.util.Scanner;

public class guess_number {
	public static void main(String args[]) {
		int number;
		number=(int) (Math.random()*100);
		Scanner S=new Scanner(System.in);
		int guess;
		int i;
		int limit=5;
		
		for(i=1;i<=limit;i++) {
		
		
		
			System.out.println("\nenter the guess(1-100):");
			guess=S.nextInt();
			if(guess==number) {
				System.out.println("your guess is correct");
				break;
				}
				else if(guess<number && i!=limit-1) {
					System.out.printf("\n%d your guess is smaller than the number",guess);
				}
				else if(guess>number && i!=limit-1) {
					System.out.printf("\n%d your guess is greater than the number",guess);
				}
		}
				if 
					(i==limit) 
			System.out.println("you have exhausted the limit");
			System.out.println("the number was"+number);

	}
	}





