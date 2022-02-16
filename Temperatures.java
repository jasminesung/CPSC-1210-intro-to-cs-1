import java.util.Scanner;
import java.util.ArrayList;
/**
 * Demo of do-while loop where user enters "y" or "n"
 * for yes or no with a maximum of three tries.
 */
public class Temperatures {

   private ArrayList<Integer> temperatures = new ArrayList<Integer>();

   public Temperatures(ArrayList<Integer> temperaturesIn) {
    temperatures = temperaturesIn;
   }

   public int getLowTemp() {
    if (temperatures.isEmpty()) {
        return 0;
    }
    int low = temperatures.get(0);
    for (int i = 0; i < temperatures.size(); i++) {
        if (temperatures.get(i) < low) {
            low = temperatures.get(i);
        }
    }
    return low;
   }

   public int getHighTemp() {
    if (temperatures.isEmpty()) {
        return 0;
    }
    int high = temperatures.get(0);
    for (Integer temp : temperatures) {
        if (temp > high) {
            high = temp;
        }
    }
    return high;
   }

   public int lowerMinimum(int lowIm) {
       return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }

   public int higherMaximum(int higIn) {
       return highIn > getHighTemp() ? highIn : getHighTemp();
   }

   public String toString() {
       return "\tTemperatures: " + temperatures
       + "\n\tLow: " + getLowTemp()
       + "\n\tHigh: " + getHighTemp();
   }
   
   /**
    * @param args - not used
    */
   public static void main(String[] args) {
   }
}