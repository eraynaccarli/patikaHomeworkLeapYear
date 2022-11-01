package patikaOdevArtikYil;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter year: ");
		int yearInput = sc.nextInt();
		
		// y�l 4 ile tam b�l�n�yorsa
		if(yearInput % 4 == 0) {
			// 100 le bolumunden kalan s�f�r ama 400 le bolumunden kalan s�f�r de�ilse
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
