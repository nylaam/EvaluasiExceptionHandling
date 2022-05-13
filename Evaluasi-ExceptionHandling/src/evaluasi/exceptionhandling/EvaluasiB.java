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
public class EvaluasiB {
    static int sum(int num1, int num2){
        if (num1 ==0){
            throw new ArithmeticException("Parameter pertama adalah nol!!");
        }
        else
            System.out.println("penambahan didaapatkan!!");
        return num1+num2;
    }
    public static void main(String args[]){
        int ans = sum (6,12);
        System.out.println(ans);
    }
}
