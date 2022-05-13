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
public class EvaluasiC {
   public EvaluasiC() {
    }
    public static void main(String args[]) {
      int zeroInt = 7;
      int anInt = 23; 
        try {
int DivResult = anInt / zeroInt;
            System.out.println("Hasilnya adalah " + DivResult);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("terjadi pembagian dengan "+ zeroInt);
            System.out.println("diatasi blok penanganan sendiri");
            System.out.println(e);
        } finally {
            System.out.println("kalimat di finally");
        }
        System.out.println("kalimat diluar blok try-catch-finally");
    }
}  

