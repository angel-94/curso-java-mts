package clase4.classpath.tarea;

public class FoodMain{
	public static void main(String [] args){
		Food food = new Food();
		food.setName("Chilaquiles");
		food.setPrice(123.45);
		food.setSize("Familiar");
		System.out.println("Nombre del platillo: " + food.getName());
		System.out.println("Precio del platillo: " + food.getPrice());
		System.out.println("Tamaño del platillo: " + food.getSize());
	}
}
