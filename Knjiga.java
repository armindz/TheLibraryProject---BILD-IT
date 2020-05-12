import java.util.Date;

public class Knjiga {

	String imeKnjige;
	int brojKnjige;
	boolean statusKnjige;
	Date datum;

	public Knjiga(String imeKnjige, int brojKnjige, boolean statusKnjige) {
		this.imeKnjige = imeKnjige;
		this.brojKnjige = brojKnjige;
		this.statusKnjige = statusKnjige;

	}

	public String getImeKnjige() {
		return imeKnjige;
	}

	public int getBrojKnjige() {
		return brojKnjige;
	}

	public boolean getStatusKnjige() {
		return statusKnjige;
	}

	public void setStatusKnjige(boolean statusKnjige) {
		this.statusKnjige = statusKnjige;
	}

	@Override
	public String toString() {
		return "|  Ime knjige : " + imeKnjige + "  | Broj knjige : " + brojKnjige + "   |   Status knjige : "
				+ statusKnjige + "   |   Datum : " + datum + "   |   \n \n";

	}
}
