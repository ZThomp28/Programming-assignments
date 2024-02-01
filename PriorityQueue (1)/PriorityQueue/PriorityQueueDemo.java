package PriorityQueue;

/**
 * @author Yan Zong Ding
 */

import java.util.*;

public class PriorityQueueDemo {

    /**
     * Finds and returns the k smallest (resp. k largest) elements of an input list
     * according to the elements' natural ordering if ascending is true (resp. false)
     *
     * Works by first building a heap-based priority queue consisting of the input elements,
     * then calling remove() k times.
     * The priority queue is a min priority queue if ascending is true, or
     * a max priority queue if ascending is false.
     * The elements come out in the desired order.
     *
     * Throws IllegalArgumentException if k < 0 or k > the size of the input list
     *
     * Time Complexity:  O(n + k log n) if ascending is true
     *                   O(n log n)     if ascending is false
     *
     * @param A          the input list whose elements are objects of a generic class T
     *                   assumed to implement the Comparable interface
     * @param k          the number of elements to return
     * @param ascending  a boolean parameter indicating whether to use the ascending
     *                   or descending order of the generic class T
     * @return           a list in ascending order consisting of the k smallest elements of A if ascending is true,
     *                   or a list in descending order consisting of the k largest elements of A if ascending is false
     * @throws           IllegalArgumentException if k < 0 or k > A.size()
     */
    public static <T extends Comparable <? super T>> List<T> firstK(List<T> A, int k, boolean ascending) {



        return null;
    }


    /**
     * Finds and returns the k smallest elements of an input list
     * according to the elements' natural ordering
     *
     * Works by first building a heap-based min-priority queue consisting of the input elements,
     * then calling remove() k times.
     * The elements come out in the desired order.
     *
     * Throws IllegalArgumentException if k < 0 or k > the size of the input list
     *
     * Time Complexity:  O(n + k log n)
     *
     * @param A          the input list whose elements are objects of a generic class T
     *                   assumed to implement the Comparable interface
     * @param k          the number of elements to return
     * @return           a list in ascending order consisting of the k smallest elements of A
     * @throws           IllegalArgumentException if k < 0 or k > A.size()
     */
    public static <T extends Comparable <? super T>> List<T> kSmallest(List<T> A, int k) {
        return null;
    }


    /**
     * Finds and returns the k largest elements of an input list
     * according to the elements' natural ordering
     *
     * Works by first building a heap-based max-priority queue consisting of the input elements,
     * then calling remove() k times.
     * The elements come out in the desired order.
     *
     * Throws IllegalArgumentException if k < 0 or k > the size of the input list
     *
     * Time Complexity:  O(n + k log n)
     *
     * @param A          the input list whose elements are objects of a generic class T
     *                   assumed to implement the Comparable interface
     * @param k          the number of elements to return
     * @return           a list in decending order consisting of the k largest elements of A
     * @throws           IllegalArgumentException if k < 0 or k > A.size()
     */
    public static <T extends Comparable <? super T>> List<T> kLargest(List<T> A, int k) {
        return null;
    }


    /**
     * Sorts a given list by Heap Sort in ascending order
     *
     * Time Complexity: O(n log n)
     *
     * @param A          the input list to sort, whose elements are objects of a generic class T
     *                   assumed to implement the Comparable interface
     * @return           a list consisting of elements of A in ascending order
     */
    public static <T extends Comparable <? super T>> List<T> heapSort(List<T> A) {
        return null;
    }


    /**
     * Finds and returns the first k elements of an input list
     * according to the ordering defined by a custom comparator
     *
     * Works by first building a heap-based priority queue using the custom comparator
     * and consisting of the input elements, then calling remove() k times.
     * The elements come out in the desired order.
     *
     * Throws IllegalArgumentException if k < 0 or k > the size of the input list
     *
     * Time Complexity: O(n log n)
     *
     * @param A    the input list
     * @param k    the number of elements to return
     * @param cmp  a custom comparator for the elements of A
     * @return     a list in ascending order consisting of the first k elements of A
     *             according to the ordering defined by cmp
     * @throws     IllegalArgumentException if k < 0 or k > A.size()
     */
    public static <T> List<T> firstK(List<T> A, int k, Comparator<T> cmp) {


        return null;
    }


    /**
     * Sorts a given list by Heap Sort according to the ordering defined by
     * a custom comparator
     *
     * @param A    the input list to sort
     * @param cmp  a custom comparator for the elements of A
     * @return     a list consisting of the elements of A
     * 			   according to the ordering defined by cmp
     */
    public static <T> List<T> heapSort(List<T> A, Comparator<T> cmp) {
        return null;
    }


    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        Random rand = new Random();

        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            A.add(rand.nextInt(2*n));
        }

        List<String> colors = new LinkedList<>(Arrays.asList(
                "Violet", "Indigo", "Blue", "Green", "Yellow", "Orange", "Red", "Cyan", "Gold", "Purple"));

        System.out.println("Heap Sort:\n");

        System.out.println("Before sorting: " + A);
        System.out.printf("%d smallest    : ", k);
        System.out.println(kSmallest(A, k));
        System.out.println("After sorting : " + heapSort(A));
        System.out.println();

        System.out.println("Before sorting: " + colors);
        System.out.printf("%d smallest    : ", k);
        System.out.println(kSmallest(colors, k));
        System.out.println("After sorting : " + heapSort(colors));
        System.out.println();


        System.out.println("k Closest Points from the Origin:\n");
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            points.add(new Point(rand.nextInt(n), rand.nextInt(n)));
        }
        System.out.println("points = " + points);
        System.out.println("k = " + k);
        System.out.println("k closest points from the origin: " );
        System.out.println();

//        System.out.println("Sort points in ascending order of distance from the origin:\n");
//
//        System.out.println("Heap Sort:        " + heapSort(points));
//        Collections.sort(points);
//        System.out.println("Collections.sort: " + points);
//        System.out.println();


//        System.out.println("Sort strings by length using a custom comparator:\n");
//
//        System.out.println("Before sorting         : " + colors);
//        StrLenComparator cmp = new StrLenComparator();
//
//        System.out.println("After Heap Sort        : " + heapSort(colors, cmp));
//        Collections.sort(colors, cmp);
//        System.out.println("After Collections.sort : " + colors);
//        System.out.println();

    }

}

class Point implements Comparable<Point> {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        return sqDistFromOrig(this) - sqDistFromOrig(p);
    }

    private static int sqDistFromOrig(Point p) {
        return p.x * p.x + p.y * p.y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}

class StrLenComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return s1.length() - s2.length();
        }
        else {
            return s1.compareTo(s2);
        }
    }

}


