import java.util.ArrayList;

public class Biblioteka {

	ArrayList<Racun> racuni = new ArrayList<>();
	ArrayList<Knjiga> knjige = new ArrayList<>();

	public Biblioteka() {

	}

	public void dodajRacun(Racun noviRacun) {

		// Ako je racun lista prazna dodaj prvi racun
		if (racuni.isEmpty()) {

			racuni.add(noviRacun);
			System.out.println(" Prvi racun je uspjesno dodat ");
		}

		// ako racun lista nije prazna kreni u dodavanje ostalih racuna
		else {

			for (int i = 0; i < racuni.size(); i++) {

				Racun listaRacuna = racuni.get(i);
				int postojeciBrojRacuna = listaRacuna.getBrojRacuna();
				int noviBroj = noviRacun.getBrojRacuna();

				// ako je racun negativan prekini proces
				if ((postojeciBrojRacuna == noviBroj) && (noviBroj < 0)) {
					System.out.println(
							"Vec je kreiran nalog s tim brojem racuna ili je negativan,molimo unesite drugi broj.");

					return;
				}
			}

			// ako je racun validan dodati ga
			racuni.add(noviRacun);
			System.out.println(" Racun je uspjesno dodat ");
		}
	}

	public void dodajKnjigu(Knjiga knjiga) {

		// ako je lista knjiga prazna dodaj prvi racun

		if (knjige.isEmpty()) {
			knjige.add(knjiga);
			System.out.println("Prva knjiga je uspjesno dodata");
		}

		// ako lista nije prazna pristupi ispitivanju indenticnosti knjige
		else {

			for (int i = 0; i < knjige.size(); i++) {

				Knjiga listaKnjiga = knjige.get(i);
				int postojeciBrojKnjige = listaKnjiga.getBrojKnjige();
				int noviBrojKnjige = knjiga.getBrojKnjige();

				// ako je broj negativan prekini proces
				if ((noviBrojKnjige == postojeciBrojKnjige) && (noviBrojKnjige < 0)) {
					System.out.println(
							"Vec postoji knjiga pod tim brojem ili je broj koji ste unijeli negativan. Molimo unesite drugi broj");

					return;
				}
			}
			// ako je knjiga validna dodati je
			knjige.add(knjiga);
			System.out.println("Knjiga je uspjesno dodata");
		}
	}

	public void podigniKnjigu(int brojRacuna, int brojKnjige) {

		// nadji navedeni racun po broju u listi racuna
		for (int i = 0; i < racuni.size(); i++) {

			Racun racun = racuni.get(i);
			int korisnikovBrojRacuna = racun.getBrojRacuna();
			int brojPosudjenihKnjiga = racun.getBrojPosudjenihKnjiga();

			if ((brojRacuna == korisnikovBrojRacuna) && (brojPosudjenihKnjiga <= 3)) {
				System.out.println("\n Korisnik pronadjen, trazim knjigu...");

				// ukoliko je racun pronadjen pristupi trazenju knjige po broju u listi knjiga
				for (i = 0; i < knjige.size(); i++) {

					Knjiga knjiga = knjige.get(i);
					int brojKnjiga = knjiga.getBrojKnjige();
					boolean statusKnjige = knjiga.getStatusKnjige();

					// ukoliko je knjiga pronadjena pristupi podizanju knjige
					if ((brojKnjiga == brojKnjige) && (statusKnjige = true)) {

						System.out.println("\n" + knjiga.getImeKnjige());

						knjiga.setStatusKnjige(false);
						racun.podigniKnjigu();

						System.out.println("\n Ta knjiga je dostupna i uspjesno podignuta");
					}

					else if ((brojKnjiga == brojKnjige) && (statusKnjige = false)) {
						System.out.println("\n Trazena knjiga nije dostupna");
					}
				}
			}

			else if ((brojRacuna == korisnikovBrojRacuna) && (brojPosudjenihKnjiga > 3)) {
				System.out.println("\n Korisnik je prekoracio limit od 3 dozvoljene podignute knjige.");
			}
		}
	}

	public void vratiKnjigu(int brojRacuna, int brojKnjige) {

			for (int i = 0; i < racuni.size(); i++) { // pronadji navedeni racun po broju u listi

				Racun racun = racuni.get(i);
				int korisnikovBrojRacuna = racun.getBrojRacuna();

					if (brojRacuna == korisnikovBrojRacuna) { // ukoliko je racun pronadjen predji na pronalazak knjige
							System.out.println("\n Korisnik pronadjen, vracam knjigu...");

							for (i = 0; i < knjige.size(); i++) { // pronadji navedenu knjigu po broju u listi

								Knjiga knjiga = knjige.get(i);
								int brojKnjiga = knjiga.getBrojKnjige();
								boolean statusKnjige = knjiga.getStatusKnjige();
								
									if ((brojKnjiga == brojKnjige)) { // ukoliko je knjiga pronadjena vrati knjigu
										
										System.out.println("\n" + knjiga.getImeKnjige());
										
										racun.vratiKnjigu();
										knjiga.setStatusKnjige(true);
					
										System.out.println("\n Knjiga je uspjesno vracena.");
										}
									}
								}
							}
						}

	public void dodajnaListuPodignutihKnjiga(int brojRacuna, int brojKnjige) {

		for (int i = 0; i < racuni.size(); i++) {

			Racun racun = racuni.get(i);
			int korisnikovBrojRacuna = racun.getBrojRacuna();
			
				if (brojRacuna == korisnikovBrojRacuna) {

						for (i = 0; i < knjige.size(); i++) {
						
							Knjiga knjiga = knjige.get(i);
							int brojKnjiga = knjiga.getBrojKnjige();

								if (brojKnjiga == brojKnjige) {
									String imeKnjige = knjiga.getImeKnjige();
									racun.dodajNaLogListu(imeKnjige);
								}
							}
						}
					}
				}

	public void ispisiHistorijuKorisnika(int brojRacuna) {

		for (int i = 0; i < racuni.size(); i++) {

			Racun racun = racuni.get(i);
			int korisnikovBrojRacuna = racun.getBrojRacuna();
			int brojpodignutihKnjiga = racun.getBrojPosudjenihKnjiga();

				if (brojRacuna == korisnikovBrojRacuna) {
					
					if (brojpodignutihKnjiga == 0) {
					System.out.println("Korisnik nema podignutih knjiga");
					} 
					else {
					System.out.println(racun);
					}
				}
			}
		}

	public void getListaRacuna() {

		System.out.println(racuni.toString());

	}

	public void getListaKnjiga() {

		System.out.println(knjige.toString());
	}
}
