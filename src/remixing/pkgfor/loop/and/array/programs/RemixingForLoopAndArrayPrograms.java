/*
 * Kaia Mac
 * Remixing For Loop and Array Programs
 * October 25th, 2018
 */

package remixing.pkgfor.loop.and.array.programs;
import java.util.Scanner;
/**
 *
 * @author kamac8665
 */
public class RemixingForLoopAndArrayPrograms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner keyedInput = new Scanner (System.in);
        
        int [ ] numbers = new int [20];
        int total = 0;
        
        System.out.println("Enter twenty integers and they will be added together:");
        for (int i = 0; i <= 19; i = i + 1)
        {
           numbers[i] = keyedInput.nextInt();
        }
        

        for (int i = 0; i <= 19; i = i + 1)
        {
             total = total + numbers[i];
        }
        
        System.out.println("The sum of those numbers is:");
        System.out.println(total);
    }
    
}
