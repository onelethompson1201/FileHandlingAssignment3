/**
 *Assignment 3 ADP
 * @author Onele Tomson
 * 8 June 2021
 * 
 */
package za.ac.cput.assignmentfilehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;
import java.util.Iterator;

public class ReadFile
        {
       public static void main(String args[])  
       {
    File f = new File("customerOutFile.txt");
    try{
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Vector<Customer> deserializedCustomer = (Vector<Customer>) ois.readObject();
        System.out.println("====================================CUSTOMERS=============================================================");
        System.out.println("ID      "+"        Name       "+"     Surname       "+ "  Address       " + "  Date of birth "+"  Credit     "+"     Rent");
        System.out.println("==========================================================================================================");
            
     
        
        Iterator<Customer> iter = deserializedCustomer.iterator();
        while (iter.hasNext()){
            Customer c = iter.next();
            System.out.println(c.toString());
        }
           
       
    }catch (FileNotFoundException ex){
        ex.printStackTrace();
    }      catch (IOException ex) {
               ex.printStackTrace();
           } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
           }
}
}