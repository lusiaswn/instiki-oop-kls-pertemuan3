/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan303;

import javax.swing.JOptionPane;

/**
 *
 * @author INSTIKI
 */
public class Pertemuan303 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pilih = "a";
        
        System.out.println("Menu Pilihan");
        System.out.println("......."); 
        System.out.println("a. Menu a");
        System.out.println("b. Menu b");
        System.out.println("c. Menu c");

        System.out.print("Pilih menu (a/b/c): ");
        System.out.print("Silakan pilih Menu (A/B/C) : ");
        pilih = JOptionPane.showInputDialog("Pilih Menu");
            switch (pilih) {
            case "A":
                System.out.println("Memilih Menu A");
                break;
            case "B":
                System.out.println("Memilih Menu B");
                break;        
            case "C":
                System.out.println("Memilih Menu C");
                break; 
            default:
    }
    }
}