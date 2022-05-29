package tasks.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockIITest {
    @Test
    void case1() {
        int actual = new BestTimeToBuyAndSellStockII().maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(7, actual);
    }

    @Test
    void case2() {
        int actual = new BestTimeToBuyAndSellStockII().maxProfit(new int[]{1,2,3,4,5});
        assertEquals(4, actual);
    }

    @Test
    void case3() {
        int actual = new BestTimeToBuyAndSellStockII().maxProfit(new int[]{7,6,4,3,1});
        assertEquals(0, actual);
    }
}