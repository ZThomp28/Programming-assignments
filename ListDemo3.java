import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListDemo3 {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int n = 100000;
        Random rand = new Random();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = rand.nextInt(n);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arrayList.add(data[i]);
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time for %d add operations to arrayList: %.3f seconds", n, (double)(end - start)/1000);
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedList.add(data[i]);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d add operations to linkedList: %.3f seconds", n, (double)(end - start)/1000);
        System.out.println();
        System.out.println();

        int[] indices = new int[n];
        for (int i = 0; i < n; i++) {
            indices[i] = rand.nextInt(n);
        }

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arrayList.get(indices[i]);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d get operations on an array list of size %d: %.3f seconds",
                n, arrayList.size(), (double)(end - start)/1000);
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedList.get(indices[i]);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d get operations on a linked list of size %d: %.3f seconds",
                n, linkedList.size(), (double)(end - start)/1000);
        System.out.println();
        System.out.println();

        for (int i = 0; i < n; i++) {
            data[i] = rand.nextInt(n);
        }

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arrayList.set(indices[i], data[i]);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d set operations on an array list of size %d: %.3f seconds",
                n, arrayList.size(), (double)(end - start)/1000);
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedList.set(indices[i], data[i]);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d set operations on a linked list of size %d: %.3f seconds",
                n, linkedList.size(), (double)(end - start)/1000);
        System.out.println();
        System.out.println();

        int size = n;
        for (int i = 0; i < n; i++) {
            indices[i] = rand.nextInt(size++);
        }
        for (int i = 0; i < n; i++) {
            data[i] = rand.nextInt(n);
        }

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arrayList.add(indices[i], data[i]);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d add_at_index operations on an array list of size %d: %.3f seconds",
                n, n, (double)(end - start)/1000);
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedList.add(indices[i], data[i]);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d add_at_index operations on a linked list of size %d: %.3f seconds",
                n, n, (double)(end - start)/1000);
        System.out.println();
        System.out.println();

        System.out.println("arrayList equals linkedList: " + arrayList.equals(linkedList));
        System.out.println();

        size = arrayList.size();
        for (int i = 0; i < n; i++) {
            indices[i] = rand.nextInt(size--);
        }

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arrayList.remove(indices[i]);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d remove_at_index operations on an array list of size %d: %.3f seconds",
                n, 2*n, (double)(end - start)/1000);
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedList.remove(indices[i]);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d remove_at_index operations on a linked list of size %d: %.3f seconds",
                n, 2*n, (double)(end - start)/1000);
        System.out.println();
        System.out.println();

        System.out.println("arrayList equals linkedList: " + arrayList.equals(linkedList));
        System.out.println();

        for (int i = 0; i < n; i++) {
            data[i] = rand.nextInt(n);
        }

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arrayList.indexOf(data[i]);
            // arrayList.indexOf(10*n);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d indexOf operations on an array list of size %d: %.3f seconds",
                n, arrayList.size(), (double)(end - start)/1000);
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedList.indexOf(data[i]);
            // linkedList.indexOf(10*n);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d indexOf operations on a linked list of size %d: %.3f seconds",
                n, linkedList.size(), (double)(end - start)/1000);
    }
}
