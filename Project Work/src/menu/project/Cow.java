package menu.project;

public class Cow extends MyGuess{
	
	
	public boolean check(int a,int b) {
		System.out.println(a);

		int randomized = a ;
		int notrandomized=b;
		boolean checking;
		if(randomized == notrandomized) {
			checking = true;
		}
		else {
			checking = false;
		}
		
		 return checking;
	 }
	
	
	boolean check(int a, int b , int c) {

		boolean returning;
		if(a>b) {
			returning = true;
			
		}
		else {
			returning= false;
		}
		return returning;
		
	}
	

}
