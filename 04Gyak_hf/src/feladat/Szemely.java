package feladat;

public class Szemely {

	private String nev;
	private int tomeg;
	private double magassag;
	private double tti;
	private String allapot;

	public double getTti() {
		tti = tomeg / (magassag * magassag);
		return tti;
	}

	public String getDagie() {
		if(tti < 18.5) {
			allapot = "Vekony";
		}else if(tti > 25) {
			allapot = "Kover";
		}else {
			allapot = "Normal";
		}
		return allapot;
	}
	
	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getTomeg() {
		return tomeg;
	}

	public void setTomeg(int tomeg) {
		this.tomeg = tomeg;
	}

	public double getMagassag() {
		return magassag;
	}

	public void setMagassag(double magassag) {
		this.magassag = magassag;
	}

	
	public String toString() {
		return "Szemely Nev=" + nev + ", Suly=" + tomeg + ", Magassag=" + magassag + ", TTI=" + tti + ", Alkat="
				+ allapot + " ";
	}
	
	
	

}
