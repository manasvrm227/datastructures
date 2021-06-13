package ds;

import java.util.Arrays;

public class MergeSortTest {
	public static void main(String[] args) {

		// split in L and R arrays till we have single element in array.
		// merge and sort sibling arrays.

		int[] unsortedArray = { 2, 4, 1, 6, 8, 5, 3, 7 };
//		unsortedArray[0] = 20;
//		unsortedArray[1] = 35;
//		unsortedArray[2] = -15;
//		unsortedArray[3] = 7;
//		unsortedArray[4] = 55;
//		unsortedArray[5] = 1;
//		unsortedArray[6] = -22;

		System.out.println("Unsorted Array: ");
		Arrays.stream(unsortedArray).forEach((ele) -> {
			System.out.print(ele + " ");
		});
		System.out.println();
		splitInto2Arrays(unsortedArray);

		System.out.println(Arrays.toString(unsortedArray));

	}

	private static void splitInto2Arrays(int[] unsortedArray) {
		int n = unsortedArray.length;

		if (n < 2)
			return;

		int mid = n / 2;

		int[] Larr = new int[mid];
		int[] Rarr = new int[n - mid];

		for (int i = 0; i < mid; i++)
			Larr[i] = unsortedArray[i];

		for (int i = mid; i < n; i++)
			Rarr[i - mid] = unsortedArray[i];

		splitInto2Arrays(Larr);
		splitInto2Arrays(Rarr);

		System.out.println("left:: "+Arrays.toString(Larr));
		System.out.println("right:: "+Arrays.toString(Rarr));
		merge(Larr, Rarr, unsortedArray); // merge left and right array into unsortedArray
	}

	private static void merge(int[] L, int[] R, int[] unsortedArray) {
		int nL = L.length;
		int nR = R.length;
		int i = 0, j = 0, k = 0;

		// check for valid index.
		while (i < nL && j < nR) {
			if (L[i] <= R[j]) {
				unsortedArray[k] = L[i];
				k = k + 1;
				i = i + 1;
			} else {
				unsortedArray[k] = R[j];
				k = k + 1;
				j = j + 1;
			}
		}
		while (i < nL) {
			unsortedArray[k] = L[i];
			k = k + 1;
			i = i + 1;
		}
		while (j < nR) {
			unsortedArray[k] = R[j];
			k = k + 1;
			j = j + 1;
		}
		
		System.out.println("Method::  "+Arrays.toString(unsortedArray));
	}
}