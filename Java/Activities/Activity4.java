package activities;

public class Activity4 {
	public static void main(String[] args) {
		int[] num = {4,3,2,10,12,1,5,6,7};

		insertionSort(num);
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}
	
	public static void insertionSort(int[] num) {
		for(int i=1;i<num.length;i++) {
			int key = num[i];
			int j=i-1;
			while(j >= 0 && key < num[j] ) {
				num[j+1] = num[j];
				j--;
			}
			num[j+1] = key;
		}
	}
}
