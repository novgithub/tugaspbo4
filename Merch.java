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
public class Merch extends Main{
    String shipping;
    
    public void pengiriman(String shippingonly){
        shipping = shippingonly;
        System.out.println("Shipping Available : " + shipping);
    }
    
}
