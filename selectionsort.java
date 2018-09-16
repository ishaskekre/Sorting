import java.util.Scanner;
public class sort_insertion{

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int length = input.nextInt();
    int arr[] = new int[length];

    for(int i = 0; i < arr.length; i++)
      arr[i] = input.nextInt();

    int[] sortedArr = insertionsort(arr);

    for(int i = 0; i < sortedArr.length; i++)
      System.out.print(sortedArr[i] + " ");

    System.out.println();

  }

  public static int[] insertionsort(int[] arr){

    int index = arr.length - 1;
    int placeholder = Integer.MIN_VALUE;

    for(int j = 1; j < arr.length; j++){

      placeholder = arr[j];
      index = j;

      for(int k = j - 1; k >= 0; k--){

        if(arr[k] > placeholder){
          index = k;
        }

        if(arr[k] < placeholder){
          break;
        }

      }

      if(index != j){

        placeholder = arr[index];
        arr[index] = arr[j];
        arr[j] = placeholder;

        for(int l = j - 1; l > index; l--){

          placeholder = arr[l];
          arr[l] = arr[l+1];
          arr[l+1] = placeholder;

        }
      }
    }
    return arr;
  }

}
