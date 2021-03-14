package b;

public class AlkFut {

	public static void main(String[] args) {
		Alkalmazott alk = new Alkalmazott();

		alk.setNev("Tomi");
		alk.setFizetes(-1);
	

		System.out.println(alk.getAdatok());

		alk.fizetesNovel(1);
		System.out.println(alk.getAdatok());

	}

}
