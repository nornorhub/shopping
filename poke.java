/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poke;
import java.util.*;
/**
 *
 * @author noureldinelhelw23
 */
public class Poke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Enter 0 if you want to stop shopping or 1 to continue");
        int x = 1;
        String itemName;
        double price;
        int quantity;
        while(x!=0) {
            System.out.println("Item:");
            itemName = scan.nextLine();
            System.out.println("Price");
            price = scan.nextDouble();
            System.out.println("Quantity:");
            quantity = scan.nextInt();
            cart.addToCart(itemName, price, quantity);
            for (int i = 0; i < cart.cart.length; i++) {
                System.out.println(cart.cart[i]);
            }
            System.out.println("Please pay" + cart.);
        }
        
    }
    
}
