package in.co.rays.checked;

public class TestLoginException {
	
	public static void main(String[] args) {
		
		String name=("Samee");
		
		if (name.equals("Sameer")){
			
			System.out.println("user valid.....");
			
	}else {
			try {
				throw new LoginException();
				
			}catch (LoginException e){
				
				//System.out.println(e);
				e.printStackTrace();
				
			}
			
		}
		
	}
			
		}
	


