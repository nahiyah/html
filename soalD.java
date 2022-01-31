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
public class soalD {

    public static void main(String[] args) {
        int nilaipertama = 6;
        int selisih = 5;
        int matrix = 3;
        int deret = nilaipertama;

        for (int i = 0; i < 3; i++) {//baris
            for (int j = i; j < 3; j++) {//kolom
                System.out.print(deret + "\t");
                deret += selisih;
            }
            System.out.println("");

        }
        for (int i = 0; i < 3; i++) {//baris
                for (int j = 0; j <= i; j++) {//kolom
                    System.out.print(deret + "\t");
                    deret += selisih;
                }
                System.out.println("");
            }
        }
    }

