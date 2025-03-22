/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

import javax.swing.JOptionPane;

/**
 *
 * @author INSTIKI
 */
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // cari kata kunci tekan tombol kontrol dan spasi dan cari kodenya 
        int naw = 0;
        naw = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai Akhir"));
    
        
        int awal = naw;
        int akhir = 10;                                                          
        
        System.out.println("Perulangan While");
        while (awal<akhir){
            System.out.println("Perulangan ke-" +awal);
            awal++;
        }                   
        
        System.out.println("PerulanganDo..while");
        awal = naw;
        do{System.out.println("Perulangan ke-"+awal);
        awal++;
        } while(awal<akhir);    
        
        System.out.println("Perulangan dengan For");
        for(awal=0;awal<akhir;awal++){
            System.out.println("perulangan ke-"+awal);
            
            
        
        }
                                                                                                                                          
    }
    
}                                                                                                                                                               
           
