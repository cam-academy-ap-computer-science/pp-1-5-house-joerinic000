
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
		JackHouse();
	}
	public static void Verse2() {
		System.out.println("This is the rat,");
		Malt();
		JackHouse();
	}
	public static void Verse3() {
		System.out.println("This is the cat,");
		Rat();
		Malt();
		JackHouse();
	}
	public static void Repeat() {
		Cat();
		Rat();
		Malt();
		JackHouse();
	}
	public static void Verse4() {
		System.out.println("The is the dog,");
		Repeat();
	}
	public static void Verse5() {
		System.out.println("This is the cow with the crumpled horn,");
		Dog();
		Repeat();
	}
	public static void Verse6() {
		System.out.println("This is the maiden all forlorn");
		
		Dog();
		Repeat();
	}
	public static void JackHouse() {
		System.out.println("That lay in the house that Jack built.");
	}
	public static void Malt() {
		System.out.println("That ate the malt");
	}
	public static void Rat() {
		System.out.println("That killed the rat,");
	}
	public static void Cat() {
		System.out.println("That worried the cat,");
	}
	public static void Dog() {
	System.out.println("That tossed the dog,");
	}
	public static void Cow() {
		System.out.println("That milked the cow with the crumpled horn,");
	}
}