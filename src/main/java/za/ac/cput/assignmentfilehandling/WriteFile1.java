/**
 *Assignment 3 ADP
 * @author Onele Tomson
 * 8 June 2021
 * 
 */
package za.ac.cput.assignmentfilehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class WriteFile1 {
       public static void main(String args[]) 
       {
    
       Supplier s;
        Vector<Supplier> v2 = new Vector<>();
        v2.add(new Supplier("S270", "Grand Theft Auto", "Toyota", "Mid-size sedan"));
         v2.add(new Supplier("S400", "Prime Motors", "Lexus", "Luxury sedan"));
         v2.add(new Supplier("S300", "We got Cars", "Toyota", "10-seater minibus"));
         v2.add(new Supplier("S350", "Auto Delight", "BMW", "Luxury SUV"));
         v2.add(new Supplier("S290", "MotorMania", "Hyundai", "compact budget"));
         
         
                   File f = new File("supplierOutFile.txt");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(v2);
            oos.close();
            System.out.println("Data write successfully");
            
        } catch (FileNotFoundException ex) {
        ex.printStackTrace();
        } catch (IOException ex) {
          ex.printStackTrace();
        }
       }
}
