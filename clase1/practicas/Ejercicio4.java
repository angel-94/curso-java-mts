public class Ejercicio4{
	public static void main(String [] args){
		//Declaraci{on de variables numericas.
		int num1 = 10;
		int num2 = 23;
		int num3 = 5;
		int max = 0;
		
		//Determinar que numero es mayor
		max = (num1>num2)?num1:num2;
		max = (max>num3)?max:num3;

		//Imprimir los resultados en pantalla
		System.out.println("Numero 1: " + num1);
		System.out.println("Número 2: " + num2);
		System.out.println("Número 3: " + num3);
		System.out.println("El número mayor es: " + max);
	}
}
