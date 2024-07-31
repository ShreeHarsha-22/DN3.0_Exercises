package Exercise7;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Main.java
public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        MobileApp mobileApp = new MobileApp(stockMarket);
        WebApp webApp = new WebApp(stockMarket);

        System.out.println("Setting stock price to $100.0");
        stockMarket.setPrice(100.0);

        System.out.println("\nSetting stock price to $150.0");
        stockMarket.setPrice(150.0);

        // Test deregistration
        stockMarket.deregisterObserver(mobileApp);

        System.out.println("\nSetting stock price to $200.0");
        stockMarket.setPrice(200.0);
    }
}
