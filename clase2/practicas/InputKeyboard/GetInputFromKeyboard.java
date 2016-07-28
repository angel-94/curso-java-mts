
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInputFromKeyboard {
    
	public static void main(String[] args) {

        BufferedReader dataIn = new BufferedReader(new
                InputStreamReader( System.in) );

        String name = "";
        System.out.println("Please Enter Your Name:");

        try{
            name = dataIn.readLine();
        }catch( IOException e ){
            System.out.println("Error!");
        }

        System.out.println("Hello " + name +"!");

        String age= "";
        System.out.println("Please Enter Your Age:");

        try{
            age = dataIn.readLine();
        }catch( IOException e ){
            System.out.println("Error!");
        }

        System.out.println("Hello " + name +"!" + " " + "Your age is " + age);

        int ageint = Integer.parseInt(age);

        if (ageint > 100){
            System.out.println("Hello " + name +"!" + " " + "You are old.");
        } else{
            System.out.println("Hello " + name +"!" + " " + "You are young.");
        }
        
    }

}
