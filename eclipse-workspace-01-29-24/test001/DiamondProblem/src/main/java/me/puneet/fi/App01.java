package me.puneet.fi;

public class App01 implements Interface01,Interface02 {

	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		Interface01.super.sayHello();
		Interface02.super.sayHello();
	}

	public static void main(String[] args) {
		 App01 app = new App01();
		 app.sayHello();
	}
}
