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
public class Main {
    String kpopmerch;
    int price;
    
    void kpopmerch(String merch){
        kpopmerch = merch;
        System.out.println("Kpop Merch : " + kpopmerch);
    }
    
    void price(int harga){
        price = harga;
        System.out.println("Price : " + price + " idr");
    }
}