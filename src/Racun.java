import java.util.Arrays;

public class Racun {

	int brojRacuna;
	String imeMusterije;
	int brojPosudjenihKnjiga;
	String[] listaPodignutihKnjiga = new String[4];

	public Racun(int brojRacuna, String imeMusterije, int brojPosudjenihKnjiga) {
		this.brojRacuna = brojRacuna;
		this.imeMusterije = imeMusterije;
		this.brojPosudjenihKnjiga = brojPosudjenihKnjiga;

	}

	public int getBrojRacuna() {
		return brojRacuna;
	}

	public String getImeMusterije() {
		return imeMusterije;
	}

	public int getBrojPosudjenihKnjiga() {
		return brojPosudjenihKnjiga;
	}

	public void getListaPodignutihKnjiga() {

		for (int i = 0; i < listaPodignutihKnjiga.length; i++) {
			System.out.println(listaPodignutihKnjiga[i]);
		}

	}

	public void dodajNaLogListu(String imeKnjige) {

		listaPodignutihKnjiga[brojPosudjenihKnjiga] = imeKnjige;
	}

	public void obrisiSLogListe(String imeKnjige) {
	
		for (int i = 0; i < listaPodignutihKnjiga.length - 1; i++) {

			if (listaPodignutihKnjiga[i] == imeKnjige) {
					listaPodignutihKnjiga[i] = listaPodignutihKnjiga[listaPodignutihKnjiga.length - 1];

				
					for (int g = i; g < listaPodignutihKnjiga.length - 1; g++) {
							listaPodignutihKnjiga[g] = listaPodignutihKnjiga[g + 1];
				}
				
					
					System.out.println("Nakon vracanja knjige lista podignutih knjiga je : "+ Arrays.toString(listaPodignutihKnjiga));
			}
		}
	}

	public void podigniKnjigu() {
		brojPosudjenihKnjiga++;
	}

	public void vratiKnjigu() {
		brojPosudjenihKnjiga--;
	}

	@Override
	public String toString() {
		return "|   Broj racuna : " + brojRacuna + "  |   Ime musterije : " + imeMusterije
				+ "   |   Posudjenih knjiga : " + brojPosudjenihKnjiga + "   |   Podignute knjige : "
				+ Arrays.toString(listaPodignutihKnjiga) + "   |    \n \n";
	}
}
