package tasks.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Search2DMatrixTest {

    @Test
    void case1() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        assertTrue(new Search2DMatrix().searchMatrix(matrix, 3));
    }

    @Test
    void case2() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        assertFalse(new Search2DMatrix().searchMatrix(matrix, 8));
    }

    @Test
    void case3() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {14, 15, 16}
        };

        assertTrue(new Search2DMatrix().searchMatrix(matrix, 16));
    }

    @Test
    void case4() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {14, 15, 16}
        };

        assertFalse(new Search2DMatrix().searchMatrix(matrix, 55));
    }

    @Test
    void case5() {
        int[][] matrix = {
                {1}
        };

        assertFalse(new Search2DMatrix().searchMatrix(matrix, 0));
    }

    @Test
    void case6() {
        int[][] matrix = {
                {1, 2}
        };

        assertFalse(new Search2DMatrix().searchMatrix(matrix, 0));
    }

    @Test
    void case7() {
        int[][] matrix = {
                {1},
                {2}
        };

        assertFalse(new Search2DMatrix().searchMatrix(matrix, 0));
    }

    @Test
    void case8() {
        int[][] matrix = {
                {1, 2}
        };

        assertTrue(new Search2DMatrix().searchMatrix(matrix, 2));
    }

    @Test
    void case9() {
        int[][] matrix = {
                {1},
                {2}
        };

        assertTrue(new Search2DMatrix().searchMatrix(matrix, 2));
    }

}
