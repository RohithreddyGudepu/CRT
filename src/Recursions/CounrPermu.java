package Recursions;

class CountPermu {
    public static void main(String[] args) {
        int result = countPath(3, 3, 0, 0);
        System.out.println(result); // Should print 6 for a 3x3 grid
    }

    public static int countPath(int n, int m, int i, int j) {
        // Out of bounds
        if (i > n || j > m) {
            return 0;
        }

        // Reached destination
        if (i == n && j == m) {
            return 1;
        }

        // Move down and right
        int countDown = countPath(n, m, i + 1, j);
        int countRight = countPath(n, m, i, j + 1);

        return countDown + countRight;
    }
}