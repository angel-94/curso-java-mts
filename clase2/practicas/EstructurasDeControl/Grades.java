import javax.swing.JOptionPane;

public class Grades {

    public static void main(String[] args) {

        int mathGrade = 0;
        int historyGrade = 0;
        int scienceGrade = 0;
        double average = 0;

        mathGrade = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu promedio entre 0-100!"));
        historyGrade = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu promedio entre 0-100!"));
        scienceGrade = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu promedio entre 0-100!"));

        average = (mathGrade+historyGrade+scienceGrade)/3;

        if (average >= 60){
            JOptionPane.showMessageDialog(null, "Buen trabajo! tu promedio es: " + average);
        } else{
            JOptionPane.showMessageDialog(null, "Nececitas mejorar, tu promedio es: " + average);
        }
    }
}
