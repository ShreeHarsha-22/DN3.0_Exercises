package Exercise7;

// WebApp.java
public class WebApp implements Observer {
    private StockMarket stockMarket;

    public WebApp(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
        this.stockMarket.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Web App: Stock price updated to " + stockMarket.getPrice());
    }
}

