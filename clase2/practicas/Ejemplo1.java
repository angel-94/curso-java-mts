import java.io.*;
import java.lang.*;

public class Ejemplo1{

	private static final String PASS = "123";

	public static void main(String [] args){
		String username = "";
		String pass = "";
		BufferedReader dataIn = new BufferedReader( new InputStreamReader(System.in));
			
		System.out.println("Username: ");
		try{
			username = dataIn.readLine();
			if(username.isEmpty()){
				System.out.println("Error de nombre");
				return;
			}		
			System.out.println("Password: ");
			pass = dataIn.readLine();
			if(!PASS.equals(pass)){
				System.out.println("Datos incorrectos");
			}else{
				System.out.println("Bienvenido " + username);
			}
		}catch(IOException e){
			System.out.println("Error en leer");
		}
	}
}
