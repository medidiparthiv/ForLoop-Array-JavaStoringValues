import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner x = new Scanner(System.in);
	    String[] y = new String[5];
	    
	    for (int i = 1; i<5; i++){
	        System.out.print("Enter Name Here : ");
	        y[i-1] = x.nextLine();
	    }
	    System.out.println("These are your Entered Names : ");
	    for (int c = 1; c<5; c++){
	        if (c==4){
	            System.out.print(y[c-1] + ".");
	        }
	        else{
	            System.out.print(y[c-1] + " , ");
	        }
	        
	    }
	}
}
