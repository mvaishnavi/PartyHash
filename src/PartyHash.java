import java.util.HashMap;
import java.util.Scanner;
public class PartyHash {
	public static void main(String args[]) {
        HashMap<String, Integer> beerBottle = new HashMap<String, Integer>();
        System.out.println("Enter your name: ");
        String name;
        while(beerBottle.containsValue("end")==false){
        	name=scanInput();
        	if(beerBottle.containsValue(name)==false){
        		beerBottle.put(name, 1);
        	}
        	else{
        		int count= beerBottle.get(name);
        		count++;
        		beerBottle.put(name, count);
        	}
        }
        System.out.println("Enter name:[to know no. of beer bottles consumed] ");
        name=scanInput();
        if(beerBottle.containsKey(name)==true){
        	System.out.println("No. of beer bottles consumed: " + beerBottle.get(name));
        }
        else
        	System.out.println("Name not in Party List");
   }
	public static String scanInput(){
		Scanner nameInput = new Scanner(System.in);
        String name= nameInput.next();
        return(name);
	}
}
