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
public class soalE {

public static void main(String[] args) {
    int a[][] = {{4, 3}, {6, 5}};
    int b[][] = {{3, 4}, {3, 4}, {2,3}} ;
    System.out.println("hasil a+b");
    for (int i = 0; i < 2; i++) { //baris
        for (int j = 0; j < 2; j++) {//kolom
            
            System.out.print(a[i][j] + b[i][j] + "\t");    
        }
       System.out.println();
       }
    }
}   