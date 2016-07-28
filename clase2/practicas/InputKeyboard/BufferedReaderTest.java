/**
 * Ejemplo de uso del BufferedReadder.
 * @author Manuel Angel Ruiz
 * @version 1.0
 *
 * */


import java.io.*;
import java.lang.*;

public class BufferedReaderTest{

	private static final String PASS = "123456";

	public static void main(String [] args){
		//Variables locales al metodo main
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
