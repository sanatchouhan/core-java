package in.co.rays.Exception;

public class IndexOutOfBound {
	
	public static void main(String[] args) {
		
		try {
			String[] names= {"riya","sameer"};
			String name="prakhar";
			
			System.out.println(names.length);
			System.out.println(names[2]);
			System.out.println(name.length());
			System.out.println(name.charAt(3));
			
			int a=100;
			int b=0;
			int solve=a/b;
			
			
			
			
		
	}catch (Exception e) {
		
		System.out.println(e);
		
	}

}
}