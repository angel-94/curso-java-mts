package clase4.createclass.exercice1;

/**
 * @author Manuel Angel
 *
 */
public class StudentRecord {

	// Declaraacion de variables de instancia.
	private String name;
	private double mathGrade;
	private double englishGrade;
	private double scienceGrade;

	// Declaracion de variables estaticas.
	private static int studentCount = 0;

	/**
	 * @return the name of a student
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param Changes the name of a student.
	 */
	public void setName(String temp) {
		name = temp;
	}

	/**
	 * Computes the average of the english, math and science grades
	 */
	public double getAverage() {
		double result = 0;
		result = (getMathGrade() + getEnglishGrade() + getScienceGrade()) / 3;
		return result;
	}

	/**
	 * Returns the number of instances of StudentRecords
	 */
	public static int getStudentCount() {
		return studentCount;
	}

	/**
	 * Increases the number of instances of StudentRecords. This is a static
	 * method.
	 */
	public static void increaseStudentCount() {
		studentCount++;
	}

	// Instance methods
	public double getMathGrade() {
		return mathGrade;
	}

	public void setMathGrade(double mathGrade) {
		this.mathGrade = mathGrade;
	}

	public double getEnglishGrade() {
		return englishGrade;
	}

	public void setEnglishGrade(double englishGrade) {
		this.englishGrade = englishGrade;
	}

	public double getScienceGrade() {
		return scienceGrade;
	}

	public void setScienceGrade(double scienceGrade) {
		this.scienceGrade = scienceGrade;
	}
}
