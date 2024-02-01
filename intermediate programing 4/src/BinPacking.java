import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class BinPacking {

private static final int binLimit = 10;

public static boolean lessThanLimit(int a, int b) {
    if (a + b < binLimit) {
        return true;
    } else {
        return false;
    }
}

public static boolean perfectFit(int a, int b) {
    if (a + b == binLimit) {
        return true;
    } else {
        return false;
    }
}

public static boolean weightsLeft(boolean[] a) { // check if there is one more item that has not been binned yet.
    for (boolean b : a) {
        if (b) {
            return true;
        }
    }
    return false;
}

public static ArrayList<int[]> distributeObjects(int[] weights) {
    int counter = 0;
    boolean[] objectAssigned = new boolean[weights.length]; // array to track which objects have been assigned already
    ArrayList<int[]> result = new ArrayList<int[]>(); // list of int[] to be returned
    for (int i = 0; i < weights.length; i++) {
        ArrayList<Integer> currentBin = new ArrayList<Integer>(); // list to store the values of the weights in currrent bin
        int currentBinWeight = 6;
        if (!objectAssigned[i]) {
            currentBin.add(weights[i]);
            currentBinWeight = weights[i];
            objectAssigned[i] = true;
        } else
            counter = 1;

        stupidLoopThatWontBreak: 
        while (currentBinWeight < binLimit && counter < 1) {
            counter = 1;
            if (!weightsLeft(objectAssigned)) { // break loop if no more weights left
                result.add(currentBin.stream().mapToInt(Integer::intValue).toArray());
                break stupidLoopThatWontBreak;
            }
            for (int j = i + 1; j < weights.length; j++) {
                if (perfectFit(currentBinWeight, weights[j]) && !objectAssigned[j]) {
                    currentBin.add(weights[j]);
                    currentBinWeight += weights[j];
                    objectAssigned[j] = true;
                    break stupidLoopThatWontBreak;
                }
                if (lessThanLimit(currentBinWeight, weights[j]) && !objectAssigned[j]) {
                    currentBinWeight += weights[j];
                    currentBin.add(weights[j]);
                    objectAssigned[j] = true;
                }
            }
        }
        // convert arraylist to int[] and add it to result. Java 8+ feature
        if (!currentBin.isEmpty()) {
            result.add(currentBin.stream().mapToInt(Integer::intValue).toArray());
            counter = 0;
        }
    }
    return result;
}

public static void main(String[] args) {

    System.err.println("Container weight limit is " + binLimit);
    Scanner in = new Scanner(System.in);
    //Test numbers 7, 5, 3, 2, 5, 8
    // System.out.print("Enter the weights of the objects you want to put into the bins: ");
    // String input = in.nextLine();
    // in.close();
//========================Random numbers for testing======================
    String input = "";
    Random ran = new Random();
    System.out.print("Enter number of weights to be randomly generated: ");
    int num = in.nextInt();
    in.close();
    for (int i = 0; i < num; i++) {
        input += (ran.nextInt(binLimit) + 1) + " "; //+1 to not have zeroes
    }
//========================End of random numbers===========================
    ArrayList<Integer> list = new ArrayList<Integer>();
    String[] str = input.trim().split(" "); // trim surrounding spaces, use space char as separator
    for (String a : str) {
        list.add(Integer.valueOf(a));
    }

    // sort the list in a descending order
    Collections.sort(list);
    Collections.reverse(list); // this could be avoided if I started checking from the last index in distributeObjects()
    System.out.println("The generated and sorted descendingly weights are:");
    System.out.println("\n" + list.toString() + "\n");

    int[] weights = new int[list.size()];
    for (int a = 0; a < weights.length; a++) {
        weights[a] = list.get(a);
    }

    ArrayList<int[]> bins = distributeObjects(weights);

    for (int i = 0; i < bins.size(); i++) {
        System.out.println("Container " + (i + 1) + " contains objects with weight: " + Arrays.toString(bins.get(i)));
    }

}

}