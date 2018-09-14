package cn.itcast.testString;

public class TestString {
	public static void main(String[] args) {
		String a = "tom";
		String b = a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.getBytes());
		System.out.println(b.getBytes());
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		b="jerry";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.getBytes());
		System.out.println(b.getBytes());
		System.out.println(a==b);
		System.out.println(a.equals(b));
	}

	
}
