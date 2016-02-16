/**
 * 
 */
package Lab13;

/**
 * @author Priti
 *
 */
public class SpoonPool {

	/**
	 * 
	 */
	int single;int count=0;
	SingleSpoon [] spoons = new SingleSpoon[4];
	public SpoonPool() {
		// TODO Auto-generated constructor stub
	
		for(single=0; single<4;single++)
		
		spoons[single].getInstance();
	   
			}
	
	/**
	 * @param args
	 */
	public SingleSpoon release(){
		
		if (SingleSpoon.getInstance()== null){
			System.out.println("no more releases");
			//SingleSpoon.theSpoonIsAvailable= false;
			return spoons[single--];
		}else
		System.out.println("no more Spoons");
		System.exit(0);
		return spoons[single];
		
		
	}
	

}
