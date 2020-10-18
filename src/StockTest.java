import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StockTest {
    String symbol;
    String name;
    double lastClosingprice;
    double currentPrice;

    @Test
    void stock(){


    }

    @Test
    void percent() {
    Stock oracles = new Stock(symbol, name);
    name = "Oracle";
    symbol = "ORCL";
    lastClosingprice = 34.5;
    currentPrice = 34.35;

    assertEquals(34.35/34.5, oracles.percent(currentPrice, lastClosingprice));

    }
}