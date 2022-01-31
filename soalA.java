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
public class soalA {
public static void main(String[] args) {
    int nilaipertama=6;
    int selisih=5;
    int sukuawal=15;
    int sukuakhir=28;
    int deret=nilaipertama;
    int total=0;
    
    for(int i=1;i<=28;i++) {
        total += deret;
        if (i>=sukuawal) {
            System.out.println("nilai suku ke-"+i+" adalah "+deret);
        }
        deret += selisih;
    }
    System.out.println("total nilai adalah "+total);
    }
    
}
     
