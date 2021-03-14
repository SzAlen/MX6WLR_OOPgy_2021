package Konyv;

public class konyv {

	private String cim;
	private String szerzo;
	private int ev;
	private double ar;

	public konyv(String cim, String szerzo, int ev, double ar) {
		this.cim = cim;
		this.szerzo = szerzo;
		this.ev = ev;
		this.ar = ar;
	}
	
	public konyv(String cim, String szerzo) {
		this.cim = cim;
		this.szerzo = szerzo;
		this.ev = 2021;
		this.ar = 2500;
	}
	
	public void setArNovel(double szazalek) {
		this.ar = this.ar + (ar * (szazalek / 100));
	}

	@Override
	public String toString() {
		return "konyv [cim=" + cim + ", szerzo=" + szerzo + ", ev=" + ev + ", ar=" + ar + "]";

	}

	public String getCim() {
		return cim;
	}

	public void setCim(String cim) {
		this.cim = cim;
	}

	public String getSzerzo() {
		return szerzo;
	}

	public void setSzerzo(String szerzo) {
		this.szerzo = szerzo;
	}

	public int getEv() {
		return ev;
	}

	public void setEv(int ev) {
		this.ev = ev;
	}

	public double getAr() {
		return ar;
	}

	public void setAr(double ar) {
		this.ar = ar;
	}

}
