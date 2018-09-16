import java.util.Scanner;
public class sort_selection{

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int length = input.nextInt();
    int arr[] = new int[length];

    for(int i = 0; i < arr.length; i++)
      arr[i] = input.nextInt();

    int[] sortedArr = selectionsort(arr);

    for(int i = 0; i < sortedArr.length; i++)
      System.out.print(sortedArr[i] + " ");

    System.out.println();

  }

  public static int[] selectionsort(int[] arr){
    int index = arr.length;
    int placeholder = Integer.MAX_VALUE;

    for(int j = 0; j < arr.length; j++){

      for(int k = arr.length - 1; k >= j; k--){

        if(arr[k] < placeholder){

          index = k;
          placeholder = arr[k];

        }

      }

      if(index != arr.length){
        placeholder = arr[index];
        arr[index] = arr[j];
        arr[j] = placeholder;
      }

      placeholder = Integer.MAX_VALUE;
      index = arr.length;

    }
    return arr;
  }
}
