import java.util.ArrayList;

public class TestOrders{
    public static void main(String[] args){
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();

        coffeeKiosk.addMenuItem("mocha", 4.5);
        coffeeKiosk.addMenuItem("iced coffee", 3.5);
        coffeeKiosk.addMenuItem("muffin", 2.5);
        coffeeKiosk.newOrder();
    }
}