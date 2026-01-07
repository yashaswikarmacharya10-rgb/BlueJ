package week_8;


/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    // attributes
    private String itemName;
    private double itemPrice;
    private int quantity;

    // Constructor 
    ShoppingCart(String itemName, double itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    // Setter 
    void setQuantity(int quantity) 
    {
        if (quantity > 0) 
        {
            this.quantity = quantity;
        }
    }

    // Getter 
    int getQuantity() 
    {
        return quantity;
    }

    // calculate total price
    double calculateTotal() 
    {
        return itemPrice * quantity;
    }

    // calculate discounted total price
    double calculateDiscountedTotal(double discountPercent)
    {
        double total = calculateTotal();
        double discount = (discountPercent / 100) * total;
        return total - discount;
    }

    // display cart 
    void displayCart()
    {
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotal());
    }
}
