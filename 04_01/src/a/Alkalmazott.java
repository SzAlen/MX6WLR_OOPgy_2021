package a;

public class Alkalmazott {
	String nev;
	int fizetes;

	public void fizetesNovel(int ertek) {
		fizetes += ertek;
	}

	public String getAdatok() {
		return "Nev: " + nev + " " + "Fizetes: " + fizetes;
	}
}
