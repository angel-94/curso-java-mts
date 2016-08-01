package clase4.createclass.tarea;

/**
 * @author Manuel Angel
 * @version 1.0
 *
 */
public class StudentRecord {

	// Declaraacion de variables de instancia.
	private String name;
	private double mathGrade;
	private double englishGrade;
	private double scienceGrade;

	public StudentRecord() {

	}

	public StudentRecord(String name, double grade1, double grade2, double grade3) {
		this.name = name;
		this.mathGrade = grade1;
		this.englishGrade = grade2;
		this.scienceGrade = grade3;
	}

	/**
	 * @return devuelve el nombre del estudiante.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param cambia
	 *            el nombre del estudiante.
	 */
	public void setName(String temp) {
		name = temp;
	}

	/**
	 * Calcula el promedio de las materias del estudiante
	 */
	public double getAverage() {
		double result = 0;
		result = (getMathGrade() + getEnglishGrade() + getScienceGrade()) / 3;
		return result;
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
