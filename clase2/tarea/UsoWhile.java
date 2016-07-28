import javax.swing.JOptionPane;

public class UsoWhile {

    public UsoWhile() {
    }

    public static void main(String[] args) {

    	//Arreglo que almacena los nombres.
        String names []={"Beah","Bianca","Lance","Belle","Nico","Yza","Gem","Ethan"};
        String searchName = JOptionPane.showInputDialog("Introduce un nombre!");

        //Declaracion de las variables.
        boolean foundName =false;
        int i = 0;

        //Recoremos el arreglo para encontrar el nombre.
        while(i<names.length){
            if (names [i].equals(searchName)){
                foundName =true;
                break;
            }
            i++;
        }
        //Imprimimos el mensaje dependiendo del resultado de la busqueda
        if (foundName)
            JOptionPane.showMessageDialog(null, searchName + " se encontro en el registro!");
        else
            JOptionPane.showMessageDialog(null, searchName + " no se encontro en el registro!");
    }
}
