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
public class EvaluasiA { 
void divide (int a,int b){
    //melakukan pembagian dan menyimpan hasilnya
    int res=a/b;
    System.out.println("Proses pembagian telah berhasil dilakukan;");
    System.out.println("Hasil setelah pembagian adalah: "+res);
} 
//main method 
public static void main (String args[]){
    //membuat objek dari kelas ArithmeticException
    EvaluasiA Evl = new EvaluasiA();
    Evl.divide(6, 3);
}
}
