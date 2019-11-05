//creating public class named Main with variable names//
public class Main {
    private String name;
    private double price;
    private String expirationDate;
    private String dietRestriction;
    private int quantityInStock;

    //default constructor//
    public Main() {
    }
//setters and getters for each variable//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getDietRestriction() {
        return dietRestriction;
    }

    public void setDietRestriction(String dietRestriction) {
        this.dietRestriction = dietRestriction;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
//overloaded constructor//
    public Main(String name, double price, String expirationDate, String dietRestriction, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.dietRestriction = dietRestriction;
        this.quantityInStock = quantityInStock;
    }
    public void displayText() {
        System.out.println("Welcome to the EPS's Better Bakery App! ");
        System.out.println("We contain peanut, gluten, soy and dairy in our products. ");
        System.out.println("To search for foods that you can eat, please enter the name of the diet restriction: ");
        System.out.println("To see a list of all our foods, please type all");
    }
    //method to print the statement //
    static void pricing(double price) {
        }
    }