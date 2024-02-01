import java.util.Random;
public class Driver {

	public static void main(String[] args) {
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;
		int[] array = new int[1000];
		int[] array2 = new int[1000];
		int x = array.length;
		int z = array2.length;
		Random rand = new Random();
		for(int i=0;i<x;i++) {
			array[i]=rand.nextInt(1000)+1;
		}
		for(int i=0;i<z;i++) {
			array2[i]=rand.nextInt(1000)+1;
		}
		
		QuickSort ob = new QuickSort();
		QuickSort ob2 = new QuickSort();
		QuickSort ob3 = new QuickSort();
		ob2.sort(array,0,x-1);
		ob.sort(arr, 0, n - 1);
		ob3.selectionsort(array2);
		System.out.println("sorted array");
		ob.printArray(arr);
		System.out.println("Quicksorted 1000 array");
		ob.printArray(array);
		System.out.println("Selectionsorted 1000 array");
		ob.printArray(array2);
	}

}
