package p01.algorithm;

public class SelectionSortAlgorithm {

	public static void main(String[] args) {
		SelectionSortAlgorithm select = new SelectionSortAlgorithm();

		int[] arr = { 7, 3, 9, 2, 5, 1, 10, 4, 6, 8 };
		select.sort(arr);
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public void sort(int[] arr) {
		int size = arr.length;
		int min;
		int temp;
		for (int i = 0; i < size - 1; i++) {
			min = i;
			for (int j = i + 1; j < size; j++) {
				if (arr[min] > arr[j])
					min = j;
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

}
