package me.puneet.fi;
@FunctionalInterface
public interface Interface01 {

	public int sum();
	public default void sayHello() {
		System.out.println("interface01 Hello");
	}
	public static int multiply(int a, int b) {
		return a*b;
	}
}
