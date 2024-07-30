public class Lesson1 {
	public static void classes() {
		Bar bar = new Bar("NameBar");
		Foo foo = new Foo("NameFoo");
		Bar foo2 = new Foo("NameFoo2");

		bar.getClassname();
		foo.getClassname();
		foo2.getClassname();
		foo.printClassName();

		System.out.println(foo.sum(1, 1));
		System.out.println(foo.sum(1, 1, 1));
	}

	public static void bites() {
		byte a = 1;  // 1
		short b = 2; // 2
		int c = 3;   // 4
		long d = 4;  // 8

		// 0000 1101
		// 1000 0001 -1
		// 0000 0001 +1
		// ------------
		// 1000 0010 -2

		// 1111 1111 -1
		// 0000 0001 +1
		// ------------
		// 0000 0000 0


		float e = 5.1f;    // 4
		double f = 6.123; // 8

		// -20.125

		// double
		// -10100.001
		// -1.010000 * 2^4

		// float
		// знак     степень * 127
		// 1        1000 0011   01000010000000000000000

		System.out.println(Float.intBitsToFloat(Integer.parseUnsignedInt("11000001101000010000000000000000", 2)));
	}

	public static void equalsTest() {
		char g = 'A'; // UTF-8, UTF-16
		String s = "😃"; //\uD83D\uDE03
		String s2 = "s"; //\uD83D\uDE03
		String s3 = "s"; //\uD83D\uDE03

		System.out.println(s.length());
		System.out.println(s2.hashCode() == s3.hashCode()); // У String hashCode() переопределен
	}

	public static void sqrt() {
		double prev = 2.0;
		double root = prev;
		double next = 0.5 * (prev + root / prev);

		while (Math.abs(next - prev) > 0.000001) {
			prev = next;
			next = 0.5 * (prev + root / prev);
		}

		System.out.println(next);
		System.out.println(Math.sqrt(2));
	}
}
