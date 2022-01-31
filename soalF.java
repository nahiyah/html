/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklnahiyah;

/**
 *
 * @author nahiy
 */
public class soalF {
public static void main(String[] args) {
        int a[][] = {{5, 2}, {4, 2}};
        int b[][] = {{2}, {5}};
        int hasil[][] = {{0}, {0}};
        System.out.println("hasil axb");
        //proses perhitungan
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    hasil[i][j] = hasil[i][j] + a[i][k] * b[k][j];
                    
                    System.out.print(hasil[i][j] + "\t");
                }
            }
        
            System.out.println();
        }
    }    
}
