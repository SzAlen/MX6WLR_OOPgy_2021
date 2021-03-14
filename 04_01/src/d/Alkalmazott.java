package d;

public class Alkalmazott {
	private String nev;
	private int fizetes;
	
	public Alkalmazott(String nev, int fizetes) {
		this.nev = nev;
		this.fizetes = fizetes;
	}
	
	public Alkalmazott(String nev) {
		this.nev = nev;
		this.fizetes = 2500000;
	}
	

	public void fizetesNovel(int ertek) {
		this.fizetes += ertek;
	}

	@Override
	public String toString() {
		return "Nev: " + this.nev + " " + "Fizetes: " + this.fizetes;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public void setFizetes(int fizetes) {
		this.fizetes = fizetes;
	}

	public String setNev() {
		return this.nev;
	}

	public int getFizetes() {
		return this.fizetes;
	}

	public boolean getFizHatarok(int also, int felso) {
		if (this.fizetes <= felso && this.fizetes >= also)
			return true;

		return false;
	}

	public double getAdo() {
		return this.fizetes * 0.16;
	}

	public boolean getAlkFizNagyobb(Alkalmazott alk) {
		if (this.fizetes > alk.fizetes)
			return true;

		return false;
	}
}
