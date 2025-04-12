/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prt4;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class Prt4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nama = new String[5];
        // TODO code application logic here
        nama[0] = "lusia sawun";
        nama[1] = "santika";
        nama[2] = " dewi";
        nama[3] = "marta";
        nama[4] = " lily";
        
        
    
        Scanner inp = new Scanner(System.in);
        
        for(int idx=0; idx<5; idx++ ){
            System.out.print("Data Teman ke-"+String.valueOf(idx+1)+":");
            nama[idx]= inp.nextLine();
        }
        
        String NamaTeman = nama[2];
        System.out.printf("Data Teman: %s", nama[2]);
        
         //menampilkan data array menggunkana perulangan
          for(int idx=0; idx<5; idx++ ){
            System.out.print("Data Teman ke-"+String.valueOf(idx+1)+":" +nama[idx]);
           
        //foreach (ini merupahkan for kusus untuk array)
            for(String nm : nama){
                System.out.println(nm);
            
            }
        
      }
       
 }
}