package slackChat;

import java.util.Scanner;

public class SlackChat {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Unesite ime");
		String ime = s.nextLine();
		System.out.println("Unesite prezime");
		String prezime = s.nextLine();
		System.out.println("Unesite poruku");
		String poruka = s.nextLine();
		String reakcija = "";

		int lol = 0;
		int heart = 0;
		int sunglasses = 0;
		int grin = 0;
		int cry = 0;

		while (!reakcija.equals("Kraj")) {
			System.out.println("Unesite reakciju (lol,heart,sunglasses,grin,cry) ili Kraj ");
			reakcija = s.nextLine();
			;

			switch (reakcija) {
			case "lol":
				lol += 1;
				break;
			case "heart":
				heart += 1;
				break;
			case "sunglasses":
				sunglasses += 1;
				break;
			case "grin":
				grin += 1;
				break;
			case "cry":
				cry += 1;
				break;
			}
		}

		System.out.println(ime + " " + prezime);
		System.out.println(poruka);
		System.out.println("lol (" + lol + ") heart (" + heart + ") sunglasses (" + sunglasses + ") grin (" + grin
				+ ") cry (" + cry + ")");
		s.close();
	}

}
