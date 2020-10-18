public class Stock {
    String symbol;
    String Name;
    double lastClosingprice;
    double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        Name = name;
    }
    public double percent(double lastClosingprice, double currentPrice){
        double change = lastClosingprice / currentPrice;
        return change;
    }

    public static void main(String[] args) {
        Stock apple = new Stock("app", "apple");
        apple.lastClosingprice = 70;
        apple.currentPrice = 60;
        Stock microsoft = new Stock("Mic", "Microsoft");
        microsoft.lastClosingprice = 70;
        microsoft.currentPrice = 80;

        System.out.println(apple.Name + ":" + apple.symbol + " " + apple.percent(apple.currentPrice, apple.lastClosingprice));


    }
}
