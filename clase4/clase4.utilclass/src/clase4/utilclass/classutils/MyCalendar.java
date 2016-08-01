package clase4.utilclass.classutils;

/**
*Display the Calendar.DATE, Calendar.HOUR using the timezone of the city you live
*and timezone of "Europe/Berlin".
*@autor Alfredo Reyes
*@version 1.0
*/
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class MyCalendar {

	public static void main(String[] args) {
		Calendar localTime = Calendar.getInstance();

		// imprime el tiempo y la hora
		System.out.println("Fecla del tiempo local: " + localTime.get(Calendar.DATE));
		System.out.println("Hora del tiempo local: " + localTime.get(Calendar.HOUR));

		// Creamos una instancia de clanendar y le asignamos el tiempo de la
		// zona de berlin
		Calendar germanyTime = new GregorianCalendar(TimeZone.getTimeZone("Europe/Berlin"));
		germanyTime.setTimeInMillis(localTime.getTimeInMillis());

		// Imprimimos la fecla y hora de berlin
		System.out.println("Fecha de berlin: " + germanyTime.get(Calendar.DATE));
		System.out.println("Hora en berlin: " + germanyTime.get(Calendar.HOUR));
	}
}
