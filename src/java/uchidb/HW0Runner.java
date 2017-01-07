package uchidb;


/**
 * @author aelmore
 */
public class HW0Runner{

	//TODO you likely will need to add member variable
	public static Containers<Integer,String> instance = null;
    public HW0Runner(){}
    
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm


	public static Containers<Integer, String> getContainers() {
		// TODO fix this function
	    if(instance == null){
             instance = new HW0<Integer,String>();
        }
    	return instance;
	}

	public static void main(String[] args){
	}
}
