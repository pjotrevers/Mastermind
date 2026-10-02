package basisProgrammeren1;

import java.util.Scanner;

public class mastermind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		{
		}
//	Pionnen:
		String blauwePion = "blauw";
		String groenePion = "groen";
		String gelePion = "geel";
		String rodePion = "rood";
		String paarsePion = "paars";
		String oranjePion = "oranje";

//		Pinnen:
		String zwartePin = "zwart";
		String wittePin = "wit";
		String legePin = "leeg";

//		Rijvakken:
		String rijVak1 = "";
		String rijVak2 = "";
		String rijVak3 = "";
		String rijVak4 = "";

//		Verborgenrijvakken:
		String verborgenRijVak1 = blauwePion;
		String verborgenRijVak2 = groenePion;
		String verborgenRijVak3 = paarsePion;
		String verborgenRijVak4 = oranjePion;

//		Spelers:
		String speler1 = "";
		String speler2 = "";

//		Checkvakken:
		String rijCheckVak1 = "";
		String rijCheckVak2 = "";
		String rijCheckVak3 = "";
		String rijCheckVak4 = "";

		boolean hasWon = false;

		for (int i = 0; i < 10; i++) {
			System.out.println(
					"raad de kleuren 1 voor 1 \nkies uit (blauw/groen/geel/rood/paars/oranje) \nklik enter na elke kleur die je raad");
			System.out.println("==========");
			System.out.println("ronde: " + (i + 1));

//		input
			System.out.println("-voer je 1ste pion keuze in");
			rijVak1 = sc.next();
			System.out.println("-voer je 2de pion keuze in");
			rijVak2 = sc.next();
			System.out.println("-voer je 3de pion keuze in");
			rijVak3 = sc.next();
			System.out.println("-voer je 4de pion keuze in");
			rijVak4 = sc.next();

//		checking
//		check1
			System.out.println("==========");
			if (rijVak1.equalsIgnoreCase(verborgenRijVak1)) {
				System.out.println(zwartePin);
			} else if ((rijVak1.equalsIgnoreCase(verborgenRijVak2)) || (rijVak1.equalsIgnoreCase(verborgenRijVak3))
					|| (rijVak1.equalsIgnoreCase(verborgenRijVak4))) {
				System.out.println(wittePin);
			} else {
				System.out.println(legePin);
			}
//		check2
			if (rijVak2.equalsIgnoreCase(verborgenRijVak2)) {
				System.out.println(zwartePin);
			} else if ((rijVak2.equalsIgnoreCase(verborgenRijVak1)) || (rijVak2.equalsIgnoreCase(verborgenRijVak3))
					|| (rijVak2.equalsIgnoreCase(verborgenRijVak4))) {
				System.out.println(wittePin);
			} else {
				System.out.println(legePin);
			}
//		check3
			if (rijVak3.equalsIgnoreCase(verborgenRijVak3)) {
				System.out.println(zwartePin);
			} else if ((rijVak3.equalsIgnoreCase(verborgenRijVak1)) || (rijVak3.equalsIgnoreCase(verborgenRijVak2))
					|| (rijVak3.equalsIgnoreCase(verborgenRijVak4))) {
				System.out.println(wittePin);
			} else {
				System.out.println(legePin);
			}
//		check4
			if (rijVak4.equalsIgnoreCase(verborgenRijVak4)) {
				System.out.println(zwartePin);
			} else if ((rijVak4.equalsIgnoreCase(verborgenRijVak1)) || (rijVak4.equalsIgnoreCase(verborgenRijVak2))
					|| (rijVak4.equalsIgnoreCase(verborgenRijVak3))) {
				System.out.println(wittePin);
			} else {
				System.out.println(legePin);

			}

			if (rijVak1.equalsIgnoreCase(verborgenRijVak1) && rijVak2.equalsIgnoreCase(verborgenRijVak2)
					&& rijVak3.equalsIgnoreCase(verborgenRijVak3) && rijVak4.equalsIgnoreCase(verborgenRijVak4)) {

				System.out.println("==========");
				System.out.println("Je hebt gewonnen!");
				hasWon = true;
			}
		}
		if (hasWon == false) {
			System.out.println("==========");
			System.out.println("je hebt verloren");
			System.out.println("je hebt al je pogingen gebruikt!");
		}
	}
}
