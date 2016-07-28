/**
 * Programa que encuentra el nombre mas largo
 * @author Manuel Angel
 * @version 1.0
 * */

import javax.swing.JOptionPane;

public class MyOwnJavaArray{

  //Tamaño de la matriz.
  private static  final int N = 3;
  private static  final int M = 2;

  public static void main(String[] args) {

	//Matriz que almacena los nombres
    String nombres[][] = new String[N][M];
    String nomLargo[] = new String[1];
    //Llenamos la matriz
    for (int i = 0; i < N ; i++) {
        nombres[i][0] = JOptionPane.showInputDialog("Introduce tu nombre: ");
        nombres[i][1] = JOptionPane.showInputDialog("Introduce tu apellido: ");
    }
    //Comparamos para encontrar el nombre mas largo.
    nomLargo = (nombres[0].length > nombres[1].length)?nombres[0]:nombres[1];
    nomLargo = (nomLargo.length > nombres[2].length)?nomLargo:nombres[2];
    //Mostramos el nombre mas largo
    JOptionPane.showMessageDialog(null, "El nombre mas largo es: " + nomLargo[0]);
  }

}
