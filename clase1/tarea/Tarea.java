/**
 * Ejercicio de tarea.
 * @author Manuel Ángel Ruiz Sumano
 * @version 1.0
 * */
public class Tarea{
	//Declaración de las constantes para de la clase.
	private static final String MENSAJE1 = "El número más pequeño es menor que 10!";
	private static final String MENSAJE2 = "El número más pequeño es mayor o igual a 10!";
	
	public static void main(String [] args){
		//Declaración de variables numéricas.
		int num1 = 100;
		int num2 = 23;
		int num3 = 50;
		int men = 0;
		String mensaje;
		
		//Determinar que número es mayor
		men = (num1<num2)?num1:num2;
		men = (men<num3)?men:num3;
		mensaje = (men<10)?MENSAJE1:MENSAJE2;
		
		//Imprimir los resultados en pantalla
		System.out.println("Número 1: " + num1);
		System.out.println("Número 2: " + num2);
		System.out.println("Número 3: " + num3);
		System.out.println("El número menor es: " + men);
		System.out.println(mensaje);
	}
}