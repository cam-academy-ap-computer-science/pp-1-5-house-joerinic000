
public class House {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Jack();
			System.out.println("");
			Verse1();
			System.out.println("");
			Verse2();
			System.out.println("");
			Verse3();
			System.out.println("");
			Verse4();
			System.out.println("");
			Verse5();
			System.out.println("");
			Verse6();
	}
	public static void Jack() {
		System.out.println("This is the house that Jack built.");
}
	public static void Verse1() {
		System.out.println("This is the malt");
		System.out.println("That lay in the house that Jack built.");
	}
	public static void Verse2() {
		System.out.println("This is the rat,");
		System.out.println("That ate the malt");
		System.out.println("That lay in the house that Jack built.");
	}
	public static void Verse3() {
		System.out.println("This is the cat,");
		System.out.println("That killed the rat,");
		System.out.println("That ate the malt");
		System.out.println("That lay in the house that Jack built.");
	}
	public static void Repeat() {
		System.out.println("That worried the cat,");
		System.out.println("That killed the rat,");
		System.out.println("That ate the malt");
		System.out.println("That lay in the house that Jack built.");
	}
	public static void Verse4() {
		System.out.println("The is the dog,");
		Repeat();
	}
	public static void Verse5() {
		System.out.println("This is the cow with the crumpled horn,");
		System.out.println("That tossed the dog,");
		Repeat();
	}
	public static void Verse6() {
		System.out.println("This is the maiden all forlorn");
		System.out.println("That milked the cow with the crumpled horn,");
		System.out.println("That tossed the dog");
		Repeat();
	}
}