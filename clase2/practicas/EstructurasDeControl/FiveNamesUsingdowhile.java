/**
 * Uso del while
 * @author Manuel Angel
 * @version 1.0
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FiveNamesUsingdowhile {

    public static void main(String[] args){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        int counter = 0;

        try{
            System.out.println("Nombre: ");
            name = reader.readLine();
        }catch(Exception e){
            System.out.println("Error!");
            System.exit(0);
        }
        //Uso del do-while
        do{
            System.out.println("Mi nombre es: " + name);
            counter++;
        }while(counter < 5);
    }

}
