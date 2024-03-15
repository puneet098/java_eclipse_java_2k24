package test;

public class StringTest001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Java is a programming technologies and Java is backend technologies";
		//char[] charAry = input.toCharArray();
		String a="puneet";
		String b=new String("puneet");
		if(a==b) {System.out.println("equal");}//not print
		String c = "puneet";
		if(a==c) {System.out.println("equal");}
		System.out.println("puneet"+1+2+"puneet"
				+(2+1));
			
		String d = "puneet".intern();
		String e = a.intern();
		String f = b.intern();
		if(a==d) {System.out.println("equal");}
		if(c==d) {System.out.println("equal");}
		if(b==f) {System.out.println("equal");}//not print
		if(c==f) {System.out.println("equal");}
		
	}

}
