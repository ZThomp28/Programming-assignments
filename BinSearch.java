import java.util.*;

public class BinSearch {

    /**
     * Search for a target element in a sorted array by linear search
     * Time Complexity: O(n)
     *
     * @param A       a sorted array
     * @param target  a target element
     * @return        the index of an occurrence of target in A if target appears in A,
     *                -1 otherwise.
     */
    public static int linSearch(int[] A, int target) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == target) {
                return i;
            }

            if (A[i] > target) {
                break;
            }
        }

        return -1;
    }

    /**
     * Search for a target element in a sorted array by binary search
     * Time Complexity: O(log n)
     *
     * @param A       a sorted array
     * @param target  a target element
     * @return        the index of an occurrence of target in A if target appears in A,
     *                -1 otherwise.
     */
    public static int binSearch(int[] A, int target) {
        int left = 0;
        int right = A.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (A[mid] == target) {
                return mid;
            }
            else if (A[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    /**
     * Search, by linear search, for the largest price not exceeding a budget in a sorted array of prices
     * Time Complexity: O(n)
     *
     * @param prices  a sorted array of prices
     * @param budget  a budget
     * @return        the largest price in the prices array not exceeding the budget if such a price exists,
     *                -1 otherwise.
     */
    public static int maxPriceLinSearch(int[] prices, int budget) {
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == budget) {
                return budget;
            }

            if (prices[i] > budget) {
                return (i > 0) ? prices[i-1] : -1;
            }
        }

        return prices[prices.length - 1];
    }

    /**
     * Search, by binary search, for the largest price not exceeding a budget in a sorted array of prices
     * Time Complexity: O(log n)
     *
     * @param prices  a sorted array of prices
     * @param budget  a budget
     * @return        the largest price in the prices array not exceeding the budget if such a price exists,
     *                -1 otherwise.
     */
    public static int maxPriceBinSearch(int[] prices, int budget) {
        int left = 0;
        int right = prices.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (prices[mid] == budget) {
                return budget;
            }
            else if (prices[mid] < budget) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return (right >= 0) ? prices[right] : -1;
    }

    /**
     * Test driver for the above four methods
     */
    public static void main(String[] args) {
        int n = 10;
        int[] A = new int[n];
        Random rand = new Random();

        /**
         * Generate a test input array consisting of random numbers
         */
        for (int i = 0; i < n; i++) {
            A[i] = rand.nextInt(2 * n) + 2;
        }
        Arrays.parallelSort(A);

        int q = 5;
        int[] queries = new int[q];
        for (int i = 0; i < q; i++) {
            queries[i] = rand.nextInt(2 * n) + 2;
            // queries[i] = 10 * n;
        }
        queries[q-1] = 1;


        if (A.length <= 20) {
            System.out.println("A: " + Arrays.toString(A));
        }
        if (queries.length <= 10) {
            System.out.println("queries: " + Arrays.toString(queries));
        }
        System.out.println();

        System.out.println("Binary Search: ");

        int[] ans = new int[q];
        long tic = System.currentTimeMillis();
        for (int i = 0; i < q; i++) {
            ans[i] = binSearch(A, queries[i]);
        }
        long toc = System.currentTimeMillis();

        if (q <= 10) {
            for (int i = 0; i < q; i++) {
                System.out.printf("Query: %d; Index: %d", queries[i], ans[i]);
                String str = (ans[i] == -1) ? "" : String.format(";  A[%d] = %d", ans[i], A[ans[i]]);
                System.out.println(str);
            }
        }

        System.out.println("Time elapsed: " + (double) (toc - tic) / 1000);
        System.out.println("");

        System.out.println("Linear Search: ");

        int[] ans2 = new int[q];
        long tic2 = System.currentTimeMillis();
        for (int i = 0; i < q; i++) {
            ans2[i] = linSearch(A, queries[i]);
        }
        long toc2 = System.currentTimeMillis();

        if (q <= 10) {
            for (int i = 0; i < q; i++) {
                System.out.printf("Query: %d; Index: %d", queries[i], ans2[i]);
                String str = (ans2[i] == -1) ? "" : String.format(";  A[%d] = %d", ans2[i], A[ans2[i]]);
                System.out.println(str);
            }
        }

        System.out.println("Time elapsed: " + (double) (toc2 - tic2) / 1000);
        System.out.println();

        if (n <= 20) {
            System.out.println("Prices: " + Arrays.toString(A));
        }
        if (q <= 10) {
            System.out.println("Budgets: " + Arrays.toString(queries));
        }
        System.out.println();

        System.out.println("maxPriceBinSearch: ");

        int[] ans3 = new int[q];
        long tic3 = System.currentTimeMillis();
        for (int i = 0; i < q; i++) {
            ans3[i] = maxPriceBinSearch(A, queries[i]);
        }
        long toc3 = System.currentTimeMillis();

        if (q <= 10) {
            for (int i = 0; i < q; i++) {
                System.out.printf("Budget: %d; Price: %d\n", queries[i], ans3[i]);
            }
        }

        System.out.println("Time elapsed: " + (double)(toc3-tic3) / 1000);
        System.out.println("");

        System.out.println("maxPriceLinSearch: ");

        int[] ans4 = new int[q];
        long tic4 = System.currentTimeMillis();
        for (int i = 0; i < q; i++) {
            ans4[i] = maxPriceLinSearch(A, queries[i]);
        }
        long toc4 = System.currentTimeMillis();

        if (q <= 10) {
            for (int i = 0; i < q; i++) {
                System.out.printf("Budget: %d; Price: %d\n", queries[i], ans4[i]);
            }
        }

        System.out.println("Time elapsed: " + (double) (toc4 - tic4) / 1000);
        System.out.println("");

    }

}

