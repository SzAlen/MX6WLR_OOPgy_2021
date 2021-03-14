package c;

public class AlkFut {

	public static void main(String[] args) {
		
		Alkalmazott alk = new Alkalmazott();

		alk.setNev("Tomi");
		alk.setFizetes(1000);
	

		System.out.println(alk.getAdatok());

		alk.fizetesNovel(3400);
		System.out.println(alk.getAdatok());
		
		System.out.println(alk.getFizHatarok(1000, 2000));
		System.out.println("Az ado erteke: " + alk.getAdo());
		
		
		Alkalmazott masik = new Alkalmazott();
		masik.setNev("Tomi2");
		masik.setFizetes(5500);
		
		System.out.println(masik.getAdatok());
		
		if(alk.getAlkFizNagyobb(masik)) { 
			System.out.println(alk.getAdatok() + " Fizetese a nagyobb");
		}else {
			System.out.println(masik.getAdatok() + " Fizetese a nagyobb");
		}

	}

}
