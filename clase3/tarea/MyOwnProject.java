/**
*
* @author Manuel Ruiz
* @version 1.0
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyOwnProject{
  public static void main(String[] args) {
    FileInputStream propFile = null;
    Properties MyProperties = new Properties();
    //Se añaden las siguientes propiedades al objeto MyProperties
    MyProperties.setProperty("myKey20", "myValue20");
    MyProperties.setProperty("myKey30", "myValue30");
    MyProperties.setProperty("myKey40", "myValue40");
    //Leemos los datos del arcfivo de texto
    try {
      propFile = new FileInputStream("File.txt");
      MyProperties.load(propFile);
    }catch (IOException e) {
      System.out.println("Error");
    }
    MyProperties.list(System.out);
  }
}
