/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4pbo;

/**
 *
 * @author User
 */
public class detail {
    
     public static void main(String[] args) {
        Merch detail = new Merch();
        
        System.out.println("Detail Barang");
        detail.kpopmerch("Album GOT7 Breath");
        detail.price(375);
        detail.pengiriman("Worldwide");
    }
    
}
