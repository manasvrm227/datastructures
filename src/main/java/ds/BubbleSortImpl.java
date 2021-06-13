package ds;

public class BubbleSortImpl {

	public static void main(String[] args) {
		int[] unsortedArray = new int[7];
		unsortedArray[0] = 20;
		unsortedArray[1] = 35;
		unsortedArray[2] = -15;
		unsortedArray[3] = 7;
		unsortedArray[4] = 55;
		unsortedArray[5] = 1;
		unsortedArray[6] = -22;
		
		
		
		for (int unsortedPartitionedIndex = unsortedArray.length - 1; unsortedPartitionedIndex > 0; unsortedPartitionedIndex--) {
			for (int j = 0; j < unsortedPartitionedIndex; j++) {
				//swap
				if(unsortedArray[j] > unsortedArray[j+1]) {
					int temp = unsortedArray[j];
					unsortedArray[j] = unsortedArray[j+1];
					unsortedArray[j+1] = temp;
				}
					
//				unsortedPartitionedIndex = unsortedArray[unsortedArray.length - 1 - i];
			}
		}
		
		for (int i : unsortedArray) {
			System.out.println(i);
		}

		
		
	}
}