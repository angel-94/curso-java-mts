import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FiveNamesUsingwhile {

    public FiveNamesUsingwhile() {
    }

    public static void main(String[] args) {
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
        //Uso del while
        while (counter < 5){
            System.out.println("Mi nombre es " + name);
            counter++;
        }
    }
}
