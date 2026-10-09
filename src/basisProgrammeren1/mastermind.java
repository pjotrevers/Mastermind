package basisProgrammeren1;

import java.util.Scanner;

public class mastermind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		{
		}
//	Pionnen:
		String[] kleur = {"blauw", "groen", "geel", "rood", "paars", "oranje"};;

//		Pinnen:
        String[] pin = {"zwart", "wit", "leeg"}; 

//		Vakken:
		String[] vak = new String[4];

//		Verborgenrijvakken:
		 String[] verborgenVak = {kleur[0], kleur[1], kleur[4], kleur[5]};

		boolean hasWon = false;

		for (int l = 0; l < 10; l++) {
			System.out.println("==========");
			System.out.println("raad de kleuren 1 voor 1 \nkies uit (blauw/groen/geel/rood/paars/oranje) \nklik enter na elke kleur die je raad");
			System.out.println("==========");
			System.out.println("ronde: " + (l + 1));

//		input (for-loop
			for (int i = 0; i < 4; i++) {
			System.out.println("-voer je pion in");
			vak[i] = sc.next();
			}
//		checking
//		check1
			System.out.println("==========");
			if (vak[0].equalsIgnoreCase(verborgenVak[0])) {
				System.out.println(pin[0]);
			} else if ((vak[0].equalsIgnoreCase(verborgenVak[1])) || (vak[0].equalsIgnoreCase(verborgenVak[2]))
					|| (vak[0].equalsIgnoreCase(verborgenVak[3]))) {
				System.out.println(pin[1]);
			} else {
				System.out.println(pin[2]);
			}
//		check2
			if (vak[1].equalsIgnoreCase(verborgenVak[1])) {
				System.out.println(pin[0]);
			} else if ((vak[1].equalsIgnoreCase(verborgenVak[0])) || (vak[1].equalsIgnoreCase(verborgenVak[2]))
					|| (vak[1].equalsIgnoreCase(verborgenVak[3]))) {
				System.out.println(pin[1]);
			} else {
				System.out.println(pin[2]);
			}
//		check3
			if (vak[2].equalsIgnoreCase(verborgenVak[2])) {
				System.out.println(pin[0]);
			} else if ((vak[2].equalsIgnoreCase(verborgenVak[0])) || (vak[2].equalsIgnoreCase(verborgenVak[1]))
					|| (vak[2].equalsIgnoreCase(verborgenVak[3]))) {
				System.out.println(pin[1]);
			} else {
				System.out.println(pin[2]);
			}
//		check4
			if (vak[3].equalsIgnoreCase(verborgenVak[3])) {
				System.out.println(pin[0]);
			} else if ((vak[3].equalsIgnoreCase(verborgenVak[0])) || (vak[3].equalsIgnoreCase(verborgenVak[1]))
					|| (vak[3].equalsIgnoreCase(verborgenVak[2]))) {
				System.out.println(pin[1]);
			} else {
				System.out.println(pin[2]);
			}
// 		winconditie
			if (vak[0].equalsIgnoreCase(verborgenVak[0]) && vak[1].equalsIgnoreCase(verborgenVak[1])
					&& vak[2].equalsIgnoreCase(verborgenVak[2]) && vak[3].equalsIgnoreCase(verborgenVak[3])) {

				System.out.println("==========");
				System.out.println("Je hebt gewonnen!");
				hasWon = true;
				
				if (hasWon = true) {
					l=10;
					}
			}
		}
//		winconditie
		if (hasWon == false) {
			System.out.println("==========");
			System.out.println("je hebt al je pogingen gebruikt!");
			System.out.println("je hebt verloren");
			
		}
	}
}
