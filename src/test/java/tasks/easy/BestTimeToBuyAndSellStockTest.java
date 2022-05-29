package tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {

    @Test
    void case1() {
        int actual = new BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(5, actual);
    }

    @Test
    void case2() {
        int actual = new BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 6, 4, 3, 1});
        assertEquals(0, actual);
    }

}