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
public class soalB {
public static void main(String[] args) {
    int nilaipertama=6;
    int selisih=5;
    int baris=4;
    int kolom=3;
    int deret=nilaipertama;
    int total=0;
    
        for(int i=0; i<baris; i++){//baris
        for (int j=0; j<kolom; j++){//kolom
            System.out.print(deret + "\t");
            
            total += deret;
            deret += selisih;
   
        }
        System.out.println("");
    }
        System.out.println("total : "+total);
}
}

