package basisProgrammeren1;

import java.util.Scanner;

public class mastermind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); {
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
		String rij1Vak1 = "";
		String rij1Vak2 = "";
		String rij1Vak3 = "";
		String rij1Vak4 = "";

		String rij2Vak1 = "";
		String rij2Vak2 = "";
		String rij2Vak3 = "";
		String rij2Vak4 = "";

		String rij3Vak1 = "";
		String rij3Vak2 = "";
		String rij3Vak3 = "";
		String rij3Vak4 = "";

		String rij4Vak1 = "";
		String rij4Vak2 = "";
		String rij4Vak3 = "";
		String rij4Vak4 = "";

		String rij5Vak1 = "";
		String rij5Vak2 = "";
		String rij5Vak3 = "";
		String rij5Vak4 = "";


		String rij6Vak1 = "";
		String rij6Vak2 = "";
		String rij6Vak3 = "";
		String rij6Vak4 = "";

		String rij7Vak1 = "";
		String rij7Vak2 = "";
		String rij7Vak3 = "";
		String rij7Vak4 = "";

		String rij8Vak1 = "";
		String rij8Vak2 = "";
		String rij8Vak3 = "";
		String rij8Vak4 = "";

		String rij9Vak1 = "";
		String rij9Vak2 = "";
		String rij9Vak3 = "";
		String rij9Vak4 = "";

		String rij10Vak1 = "";
		String rij10Vak2 = "";
		String rij10Vak3 = "";
		String rij10Vak4 = "";

//		Verborgenrijvakken:
		String verborgenRijVak1 = "blauw";
		String verborgenRijVak2 = "groen";
		String verborgenRijVak3 = "paars";
		String verborgenRijVak4 = "oranje";

//		Spelers:
		String speler1 = "";
		String speler2 = "";

//		Checkvakken:
		String rij1CheckVak1 = "";
		String rij1CheckVak2 = "";
		String rij1CheckVak3 = "";
		String rij1CheckVak4 = "";

		String rij2CheckVak1 = "";
		String rij2CheckVak2 = "";
		String rij2CheckVak3 = "";
		String rij2CheckVak4 = "";

		String rij3CheckVak1 = "";
		String rij3CheckVak2 = "";
		String rij3CheckVak3 = "";
		String rij3CheckVak4 = "";

		String rij4CheckVak1 = "";
		String rij4CheckVak2 = "";
		String rij4CheckVak3 = "";
		String rij4CheckVak4 = "";

		String rij5CheckVak1 = "";
		String rij5CheckVak2 = "";
		String rij5CheckVak3 = "";
		String rij5CheckVak4 = "";

		String rij6CheckVak1 = "";
		String rij6CheckVak2 = "";
		String rij6CheckVak3 = "";
		String rij6CheckVak4 = "";

		String rij7CheckVak1 = "";
		String rij7CheckVak2 = "";
		String rij7CheckVak3 = "";
		String rij7CheckVak4 = "";

		String rij8CheckVak1 = "";
		String rij8CheckVak2 = "";
		String rij8CheckVak3 = "";
		String rij8CheckVak4 = "";



		String rij9CheckVak1 = "";
		String rij9CheckVak2 = "";
		String rij9CheckVak3 = "";
		String rij9CheckVak4 = "";

		String rij10CheckVak1 = "";
		String rij10CheckVak2 = "";
		String rij10CheckVak3 = "";
		String rij10CheckVak4 = "";
		
		System.out.println("guess 4 colors 1 for 1");
		
//		input
		rij1Vak1 = sc .next();
		rij1Vak2 = sc .next();
		rij1Vak3 = sc .next();
		rij1Vak4 = sc .next();
		
//		checking
//		check1
		if (rij1Vak1.equalsIgnoreCase(verborgenRijVak1))
		{
			System.out.println(zwartePin);			
		}
		else if( (rij1Vak1.equalsIgnoreCase(verborgenRijVak2))
				|| (rij1Vak1.equalsIgnoreCase(verborgenRijVak3))
				|| (rij1Vak1.equalsIgnoreCase(verborgenRijVak4)))
		{
			System.out.println(wittePin);			
		}
		else {
			System.out.println(legePin);
		}
//		check2
		if (rij1Vak2.equalsIgnoreCase(verborgenRijVak2))
		{
			System.out.println(zwartePin);			
		}
		else if( (rij1Vak2.equalsIgnoreCase(verborgenRijVak1))
				|| (rij1Vak2.equalsIgnoreCase(verborgenRijVak3))
				|| (rij1Vak2.equalsIgnoreCase(verborgenRijVak4)))
		{
			System.out.println(wittePin);			
		}
		else {
			System.out.println(legePin);
		}
//		check3
		if (rij1Vak3.equalsIgnoreCase(verborgenRijVak3))
		{
			System.out.println(zwartePin);			
		}
		else if( (rij1Vak3.equalsIgnoreCase(verborgenRijVak1))
				|| (rij1Vak3.equalsIgnoreCase(verborgenRijVak2))
				|| (rij1Vak3.equalsIgnoreCase(verborgenRijVak4)))
		{
			System.out.println(wittePin);			
		}
		else {
			System.out.println(legePin);
		}
//		check4
		if (rij1Vak4.equalsIgnoreCase(verborgenRijVak4))
		{
			System.out.println(zwartePin);			
		}
		else if( (rij1Vak4.equalsIgnoreCase(verborgenRijVak1))
				|| (rij1Vak4.equalsIgnoreCase(verborgenRijVak2))
				|| (rij1Vak4.equalsIgnoreCase(verborgenRijVak3)))
		{
			System.out.println(wittePin);			
		}
		else {
			System.out.println(legePin);
		}
	}
}
