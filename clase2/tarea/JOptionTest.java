/**
 * Programa que dice si eres joven o viejo
 * @author Manuel Angel
 * @version 1.0
 * */
import javax.swing.JOptionPane;

public class JOptionTest {

    //Creamos un constructor vacio de la clase JOptionTest
    public JOptionTest() {
    }

    public static void main(String[] args) {
        String nombre = "";
      	String mensaje = "";
      	int edad = 0;
        //Pedimos el nombre
        nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
        mensaje = "Hola " + nombre + "!";
        JOptionPane.showMessageDialog(null, mensaje);
        edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
      	if(edad > 100){
          mensaje = "Hola " + nombre + " eres viejo!";
      	}else{
          mensaje = "Hola " + nombre + " eres joven!";
      	}
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
