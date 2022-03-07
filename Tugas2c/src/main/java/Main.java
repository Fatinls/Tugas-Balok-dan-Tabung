
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Main {

    
    public static void main(String[] args) {
        int pil;
        int p;
        int l;
        int t;
        int vb;
        int lpb;
        
        int r;
        int tt;
        int keluar;
        
        double phi = 3.14;
        double vt;
        double lpt;
        do {
        System.out.println("+------------+");
        System.out.println(" Pilihan Menu ");
        System.out.println("+------------+");
        System.out.println(" 1. Balok ");
        System.out.println(" 2. Tabung");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilihan Menu  : ");pil = input.nextInt();
        if ( pil == 1 ){
            System.out.println("Balok");
            System.out.println("input panjang : ");p = input.nextInt();
            System.out.println("input lebar   : ");l = input.nextInt();
            System.out.println("input tinggi  : ");t = input.nextInt();
            
            vb = p*l*t;
            lpb = 2*((p*l)+(p*t)+(l*t));
            
            System.out.println("Volume balok             : "+ vb);
            System.out.println("Luas Permukaan balok     : "+ lpb);
            
        } else {
            System.out.println("Tabung");
            System.out.println("input jari-jari : ");r = input.nextInt();
            System.out.println("input tinggi    : ");tt = input.nextInt();
            
            vt = phi*(r^2)*tt;
            lpt = 2*phi*r*(r+tt);
            
            System.out.println("Volume Tabung             : "+ vt);
            System.out.println("Luas Permukaan Tabung     : "+ lpt);
        }
        System.out.println("Tekan 1 untuk ulangi, Tekan 0 untuk keluar  : ");keluar = input.nextInt();
        }while(keluar==1);
    }
}
