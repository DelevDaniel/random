package november7;

import java.util.Scanner;

public class Menu {
	static Scanner sc2 = new Scanner(System.in);

	public static void rules() {
		
		
		boolean check = true;
		
		Menu.clear();
		System.out.println("3-7-Bums " + "Regeln: Es wird gestartet von 1 an hoch zu zählen. Sollte die folgende Zahl"
				+ "\n" + "\n		durch 3  teilbar sein" + "\n		durch 7 teilbar sein" + "\n		oder als Ziffer 3 oder 7 enthalten"
				+ "\n" + "\nmuss anstatt der Zahl \"Bums\"[b] genannt werden."
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\nverlassen durch [q]");


		while(check) {
			if (sc2.nextLine().equals("q"))
				check = false;
		}

	}
	
	public static void einstellungen() {
		
		
		
	}

	public static void startMenu() {

		boolean check = true;
		
		


		while(check) {
			
			Menu.clear();
			System.out.println("			:::::::::Drei-Sieben-Bums::::::::::");
			System.out.println("			(1) Spiel starten"
					+ "\n			(2)Regeln"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n");
			
			String input = sc2.nextLine();
			
			switch(Integer.parseInt(input)) {

			case 1: check = false;
					break;

			case 2: rules();
					break;

			default: break;
			}
		}
	}
	
	public static void returnMenu() {
		
		Menu.clear();
		System.out.println("			:::::::::Game Over:::::::::");
		System.out.println("			(1) zurück zum Start Menü"
				+ "\n			(2) Spiel beenden");
		
		String eingabe =sc2.nextLine();
		
		switch(Integer.parseInt(eingabe)) {

		case 1: 
				break;

		case 2: System.out.println("bye bye");
				System.exit(-1);
				break;

		default: break;
		}	
		
	}
	
	public static void clear() {
		for(int i= 0; i < 50;i++)
			System.out.println();
	}
	
	
}
