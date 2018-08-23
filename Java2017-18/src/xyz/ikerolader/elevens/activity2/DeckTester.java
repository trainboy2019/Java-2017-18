package xyz.ikerolader.elevens.activity2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks= {"A","B","C"};
		String[] suits= {"Heart","Diamond"};
		int[] values= {1,2,3};
		String[] ranks2= {"D","E","F"};
		String[] suits2= {"Club","Spade"};
		int[] values2= {4,5,6};
		String[] ranks3= {"G","H","I"};
		String[] suits3= {"Lion","Tiger"};
		int[] values3= {7,8,9};
		Deck a=new Deck(ranks, suits, values);
		Deck b=new Deck(ranks2, suits2, values2);
		Deck c=new Deck(ranks3, suits3, values3);
		while(a.isEmpty()==false) {
			System.out.println(a.deal().toString());
			System.out.println(a.size());
		}
		while(b.isEmpty()==false) {
			System.out.println(b.deal().toString());
			System.out.println(b.size());
		}
		while(c.isEmpty()==false) {
			System.out.println(c.deal().toString());
			System.out.println(c.size());
		}
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
	}
}
