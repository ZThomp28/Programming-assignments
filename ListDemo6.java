import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListDemo6 {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>(list);
        int n = 10;
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            int x = rand.nextInt(n);
            list.add(x);
            list2.add(x);
        }

        System.out.println("Iteration by list iterator: ");
        if (n < 20) {
            System.out.println("list before set: " + list);
        }

        ListIterator<Integer> listIterator = list.listIterator();
        long start = System.currentTimeMillis();
        while (listIterator.hasNext()) {
            listIterator.set(10 * listIterator.next());
        }
        long end = System.currentTimeMillis();
        if (n < 20) {
            System.out.println("list after set : " + list);
        }
        System.out.printf("time: %.3f\n\n", (double)(end - start)/1000);

        System.out.println("Iteration by indices: ");
        if (n < 20) {
            System.out.println("list before set: " + list2);
        }
        start = System.currentTimeMillis();
        for (int i = 0; i < list2.size(); i++) {
            list2.set(i, 10 * list2.get(i));
        }
        end = System.currentTimeMillis();
        if (n < 20) {
            System.out.println("list after set : " + list2);
        }
        System.out.printf("time: %.3f\n\n", (double)(end - start)/1000);
    }
}
