import java.util.ArrayList;

public class Order {

    // member variables
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items = new ArrayList<Item>(); // must initiate an ArrayList...

    // Starter for initial testing
    public void Starter() {
        System.out.println("");
        System.out.println("====== Starting Order ======");
        System.out.println("");
        System.out.println("--- Order Class ---");
        System.out.println("");

        System.out.println("");
        System.out.println("====== End Order ======");
        System.out.println("");

    }

}