package november7;

import java.util.Scanner;

public class Programm {

	public static void game(int a, int b) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Starte mit 1!");

		for (int i = 1;; i++) {

			String input = sc.nextLine();

//check ob zahl durch 3 oder 7 teilbar ist (bzw. durch a und b)

			if ((i % a == 0) || (i % b == 0)) {

				if (input.equals("b"))
					System.out.println("BUMS!");
				else {
					System.out.println("WROOONG");
					break;
				}

			}

//check ob zahl 3 oder 7 enthält (bzw. a oder b)			

			else if (String.valueOf(i).contains(String.valueOf(a)) || String.valueOf(i).contains(String.valueOf(b))) {

				if (input.equals("b"))
					System.out.println("BUMS!");
				else {
					System.out.println("WROOONG");
					break;
				}
			}

//wenn zahl keine "bums" zahl ist, check ob zahl in der richtigen reihenfolge eingegeben wurde			

			else {

				if (Integer.parseInt(input) == i)
					System.out.println("Richtig");
				else {
					System.out.println("WROOONG");
					break;
				}
				
			}
			
		}
		

	}

//overload method falls man nur mit einer zahl spielt

	public static void game(int a) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Starte mit 1!");

		for (int i = 1;; i++) {

			String input = sc.nextLine();

			if ((i % a) == 0) {

				if (input.equals("b"))
					System.out.println("Richtig");
				else {
					System.out.println("WROOONG");
					break;
				}

			}

			else if (String.valueOf(i).contains(String.valueOf(a))) {

				if (input.equals("b"))
					System.out.println("Richtig");
				else {
					System.out.println("WROOONG");
					break;
				}
			}

			else {

				if (Integer.parseInt(input) == i)
					System.out.println("Richtig");
				else {
					System.out.println("WROOONG");
					break;
				}
			}
		}

		sc.close();

	}

}
