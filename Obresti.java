public class Obresti {
	
	public static void main(String[] args){
		double glavnica = 1000;
		int leta = 5;
		double obrestna_mera = 4;
		
		double koncni_znesek = glavnica * Math.pow(1 + obrestna_mera/100, leta);
		
		System.out.println("Glavnica: " + glavnica);
		System.out.println("Število let: " + leta);
		System.out.println("Obrestna mera: " + obrestna_mera);
		System.out.println("Stanje na računu: " + koncni_znesek);
	}
}