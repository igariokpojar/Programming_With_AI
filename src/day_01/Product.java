package day_01;

/**
 * A class representing a product with a name, price, id, and quantity.
 * @author Igariok
 */
public class Product {
    /**
     * The name of the product.
     */
    private String name;

    /**
     * The price of the product.
     */
    private double price;

    /**
     * The id of the product.
     */
    private String id;

    /**
     * The quantity of the product.
     */
    private int quantity;

    /**
     * Constructs a new product with the given name, price, id, and quantity.
     *
     * @param name The name of the product.
     * @param price The price of the product.
     * @param id The id of the product.
     * @param quantity The quantity of the product.
     */
    public Product(String name, double price, String id, int quantity) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }

    /**
     * Gets the name of the product.
     *
     * @return The name of the product.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the product.
     *
     * @param name The new name of the product.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the price of the product.
     *
     * @return The price of the product.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the product.
     *
     * @param price The new price of the product.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the id of the product.
     *
     * @return The id of the product.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id of the product.
     *
     * @param id The new id of the product.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the quantity of the product.
     *
     * @return The quantity of the product.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the product.
     *
     * @param quantity The new quantity of the product.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Generates a string representation of the product.
     *
     * @return A string representation of the product in the format "Product{name='name', price=price, id='id', quantity=quantity}"
     */
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    /**
     * Calculates the total cost of the product based on its price and quantity.
     *
     * @return double - The total cost of the product.
     */
    public double calculateTotalCost() {
        return price * quantity;
    }
}
    
    /*
Create a class named "Product" with no fields:
       name,price,id, and quantity.
       encapsulate all fields using appropriate access modifiers
       create a constructor that set all fields
       generate the getter and setter for each field

 */




