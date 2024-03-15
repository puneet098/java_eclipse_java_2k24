package test;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent{
	public void methodA() throws IOException{
		
	}
}
public class Child extends Parent {
	
	@Override
	public void methodA() throws FileNotFoundException
	{
		try {
			throw new FileNotFoundException("not Found");
		}catch(IOException ioe) {
			ioe.getLocalizedMessage();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
