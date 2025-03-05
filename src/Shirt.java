public class Shirt {
    public int shirtID = 0047;
    public String description = "*Description*";
    public char colorCode = 'R';
    public double price = 45.99; 
    public int quantityInStock = 12; 

    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}