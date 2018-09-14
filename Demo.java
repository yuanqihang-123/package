public class Demo {

	public static void main(String[] args) {
		getsum(5);

	}

	public static void getsum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}

		System.out.println(sum);
	}

}
