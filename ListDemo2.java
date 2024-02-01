import java.util.ArrayList;
import java.util.Random;

public class ListDemo2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        int n = 10000000;

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = rand.nextInt(n);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.add(data[i]);
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time for %d add operations: %.3f seconds", n, (double)(end - start)/1000);
        System.out.println();

        int[] indices = new int[n];
        for (int i = 0; i < n; i++) {
            indices[i] = rand.nextInt(n);
        }

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.get(indices[i]);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d get operations: %.3f seconds", n, (double)(end - start)/1000);
        System.out.println();

        for (int i = 0; i < n; i++) {
            data[i] = rand.nextInt(n);
        }

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.set(indices[i], data[i]);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d set operations: %.3f seconds", n, (double)(end - start)/1000);
        System.out.println();
        System.out.println();

        ArrayList<Integer> list2 = new ArrayList<>();
        n = 200000;
        int[] data2 = new int[n];
        for (int i = 0; i < n; i++) {
            data2[i] = rand.nextInt(n);
        }
        for (int i = 0; i < n; i++) {
            list2.add(data2[i]);
        }

        int[] indices2 = new int[n];
        int size = n;
        for (int i = 0; i < n; i++) {
            indices2[i] = rand.nextInt(size++);
        }
        for (int i = 0; i < n; i++) {
            data2[i] = rand.nextInt(n);
        }

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list2.add(indices2[i], data2[i]);
            // list2.add(0, data2[i]);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d add_at_index operations on an array list of size %d: %.3f seconds",
                n, n, (double)(end - start)/1000);
        System.out.println();

        size = list2.size();
        for (int i = 0; i < n; i++) {
            indices2[i] = rand.nextInt(size--);
        }

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list2.remove(indices2[i]);
            // list2.remove(0);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d remove_at_index operations on an array list of size %d: %.3f seconds",
                n, 2*n, (double)(end - start)/1000);
        System.out.println();

        for (int i = 0; i < n; i++) {
            data2[i] = rand.nextInt(n);
        }

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list2.indexOf(data2[i]);
            // list2.indexOf(10*n);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d indexOf operations on an array list of size %d: %.3f seconds",
                n, list2.size(), (double)(end - start)/1000);

    }
}
