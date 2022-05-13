/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluasi.exceptionhandling;

/**
 *
 * @author WINDOWS 10
 */
public class EvaluasiD {
    public static void main(String args[])
    {
        // Outer try block
        try {
  
           int a[] = { 1, 2, 3, 4, 5, 6, 7 };
  
            // printing element at index 7 i.e out 
            System.out.println(a[7]);
  
            // inner try block
            try {
  
                // division by zero
                int x = a[5] / 0;
            }
            catch (ArithmeticException e2) 
            {
                System.out.println("Arithmetic Exception encountered!!");
            }
        }
        catch (ArrayIndexOutOfBoundsException e1) 
        {
            System.out.println("ArrayIndexOutOfBounds Exception encountered!!");
            System.out.println("Catch method of outer try block implemented!!");
        }
    }
}
