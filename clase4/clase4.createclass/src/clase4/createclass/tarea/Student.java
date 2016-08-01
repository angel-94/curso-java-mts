package clase4.createclass.tarea;

/**
 * @author Manuelangel ruiz sumano
 *
 */
public class Student {
	//variables de instancia
	private int studentID;
	private StudentRecord studentRecord;
	
	//Variable estatica.
	private static int studentCount = 0;
	
	public Student(){
		
	}
	
	public Student(int id, String name, double grade1, double grade2, double grade3){
		this.studentID = id;
		this.studentRecord = new StudentRecord(name, grade1, grade2, grade3);
	}
	
	public Student(String name, double grade1, double grade2, double grade3){
		this.studentRecord = new StudentRecord(name, grade1, grade2, grade3);
	}
	
	public String getStudent(){
		String student;
		student = "\nNombre: " + this.studentRecord.getName() +
				"\nPromedio: " + this.studentRecord.getAverage();
		return student;
	}
	
	/**
	 * Regresa el numero de veces que se instancio la clase student
	 */
	public static int getStudentCount() {
		return studentCount;
	}
	
	/**
	 * Incrementa el numero de veces que se instancia la clase student
	 * method.
	 */
	public static void increaseStudentCount() {
		studentCount++;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	
}
	