/**
 * Practicas con el lenguaje java
 * @author Manuel Angel
 * @version 1.0
 * */
 
public class DaysOfTheWeek {

    public static void main(String[] args) {

        String[] days = {"Sunday","Monday","Tuesday","Wednesday", "Thursday","Friday","Saturday"};

        System.out.println("Display days of week using while loop");
        int counter = 0;
        while(counter < days.length){
            System.out.println(days[counter]);
            counter++;
        }

        System.out.println("Display days of week using do-while loop");
        counter = 0;
        do{
            System.out.println(days[counter]);
            counter++;
        } while(counter < days.length);

        System.out.println("Display days of week using for loop");
        for(counter = 0; counter < days.length; counter++){
            System.out.println(days[counter]);
        }

    }

}
