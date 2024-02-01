import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ListDemo4 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        int n = 400000;
        Random rand = new Random();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = rand.nextInt(n);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedList.addFirst(data[i]);
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time for %d addFirst operations to linkedList: %.3f seconds", n, (double)(end - start)/1000);
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arrayList.add(0, data[i]);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d add_at_0 operations to arrayList: %.3f seconds", n, (double)(end - start)/1000);
        System.out.println();
        System.out.println();

        System.out.println("arrayList equals linkedList: " + arrayList.equals(linkedList));
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedList.removeFirst();
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d removeFirst operations to linkedList of size %d: %.3f seconds",
                n, n, (double)(end - start)/1000);
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arrayList.remove(0);
        }
        end = System.currentTimeMillis();
        System.out.printf("Time for %d remove_at_0 operations to arrayList of size %d: %.3f seconds",
                n, n, (double)(end - start)/1000);
        System.out.println();
        System.out.println();

        System.out.println("arrayList: " + arrayList);
        System.out.println("linkedList: " + linkedList);



    }
}
