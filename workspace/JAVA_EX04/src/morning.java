
public class morning {
	public static void main(String[] args) {
		int arr1[] = {6, 5, 4, 3, 2, 1};
		int arr2[] = {5, 3};
		
		sorting(arr1);
		sorting(arr2);
		
		int i = 0, j = 0;
		
		while(i == arr1.length && j == arr2.length) {
			if(arr1[i] == arr2[j]) {
				i++;
				j++;
				System.out.println(arr1[i]);
			} else if(arr1[i] > arr2[j]) {
				j++;
			} else if(arr1[i] < arr2[j]) {
				i++;
			}
		}
		
	}
	
	public static int[] sorting(int[] arr) {
		String result = null;
		for(int i = 0; i<=arr.length-1; i++) {
			int temp = 0;
			if(arr[i] > arr[i+1]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			System.out.print(arr[i] + " ");
			
		}
		System.out.println(result);
		return arr;
	}
}
