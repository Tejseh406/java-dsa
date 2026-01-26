package sorting;

public class SelectionSort {
    public void selectionSort(int[] arr){
        int n = arr.length;

        for(int i =0;i<n-1;i++){
			int min = i;

            //find the minimum element in unsorted array
			for(int j = i+1;j<n;j++){
				if(arr[j] < arr[min]) min = j;
			}

            //swap the minimum element with the first element
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        SelectionSort sorter = new SelectionSort();
        sorter.selectionSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

// Time Complexity: O(n^2) in all cases
// Space Complexity: O(1). No extra space is used.