/**
 * Uso del do-while
 * @author manuel angel
 * @version 1.0
 *
 *
 * */
import java.io.*;
import java.lang.*;

public class Login{

	private static final String PASS = "123456";

	public static void main(String [] args){
		String username = "";
		String pass = "";
		int cont = 0;
		BufferedReader dataIn = new BufferedReader( new InputStreamReader(System.in));

		try{
			//Obligamos a que el usuario introduzca un nombre
			do{
				System.out.print("Introduce tu nombre: ");
				username = dataIn.readLine();
			}while(username.isEmpty());
			//Cuando la contraseña falla 3 veces decimos que se ha bloqueado.	
			do{
				System.out.print("Password: ");
				pass = dataIn.readLine();
				if(!PASS.equals(pass)){
					cont++;
					if(cont==3){
						System.out.println("Contraseña bloqueada");
					}
				}else{
					System.out.println("Bienvenido " + username);
					return;
				}
			}while(cont<3);

		}catch(IOException e){
			System.out.println("Error en leer");
		}
	}
}
