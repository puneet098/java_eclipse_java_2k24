package me.puneet.fi;

@FunctionalInterface
public interface Interface02 {

	public int sum();
	public default void sayHello() {
		System.out.println("interface02 Hello");
	}
	public static int multiply(int a, int b,int c) {
		return a*b*c;
	}
}
