/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayjava;

/**
 *
 * @author A S U S
 */
import java.util.Scanner;
public class ArrayJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] Tanah = new String[4];
        int [] Panjang = new int[4];
        int [] Lebar = new int[4];
        int Luas;
        
        for (int i = 1; i < Tanah.length; i++){
            System.out.println("Tanah "+i);
            System.out.print("Panjang : ");
            Panjang[i] = input.nextInt();
            System.out.print("Lebar : ");
            Lebar[i] = input.nextInt();
        }
        System.out.println("");
        for (int i = 1; i < Tanah.length; i++){
            Luas = Panjang[i] * Lebar[i];
            System.out.println("Luas Tanah "+i+" : " + Luas);
        }
    }
    
}
