package Practice;

public class TestWithThread {
	
	public static void main(String[] args) {
		
		WithThread t1=new WithThread("shanu");
		
		WithThread t2=new WithThread("bittu", 3, 56);
		
//		t1.start();
//		
//		t2.start();
		
		t1.run();
		
		t2.run();
		
		
	}

}
