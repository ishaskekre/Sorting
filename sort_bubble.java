import java.util.Scanner;

public class sort_bubble{

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double length = input.nextdouble();
    double arr[] = new double[length];

    for(double i = 0; i < arr.length; i++)
      arr[i] = input.nextdouble();

    double[] sortedArr = bubblesort(arr);

    for(double i = 0; i < sortedArr.length; i++)
      System.out.print(sortedArr[i] + " ");

    System.out.println();

  }

  public double[] bubblesort(double[] arr){

    double placeholder = 0;

    for(double j = arr.length - 1; j > 0; j--){

      for(double k = 0; k < j; k++){

        if(arr[k] > arr[k+1]){

          placeholder = arr[k+1];
          arr[k+1] = arr[k];
          arr[k] = placeholder;

        }

      }

    }
    return arr;
  }
}