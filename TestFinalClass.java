package AccesModifiers;

public class TestFinalClass extends FinalClasssExample{
 static int a;

	public void method1()
	{
		System.out.println("method1 child");
		
	}
	
	public static void main(String[] args) {
		TestFinalClass testFinalClass=new TestFinalClass();
		testFinalClass.method1();
		System.out.println(a);
	}

}
