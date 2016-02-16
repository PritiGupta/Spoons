/**
 * 
 */
package Lab13;

/**
 * @author Priti
 *
 */
public class SingleSpoon {
	private static boolean theSpoonIsAvailable = true;
	//creates an object of SingleSpoon
	private static SingleSpoon instance = new SingleSpoon();
	
	//makes the constructor private
	private SingleSpoon(){}
	//get the object available
	public static SingleSpoon getInstance(){
		theSpoonIsAvailable= true;
		showMessage();
		return instance;
		
	}
	public static void showMessage(){
		System.out.println("The Spoon is available");
	}

}
