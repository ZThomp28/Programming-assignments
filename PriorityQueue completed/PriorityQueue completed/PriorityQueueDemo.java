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

        if (k < 0 || k > A.size()) {
            String errMsg = String.format("Index %d is out of bound", k);
            throw new IndexOutOfBoundsException(errMsg);
        }

        PriorityQueue<T> pq;
        if (ascending) {
            pq = new PriorityQueue<>(A);
        }
        else {
            pq = new PriorityQueue<>(Collections.reverseOrder());
            pq.addAll(A);
        }

        List<T> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(pq.remove());
        }

        return res;
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
        return firstK(A, k, true);
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
        return firstK(A, k, false);
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
        return kSmallest(A, A.size());
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

        if (k < 0 || k > A.size()) {
            String errMsg = String.format("Index %d is out of bound", k);
            throw new IndexOutOfBoundsException(errMsg);
        }

        PriorityQueue<T> pq = new PriorityQueue<>(cmp);
        pq.addAll(A);

        List<T> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(pq.remove());
        }

        return res;
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
        return firstK(A, A.size(), cmp);
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
        System.out.println("k closest points from the origin: " + kSmallest(points, k));
        System.out.println();

        System.out.println("Sort points in ascending order of distance from the origin:\n");

        System.out.println("Heap Sort:        " + heapSort(points));
        Collections.sort(points);
        System.out.println("Collections.sort: " + points);
        System.out.println();


        System.out.println("Sort strings by length using a custom comparator:\n");

        System.out.println("Before sorting         : " + colors);
//        StrLenComparator cmp = new StrLenComparator();

        // A comparator that orders strings first by length in ascending order and then by alphabetical order.
        // In other words, shorter strings precede (i.e., have higher priorities than) longer strings;
        // if two strings are of the same length, then the alphabetical order is used to break the tie.
        Comparator<String> cmp = (s1, s2) -> {
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            }
            else {
                return s1.compareTo(s2);
            }
        };

        System.out.println("After Heap Sort        : " + heapSort(colors, cmp));
        Collections.sort(colors, cmp);
        System.out.println("After Collections.sort : " + colors);
        System.out.println();

        System.out.println("k Closest Points from a source point:\n");

        Point s = new Point(rand.nextInt(n), rand.nextInt(n));
        System.out.println("points = " + points);
        System.out.println("source s: " + s);
        System.out.println("k = " + k);

        // A comparator that orders points by distance from a given source point in ascending order.
        // In other words, points closer to the source precede (i.e., have higher priorities than)
        // points farther from the source.
        Comparator<Point> cmp2 = Comparator.comparingDouble(p -> sqDist(p, s));

//        Comparator<Point> cmp2 = (p, q) -> {
//            return Double.compare(sqDist(p, s), sqDist(q, s));
//        };

        System.out.println("k closest points from the source s: " + firstK(points, k, cmp2));
        System.out.println();

        System.out.println("Sort points in ascending order of distance from the source s:\n");

        System.out.println("Heap Sort:        " + heapSort(points, cmp2));
        Collections.sort(points, cmp2);
        System.out.println("Collections.sort: " + points);
        System.out.println();


    }

    private static int sqDist(Point p, Point q) {
        return (p.x - q.x)*(p.x - q.x) + (p.y - q.y)*(p.y - q.y);
    }

}

class Point implements Comparable<Point> {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Defines an ordering on points in the 2D plane by distance from the origin in ascending order,
     * that is, points closer to the origin precede (i.e., have higher priorities than) points farther from the origin.
     *
     * @param p
     * @return
     */
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


