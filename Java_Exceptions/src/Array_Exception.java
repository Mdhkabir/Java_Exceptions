
public class Array_Exception {

	public static void main(String[] args) {
		
		System.out.println("Beginning");
		try{
		int i []= new int[4];
		
		i[5]= 100;
		}catch(Exception e){
			System.out.println("error occored");
			e.printStackTrace();
			
		}
		
		System.out.println("ending");
		
	}

}
