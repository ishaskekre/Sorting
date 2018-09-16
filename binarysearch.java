import java.util.Scanner;

public class binarysearch{

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int length = input.nextInt();
    int target = input.nextInt();
    int[] sorted = new int[length];

    for(int i = 0; i < sorted.length; i++)
      sorted[i] = input.nextInt();

    System.out.println(binarySearch(sorted, 0, sorted.length-1, target));

  }

  public static int binarySearch(int[] arr, int beg, int end, int target){

    int mid = (beg + end)/2;

    if(end < beg){
      return -1;
    }

    if(arr[mid] == target){

      if(binarySearch(arr, beg, mid-1, target) == -1)
        return mid;

      return binarySearch(arr, beg, mid-1, target);

    } else if (arr[mid] > target){

      return binarySearch(arr, beg, mid-1, target);

    } else {

      return binarySearch(arr, mid+1, end, target);

    }

  }

}
