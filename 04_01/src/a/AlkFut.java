package a;

public class AlkFut {

	public static void main(String[] args) {
		Alkalmazott alk = new Alkalmazott();

		alk.nev = "Tomi";
		alk.fizetes = -1;

		System.out.println(alk.getAdatok());

		alk.fizetesNovel(1);
		System.out.println(alk.getAdatok());

	}

}
