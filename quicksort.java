import java.util.Scanner;
public class quicksort{
	public static void main(String[] args){

		Scanner keybd = new Scanner(System.in);
		int num = keybd.nextInt();
		int index = keybd.nextInt();

		int[] arr = new int[num];

		for(int i = 0; i<num; i++)
		{
			arr[i] = keybd.nextInt();
		}
 
		int lower = 0;
		int upper = arr.length - 1;
 
		order(arr, lower, upper);
		System.out.println(arr[index-1]);
	}
 
	public static void order(int[] arr, int lower, int upper) {
		if (arr.length == 0)
		{
			return;
		}
 
		if (lower >= upper)
		{
			return;
		}
 
		int mid = lower + (upper - lower) / 2;
		int pivot = arr[mid];
		
 		int temp = 0;
		int i = lower;
		int j = upper;

		while (i <= j) 
		{
			while (arr[i] < pivot) 
			{
				i++;
			}
 
			while (arr[j] > pivot) 
			{
				j--;
			}
 
			if (i <= j) 
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		if (lower < j)
		{
			order(arr, lower, j);
		}
 
		if (upper > i)
		{
			order(arr, i, upper);
		}
	}
}
