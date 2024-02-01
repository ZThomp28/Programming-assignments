import java.util.*;

public class ListDemo7 {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        int n = 10;
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            int x = rand.nextInt(n);
            list.add(x);
        }
        if (n < 20) {
            System.out.println("initial list: " + list);
            System.out.println();
        }

        //list.removeIf(x -> (x % 2 != 0));
        removeOdds(list);

        if (n < 20) {
            System.out.println("list after removeOdds: " + list);
            System.out.println();
        }

        int j = rand.nextInt(list.size()+1);
        List<Integer> elements = Arrays.asList(new Integer[] {1000, 2000, 3000});
        addAtIndex(list, j, elements);
        if (n < 20) {
            System.out.printf("list after addAtIndex(list, %d, %s): %s", j, elements, list);
            System.out.println();
        }

    }

    /**
     * Removes all odd elements of a list of integers
     * removeOdds(list) has the same effect as list.removeIf(x -> (x % 2 != 0))
     *
     * @param list  a list of integers
     */
    public static void removeOdds(List<Integer> list) {
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int x = listIterator.next();
            if (x % 2 != 0) {
                listIterator.remove();
            }
        }
    }

    /**
     * Adds a list of elements to a given list at a specified index
     *
     * @param list      a list
     * @param index     an index
     * @param elements  a list of elements to add to the given list at a specified index
     * @param <T>
     */
    public static <T> void addAtIndex(List<T> list, int index, List<T> elements) {
        if (index < 0 || index > list.size()) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bound");
        }

        ListIterator<T> listIterator = list.listIterator(index);
//        while (listIterator.nextIndex() < index) {
//            listIterator.next();
//        }

        for (T elem : elements) {
            listIterator.add(elem);
        }
    }
}
