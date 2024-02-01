public class QuickSort {

	/*
	 * This function takes last element as pivot, places the pivot element at its
	 * correct position in sorted array, and places all smaller (smaller than pivot)
	 * to left of pivot and all greater elements to right of pivot
	 */
	public int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {
			// If current element is smaller than the pivot
			if (arr[j] < pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	/*
	 * The main function that implements QuickSort() arr[] --> Array to be sorted,
	 * low --> Starting index, high --> Ending index
	 */
	public void sort(int arr[], int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	/* A utility function to print array of size n */
	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	 public void sort1(int[] arr) {
         int left = arr[0];
         int right = arr[arr.length-1];

         quickSort(arr, left, right);

     }

     public void quickSort(int[] arr, int left, int right) {

     int pivotIndex = left + (right - left) / 2;
     int pivotValue = arr[pivotIndex];

     int i = left, j = right;

     while(i <= j) {

         while(arr[i] < pivotValue) {
             i++;
         }

         while(arr[j] > pivotValue) {
             j--;
         }

         if(i <= j) {
             int tmp = arr[i];
             arr[i] = arr[j];
             arr[j] = tmp;
             i++;
             j--;
         }

         if(left < i) {
             quickSort(arr, left, j);
         }

         if(right > i) {
             quickSort(arr, i, right);
         }

     }
    	 
     }
     void selectionsort(int arr[])
     {
         int n = arr.length;
  
         // One by one move boundary of unsorted subarray
         for (int i = 0; i < n-1; i++)
         {
             // Find the minimum element in unsorted array
             int min_idx = i;
             for (int j = i+1; j < n; j++){
                 if (arr[j] < arr[min_idx])
                     min_idx = j;
             }
  
             // Swap the found minimum element with the first
             // element
             int temp = arr[min_idx];
             arr[min_idx] = arr[i];
             arr[i] = temp;
         }
     }

}