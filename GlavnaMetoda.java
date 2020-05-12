import java.util.Scanner;

public class GlavnaMetoda {

	

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		int brojRacuna;
		int brojKnjige;
		String tipkovnica= "-1";
		
		
			// formiranje biblioteke
			Biblioteka gradskaBiblioteka = new Biblioteka();

			// formiranje racuna s pratecim podacima
			Racun racun1 = new Racun(0, "Adnan", 0);
			Racun racun2 = new Racun(1, "Hasan", 0);
			Racun racun3 = new Racun(2, "Armin", 0);
			Racun racun4 = new Racun(3, "Eldar", 0);

			// dodavanje racuna u listu
			gradskaBiblioteka.dodajRacun(racun1);
			gradskaBiblioteka.dodajRacun(racun2);
			gradskaBiblioteka.dodajRacun(racun3);
			gradskaBiblioteka.dodajRacun(racun4);
			
			// ispisi dodane racune
			gradskaBiblioteka.getListaRacuna();

			System.out.println("----------------------------------------------------");
			
			
			// formiranje knjiga
			Knjiga knjiga1 = new Knjiga("Moje ime je Crvena - Orhan Pamuk", 0, true);
			Knjiga knjiga2 = new Knjiga("Na drini cuprija - Ivo Andric", 1, true);
			Knjiga knjiga3 = new Knjiga("Basta sljezove boje - Branko Copic", 2, true);
			Knjiga knjiga4 = new Knjiga("Zerminal - Emil Zola", 3, true);

			gradskaBiblioteka.dodajKnjigu(knjiga1);
			gradskaBiblioteka.dodajKnjigu(knjiga2);
			gradskaBiblioteka.dodajKnjigu(knjiga3);
			gradskaBiblioteka.dodajKnjigu(knjiga4);

			// ispisi dodate knjige
			gradskaBiblioteka.getListaKnjiga();
		
	

			
// interakcija s korisnikom aplikacije
	System.out.println("Dobrodosli u biblioteku.");
	System.out.println("| (1) PODIGNI KNJIGU  | (2)  VRATI KNJIGU  | (3)  INFORMACIJE O KNJIGAMA | (4)  INFORMACIJE O KORISNICIMA | (5)  HISTORIJA  |  ( 6 ) IZLAZ  |");
		

		while (tipkovnica != "6") {
			
			tipkovnica = unos.nextLine();
			
				switch (tipkovnica) {
			
					case "1":

						System.out.println("|   (1) PODIGNI KNJIGU  |");

						System.out.println("Molimo unesite broj racuna korisnika koji dize knjigu:");
						brojRacuna = unos.nextInt();

						System.out.println("Unesite broj knjige koju korisnik dize :");
						brojKnjige = unos.nextInt();

						gradskaBiblioteka.podigniKnjigu(brojRacuna, brojKnjige);
						gradskaBiblioteka.dodajnaListuPodignutihKnjiga(brojRacuna, brojKnjige);
				
						continue;
				
			
					case "2":

						System.out.println("\n |    (2)  VRATI KNJIGU    |");

						System.out.println("Molimo unesite broj racuna korisnika koji vraca knjigu:");
						brojRacuna = unos.nextInt();

						System.out.println("Unesite broj knjige koju korisnik vraca:");
						brojKnjige = unos.nextInt();

						gradskaBiblioteka.vratiKnjigu(brojRacuna, brojKnjige);

						continue;

					case "3":
						
						System.out.println("\n | (3)  INFORMACIJE O KNJIGAMA  | ");
						gradskaBiblioteka.getListaKnjiga();
				
						continue;
						
					case "4":
						
						System.out.println("\n | (4)  INFORMACIJE O KORISNICIMA |  ");
						gradskaBiblioteka.getListaRacuna();
				
						continue;
						
					case "5" :
						
						System.out.println("\n  |    (5)    HISTORIJA    |");
			
						System.out.println("Molimo unesite broj racuna korisnika");
						brojRacuna = unos.nextInt();
						gradskaBiblioteka.ispisiHistorijuKorisnika(brojRacuna);

						continue;
				}
				
System.out.println("| (1) PODIGNI KNJIGU  | (2)  VRATI KNJIGU  | (3)  INFORMACIJE O KNJIGAMA | (4)  INFORMACIJE O KORISNICIMA | (5)  HISTORIJA  |  ( 6 ) IZLAZ  |");
		}
		
		unos.close();
	}
	
}
