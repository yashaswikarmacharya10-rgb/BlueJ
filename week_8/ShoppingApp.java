package week_8;


/**
 * Write a description of class ShoppingApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingApp
{
    public static void main(String[] args) {

        // ShoppingCart
        ShoppingCart cart = new ShoppingCart("Trench coat", 3500, 1);

        //  cart details
        cart.displayCart();

        // Update quantity
        cart.setQuantity(3);
        System.out.println("Updated Quantity: " + cart.getQuantity());

        //  total price
        System.out.println("Total Price: " + cart.calculateTotal());

        // Festival offer
        double discountPercent = 10;
        System.out.println("Discounted Price (10% off):" + cart.calculateDiscountedTotal(discountPercent));
    }
}