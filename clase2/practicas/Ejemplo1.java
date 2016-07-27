import java.io.*;
import java.lang.*;

public class Ejemplo1{

	private static final String PASS = "123";

	public static void main(String [] args){
		
		BufferedReader dataIn = new BufferedReader( new InputStreamReader(System.in));
		
		int grade = 0;
		String var1 = "";		
	
		System.out.println("Gados: ");
		try{
			grade = Integer.parseInt(dataIn.readLine());
			/*
 			* 60-70 = c
 			* */
			/*if(grade > 60){
				System.out.println("Felicidades");
			}else{
				System.out.println("No pasaste");
			}*/
			
			if(grade >= 60 && grade <= 70){
				var1 = "C";
				//System.out.println("C");
			}else if(grade >= 71 && grade <= 80){
				var1 = "B";
				//System.out.println("B");
			}else if(grade >= 81 && grade <= 90){
				var1 = "A";
				//System.out.println("A");
			}else if(grade >= 91 && grade <= 98){
				var1 = "A+";
				//System.out.println("A+");
			}else if(grade == 99 || grade == 100){
				var1 = "S";
				//System.out.println("S");
			}else{
				System.out.println("Fuera de rango");
			}
			switch(var1){
				case "C":  
					System.out.println("De pansazo");
				break;
				case "B":
					System.out.println("Nice");
				break;
				case "A":
					System.out.println("Mension HOnorifica");
				break;
				case "A+":
					System.out.println("Mension Honorifica");
				break;
				case "S":
					System.out.println("Mension Honorifica");
				break;
				default:
					System.out.println("Este es un defaukt");
			}
		}catch(IOException e){
			System.out.println("Error en leer");
		}catch(NumberFormatException e){ 
			System.out.println("Se esperaba un numero");
		}catch(Exception e){
			System.out.println("Error desconocido");
		}
		//System.out.println(mensaje);
	}
}
