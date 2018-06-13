public class Main {

	static AtomicInteger n = new AtomicInteger();

	public static void js() {
		n.getAndIncrement();
		System.out.println(n);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;
		while (i < 100) {
			js();
			i++;
		}
	}
}
