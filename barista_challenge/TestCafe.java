import java.util.ArrayList;

public class TestCafe{
    public static void main(String[] args){
        // Menu items
        Item item1 = new Item("drip coffee", 4.5);
        Item item2 = new Item("capuccino", 3.5);
        Item item3 = new Item("iced coffee", 2.5);
        Item item4 = new Item("mocha", 4.25);

        // 2 unspecified orders
        Order order1 = new Order();
        Order order2 = new Order();

        // 3 named orders
        Order order3 = new Order("Zara");
        Order order4 = new Order("May");
        Order order5 = new Order("Bea");

        // Add 2 items to each order and call display after
        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item1);
        order3.addItem(item4);

        order4.addItem(item2);
        order4.addItem(item3);

        order5.addItem(item2);
        order5.addItem(item3);
        order5.addItem(item4);

        // Test status
        System.out.println(order3.getStatusMessage());
        order5.setReady(true);
        System.out.println(order3.getStatusMessage());

        // Test order total
        System.out.println(order3.getOrderTotal());
        order3.display();
    }
}