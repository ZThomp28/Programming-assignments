import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListDemo5 {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        int n = 100000;
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            list.add(rand.nextInt(n));
        }
        if (n < 20) {
            System.out.println("list: " + list);
        }

        int sum1 = 0;
        long start = System.currentTimeMillis();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            sum1 += listIterator.next();
        }
        long end = System.currentTimeMillis();
        System.out.println("Iteration by list iterator: ");
        System.out.println("sum = " + sum1);
        System.out.printf("time: %.3f\n\n", (double)(end - start)/1000);

        int sum2 = 0;
        start = System.currentTimeMillis();
        for (int elem : list) {
            sum2 += elem;
        }
        end = System.currentTimeMillis();
        System.out.println("Iteration by foreach loop: ");
        System.out.println("sum = " + sum2);
        System.out.printf("time: %.3f\n\n", (double)(end - start)/1000);

        int sum3 = 0;
        start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            sum3 += list.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Iteration by indices: ");
        System.out.println("sum = " + sum3);
        System.out.printf("time: %.3f\n\n", (double)(end - start)/1000);
    }
}
