/**
 * Ejercicio de tarea.
 * @author Manuel �ngel Ruiz Sumano
 * @version 1.0
 * */
public class Tarea{
	//Declaraci�n de las constantes para de la clase.
	private static final String MENSAJE1 = "El n�mero m�s peque�o es menor que 10!";
	private static final String MENSAJE2 = "El n�mero m�s peque�o es mayor o igual a 10!";
	
	public static void main(String [] args){
		//Declaraci�n de variables num�ricas.
		int num1 = 100;
		int num2 = 23;
		int num3 = 50;
		int men = 0;
		String mensaje;
		
		//Determinar que n�mero es mayor
		men = (num1<num2)?num1:num2;
		men = (men<num3)?men:num3;
		mensaje = (men<10)?MENSAJE1:MENSAJE2;
		
		//Imprimir los resultados en pantalla
		System.out.println("N�mero 1: " + num1);
		System.out.println("N�mero 2: " + num2);
		System.out.println("N�mero 3: " + num3);
		System.out.println("El n�mero menor es: " + men);
		System.out.println(mensaje);
	}
}