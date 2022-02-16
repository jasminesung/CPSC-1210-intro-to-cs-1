import java.util.Scanner;
import java.util.ArrayList;
/**
 * Demo of do-while loop where user enters "y" or "n"
 * for yes or no with a maximum of three tries.
 */
public class TemperatureInfo {
   /**
    * @param args - not used
    */
   public static void main(String[] args) {
       Scanner userInfo = new Scanner(System.in);
       ArrayList<Integer> tempsList = new ArrayList<Integer>();
       String tempInput = "";
       do {
           System.out.print("Enter a temperature (or nothing to end list): ");
           tempInput = userInput.nextLine().trim();
           if (!tempInput.equals("")) {
               tempList.add(Integer.parseInt(tempInput));
           }
       } while (!tempInput.equals(""));

       Temperatures temps = new Temperatures(tempsList);
       
   }
}