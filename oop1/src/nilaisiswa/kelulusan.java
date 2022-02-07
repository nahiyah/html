/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaisiswa;

/**
 *
 * @author nahiy
 */
public class kelulusan {
private int nilai;

public static void setnilai(int newnilai){
}
public int getnilai(){
    return nilai;
}
public void kriteria(int nilai){
    if (nilai > 75){
        System.out.println("nilai produktif anya adalah ="+nilai+"\n"+"selamat anda lulus!");{   
    }
        if (nilai < 75){
            System.out.println("nilai produktif anya adalah ="+nilai+"\n"+"anda harus belajar lebih giat lagi");{
        }
    }
}
}
}

