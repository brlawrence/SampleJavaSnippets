package nov2021;

public class TestCalling1 {
static String testCalling1(String in) {
	String one = Testcalling2.myMethod1(in);
	String two = Testcalling3.myMethod2(in+" for m2");
	String output1 = in+" "+one+two;
	return output1;
}
private static class Testcalling2 {
	 static String myMethod1(String a){
		return("This is private method1 "+a+" \n");
	}
}

private static class Testcalling3 {
	static String myMethod2(String b) {
		return("This is private method2 "+b);
	}
}
}
