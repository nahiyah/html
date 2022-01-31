import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author nahiy
 */
public class soalG {
static Scanner input = new Scanner(System.in);
public static void main (String []args){
         
        System.out.println("ID daerah masuk : ");
        System.out.println("dupak = 1");
        System.out.println("waru = 2");
        System.out.println("sidoarjo = 3");
        System.out.println("porong = 4");
        System.out.println("kejapanan = 5");
        System.out.println("---------------------");
        System.out.println("ID daerah keluar : ");
        System.out.println("waru = 1");
        System.out.println("sidoarjo = 2");
        System.out.println("porong = 3");
        System.out.println("kejapanan = 4");
        System.out.println("gempol = 5");
        System.out.println("---------------------");
        System.out.println("golongan kendaraan : ");
        System.out.println("1 = sedan, jip, pick up");
        System.out.println("2 = truk 2 sumbu roda");
        System.out.println("3 = truk 3 sumbu roda");
        Scanner userInput = new Scanner(System.in);
        System.out.println("======memasukkan data======");
        System.out.print("masukkan ID daerah masuk : ");
        int idmasuk = userInput.nextInt();
        System.out.print("masukkan ID daerah keluar : ");
        int idkeluar = userInput.nextInt();
        System.out.print("masukkan golongan kendaraan : ");
        int gol = userInput.nextInt();

        int harga=0;
        //dupak(1) - waru(1)
        if (idmasuk==1&&idkeluar==1&&gol==1){
            harga=harga+5000;
            System.out.println("harga yang harus dibayarkan : "+harga);
        }
        if (idmasuk==1&&idkeluar==1&&gol==2){
            harga=harga+8000;
            System.out.println("harga yang harus dibayarkan : "+harga);
        
        }
        if (idmasuk==1&&idkeluar==1&&gol==3){
            harga=harga+8000;
            System.out.println("harga yang harus dibayarkan : "+harga);
        
        }
       
        //waru(2) - sidoarjo(2)
        if (idmasuk==2&&idkeluar==2&&gol==1){
            harga=harga+6000;
            System.out.println("harga yang harus dibayarkan : "+harga);
        }
        if (idmasuk==2&&idkeluar==2&&gol==2){
            harga=harga+9000;
            System.out.println("harga yang harus dibayarkan : "+harga);
        }
        if (idmasuk==2&&idkeluar==2&&gol==3){
            harga=harga+9000;
            System.out.println("harga yang harus dibayarkan : "+harga);
        
        }
        
        //waru(2) - porong(3)
        
        if (idmasuk==2&&idkeluar==3&&gol==1){
            harga=harga+9000;
            System.out.println("harga yang harus dibayarkan : "+harga);
        }
        if (idmasuk==2&&idkeluar==3&&gol==2){
            harga=harga+14000;
            System.out.println("harga yang harus dibayarkan : "+harga);
        }
        if (idmasuk==2&&idkeluar==3&&gol==3){
            harga=harga+14000;
            System.out.println("harga yang harus dibayarkan : "+harga);
        
        }
       
        //sidoarjo(3) - waru(1)
        if (idmasuk==3&&idkeluar==1&&gol==1){
            harga=harga+6000;
            System.out.println("harga yang harus dibayarkan : "+harga);
        }
        if (idmasuk==3&&idkeluar==1&&gol==2){
            harga=harga+9000;
            System.out.println("harga yang harus dibayarkan : "+harga);
        }
        if (idmasuk==3&&idkeluar==1&&gol==3){
            harga=harga+9000;
            System.out.println("harga yang harus dibayarkan : "+harga);
        
        }
        
        //sidoarjo(3) - porong(3)
        if (idmasuk==3&&idkeluar==3&&gol==1){
            harga=harga+5500;
            System.out.println("harga yang harus dibayarkan : "+harga);
        }
        if (idmasuk==3&&idkeluar==3&&gol==2){
            harga=harga+8500;
            System.out.println("harga yang harus dibayarkan : "+harga);
        }
        if (idmasuk==3&&idkeluar==3&&gol==3){
            harga=harga+8500;
            System.out.println("harga yang harus dibayarkan : "+harga);
        
        }
        //porong(4) - sidoarjo(2)
        if (idmasuk==4&&idkeluar==2&&gol==1){
            harga=harga+5500;
            System.out.println("harga yang harus dibayarkan : "+harga);
        }
        if (idmasuk==4&&idkeluar==2&&gol==2){
            harga=harga+85000;
            System.out.println("harga yang harus dibayarkan : "+harga);
        }
        if (idmasuk==4&&idkeluar==2&&gol==3){
            harga=harga+8500;
            System.out.println("harga yang harus dibayarkan : "+harga);
        
        }
        //porong(4) - waru(1)
        if (idmasuk==4&&idkeluar==1&&gol==1){
            harga=harga+9000;
            System.out.println("harga yang harus dibayarkan : "+harga);
        }
        if (idmasuk==4&&idkeluar==1&&gol==2){
            harga=harga+14000;
            System.out.println("harga yang harus dibayarkan : "+harga);
        }
        if (idmasuk==4&&idkeluar==1&&gol==3){
            harga=harga+14000;
            System.out.println("harga yang harus dibayarkan : "+harga);
            
        }
        //porong(4) - kejapanan(4)
        if (idmasuk==4&&idkeluar==4&&gol==1){
            harga=harga+6000;
            System.out.println("karga yang harus dibayarkan : "+harga);
        }
        if (idmasuk==4&&idkeluar==4&&gol==2){
            harga=harga+8500;
            System.out.println("harga yang harus dibayarkan : "+harga);
        }
        if (idmasuk==4&&idkeluar==4&&gol==3){
            harga=harga+8500;
            System.out.println("harga yang harus dibayarkan : "+harga);
            
        }
        //kejapanan(5) - gempol(5)
        if (idmasuk==5&&idkeluar==5&&gol==1){
            harga=harga+3000;
            System.out.println("harga yang harus dibayarkan : "+harga);
        }
        if (idmasuk==5&&idkeluar==5&&gol==2){
            harga=harga+5000;
            System.out.println("harga yang harus dibayarkan : "+harga);
        }
        if (idmasuk==5&&idkeluar==5&&gol==3){
            harga=harga+5000;
            System.out.println("harga yang harus dibayarkan : "+harga);
            
        
        }
    }
}    



