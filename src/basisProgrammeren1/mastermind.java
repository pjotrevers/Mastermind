package basisProgrammeren1;

import java.util.Scanner;

public class mastermind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	Pionnen:
		String[] kleuren = {"blauw", "groen", "geel", "rood", "paars", "oranje"};;

//		Pinnen:
        String[] pinnen = {"zwart", "wit", "leeg"}; 

//		Vakken:
		String[] vakken = new String[4];

//		Verborgenvakken:
		 String[] verborgenVakken = {kleuren[0], kleuren[1], kleuren[4], kleuren[5]};

		boolean hasWon = false;

		for (int l = 0; l < 10; l++) {
			System.out.println("==========");
			System.out.println("raad de kleuren 1 voor 1 \nkies uit: " + (kleuren[0] + " " + kleuren[1] + " " + kleuren[2] + " " + kleuren[3] + " " + kleuren[4] + " " + kleuren[5] ));
			System.out.println("klik enter na elke kleur die je raad");
			System.out.println("==========");
			System.out.println("ronde: " + (l + 1));

//		input for-loop
			for (int i = 0; i < 4; i++) {
			System.out.println("-voer in pion nummer " + (i + 1));
			vakken[i] = sc.next();
			}
//		checking
//		check1
			System.out.println("==========");
			if (vakken[0].equalsIgnoreCase(verborgenVakken[0])) {
				System.out.println(pinnen[0]);
			} else if ((vakken[0].equalsIgnoreCase(verborgenVakken[1])) || (vakken[0].equalsIgnoreCase(verborgenVakken[2]))
					|| (vakken[0].equalsIgnoreCase(verborgenVakken[3]))) {
				System.out.println(pinnen[1]);
			} else {
				System.out.println(pinnen[2]);
			}
//		check2
			if (vakken[1].equalsIgnoreCase(verborgenVakken[1])) {
				System.out.println(pinnen[0]);
			} else if ((vakken[1].equalsIgnoreCase(verborgenVakken[0])) || (vakken[1].equalsIgnoreCase(verborgenVakken[2]))
					|| (vakken[1].equalsIgnoreCase(verborgenVakken[3]))) {
				System.out.println(pinnen[1]);
			} else {
				System.out.println(pinnen[2]);
			}
//		check3
			if (vakken[2].equalsIgnoreCase(verborgenVakken[2])) {
				System.out.println(pinnen[0]);
			} else if ((vakken[2].equalsIgnoreCase(verborgenVakken[0])) || (vakken[2].equalsIgnoreCase(verborgenVakken[1]))
					|| (vakken[2].equalsIgnoreCase(verborgenVakken[3]))) {
				System.out.println(pinnen[1]);
			} else {
				System.out.println(pinnen[2]);
			}
//		check4
			if (vakken[3].equalsIgnoreCase(verborgenVakken[3])) {
				System.out.println(pinnen[0]);
			} else if ((vakken[3].equalsIgnoreCase(verborgenVakken[0])) || (vakken[3].equalsIgnoreCase(verborgenVakken[1]))
					|| (vakken[3].equalsIgnoreCase(verborgenVakken[2]))) {
				System.out.println(pinnen[1]);
			} else {
				System.out.println(pinnen[2]);
			}
// 		winconditie
			if (vakken[0].equalsIgnoreCase(verborgenVakken[0]) && vakken[1].equalsIgnoreCase(verborgenVakken[1])
					&& vakken[2].equalsIgnoreCase(verborgenVakken[2]) && vakken[3].equalsIgnoreCase(verborgenVakken[3])) {

				System.out.println("==========");
				System.out.println("Je hebt gewonnen!");
				hasWon = true;
				
				if (hasWon == true) {
					l=10;
				}
			}
		}
//		verliesconditie
		if (hasWon == false) {
			System.out.println("==========");
			System.out.println("je hebt al je pogingen gebruikt!");
			System.out.println("je hebt verloren");
			
		}
	}
}
