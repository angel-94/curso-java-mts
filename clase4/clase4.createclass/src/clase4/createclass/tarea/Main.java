package clase4.createclass.tarea;

/**
 * @author Manuel angel ruiz sumano
 * @version 1.0
 *
 */
public class Main {	

	/**
	 * 
	 * @param args
	 * Metodo priincipal
	 */
	public static void main(String[] args) {
		//Instancias de la clase student
		Student student1 = new Student("Maria", 9.0, 9.0, 8.9);
		Student student2 = new Student("Sofia", 6.0, 5.0, 8.9);
		Student student3 = new Student("Magda", 5.0, 9.0, 4.9);
		
		//Asignacion del id del student 1
		student1.setStudentID(1);
		Student.increaseStudentCount();
		//Asignacion del id del student 2
		student2.setStudentID(2);
		Student.increaseStudentCount();
		//Asignacion del id del student 3
		student3.setStudentID(2);
		Student.increaseStudentCount();
		
		//Mostramos los datos en pantalla
		System.out.println("Cantidad de estudiantes = "+Student.getStudentCount());
		
		System.out.print("id: " + student1.getStudentID());
		System.out.println(student1.getStudent());
		
		System.out.print("id: " + student3.getStudentID());
		System.out.println(student2.getStudent());

		System.out.print("id: " + student3.getStudentID());
		System.out.println(student3.getStudent());
	

	}
	
}
