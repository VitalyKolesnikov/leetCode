package tasks.medium;

public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length * matrix[0].length;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int number = getByIndex(matrix, mid);

            if (number < target) {
                low = mid + 1;
            } else if (number > target) {
                high = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }

    private int getByIndex(int[][] matrix, int index) {
        if (index == 0) {
            return matrix[0][0];
        }

        int row = (index - 1) / matrix[0].length;
        int col = (index - 1) % matrix[0].length;

        return matrix[row][col];
    }

}
