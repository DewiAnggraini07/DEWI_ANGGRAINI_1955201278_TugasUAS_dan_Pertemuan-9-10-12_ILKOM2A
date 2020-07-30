/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN10;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ArrayMultidimensi_String {
 public static void main(String[] args) {
       
        System.out.println("ARRAY 2 dimensi untuk String");
        System.out.println("<><><>Menu Makanan Warung joss<><><>");
        String makanan[][] = {{"01", "BAKSO"}, {"02", "SOTO"}, {"03", "MIE AYAM"},{"04", "SABLAK"},{"05", "RUJAK"}};
       
         
        for (int i = 0; i < makanan.length; i++) {
            for (int j = 0; j < makanan[0].length; j++) {
                System.out.print(makanan[i][j] + " ");
            }
            System.out.println(" ");
        }
        String cari = JOptionPane.showInputDialog(null,"  Cari Menu Makanaan berdasarkan Kode Makanan");
        for (int i =0; i< makanan.length; i++ ){
            for (int j =0; j < makanan[0].length; j++){
                if(makanan[i][j].equals(cari)){
                    JOptionPane.showMessageDialog(null, "makanan dengan Nomor Urutan " + cari + " Ditemukan bernama " + makanan[i][j+1]);
                }
                System.out.print(makanan[i][j] + " ");
            }
            System.out.println(" ");
        }
          for (int i = 0; i < makanan.length; i++) {
            for (int j = 0; j < makanan[0].length; j++) {
                System.out.print(makanan[i][j] + " ");
            }
            System.out.println(" ");
          }
    
        }
    }    

