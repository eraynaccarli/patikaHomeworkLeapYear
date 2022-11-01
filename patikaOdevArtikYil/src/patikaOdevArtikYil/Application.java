package patikaOdevArtikYil;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter year: ");
		int yearInput = sc.nextInt();
		
		// yýl 4 ile tam bölünüyorsa
		if(yearInput % 4 == 0) {
			// 100 le bolumunden kalan sýfýr ama 400 le bolumunden kalan sýfýr deðilse
			if(yearInput % 100 == 0 &&  yearInput % 400 != 0) {
				System.out.println(yearInput + " is a not leap year!");
			}
			
			else {
				System.out.println(yearInput + " is a leap year!");
			}			
			
		}
		
		else {
			System.out.println( yearInput + " is a not leap year!");
		}
		
	}

}
