package clase4.classpath.practicas;

public class StudentRecord {
	
	// declaracion de las variables de insatncia.
    private String name;
//    private double mathGrade;
//    private double englishGrade;
//    private double scienceGrade;
//    private double average;
   
    // Declaracion de las variables staticas
    private static int studentCount = 0;
   
    public String getName(){
        return name;
    }
   
    public void setName(String temp ){
        name = temp;
    }
   
    public double getAverage(){
        double result =0;
        return result;
    }
   
    public static int getStudentCount(){
        return studentCount;
    }
   
    public static void increaseStudentCount(){
        studentCount++;
    }
}
