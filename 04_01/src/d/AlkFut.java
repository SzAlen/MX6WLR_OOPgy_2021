package d;

public class AlkFut {

	public static void main(String[] args) {

		Alkalmazott[] alkTomb = new Alkalmazott[5];

		feltolt(alkTomb);
		kiir(alkTomb);

		Alkalmazott maxFiz = getLegmagasabbFiz(alkTomb);
		System.out.println("A legnagyobb fizetesu alkalmazott:  " + maxFiz.toString());
		System.out.println("10-40 koze eso fizetesuek szama: " + getAlkDbFizIntervallum(alkTomb, 10, 40));
		System.out.println("Az atlag fizetes: " + getAtlagFiz(alkTomb));
		System.out.println("Az osszes ado: " + getAdoOssz(alkTomb));
	}

	private static void kiir(Alkalmazott[] alkTomb) {
		for (int i = 0; i < alkTomb.length; i++) {
			System.out.println(alkTomb[i].toString());
		}
	}

	private static void feltolt(Alkalmazott[] alkTomb) {
		for (int i = 0; i < alkTomb.length; i++) {
			alkTomb[i] = new Alkalmazott("Tomi");
			alkTomb[i].setNev("Tomi" + i);
			alkTomb[i].setFizetes((int) (Math.random() * 50 + 1));
		}
	}

	private static Alkalmazott getLegmagasabbFiz(Alkalmazott[] input) {
		Alkalmazott max = input[0];

		for (Alkalmazott alk : input) {
			if (alk.getFizetes() > max.getFizetes()) {
				max = alk;
			}
		}
		return max;

	}

	private static int getAlkDbFizIntervallum(Alkalmazott[] input, int also, int felso) {
		int db = 0;
		for (Alkalmazott alk : input) {
			if (alk.getFizHatarok(also, felso))
				db++;
		}
		return db;
	}
	
	private static double getAtlagFiz(Alkalmazott[] input) {
		double sum = 0;
		
		for (Alkalmazott alk : input) {
			sum += alk.getFizetes();

		}
		return  sum / input.length;
	}
	
	private static double getAdoOssz(Alkalmazott[] input) {
		double sum = 0;
		
		for (Alkalmazott alk : input) {
			sum += alk.getAdo();

		}
		return  sum;
	}

}
