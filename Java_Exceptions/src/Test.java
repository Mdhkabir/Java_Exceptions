import org.omg.Messaging.SyncScopeHelper;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("before thy block");
		
		try{
		System.out.println("Beginning");
		
		//int divide =10/0;        //it showes you exception on errors no numder divided by 0.
		
		int divide = 10/5; 
		System.out.println(divide);
		System.out.println("Ending");
		}catch(Exception e){
			
			System.out.println("errors occurred");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		
		}
		
		System.out.println("After try catch block");
	
	}


}
