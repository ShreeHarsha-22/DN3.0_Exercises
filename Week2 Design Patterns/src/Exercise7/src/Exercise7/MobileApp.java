package Exercise7;

// MobileApp.java
public class MobileApp implements Observer {
    private StockMarket stockMarket;

    public MobileApp(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
        this.stockMarket.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Mobile App: Stock price updated to " + stockMarket.getPrice());
    }
}
