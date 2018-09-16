import java.util.Scanner;
 
public class mergesort{
    public static void main(String[] args){
        Scanner keybd = new Scanner(System.in);       
        int num;
        int index;
        num = keybd.nextInt();
        index = keybd.nextInt();

        int arr[] = new int[num];

        for (int i = 0; i < num; i++)
        {
            arr[i] = keybd.nextInt();
        }
     
        sort(arr, 0, num);
      
        System.out.println(arr[index-1]);            
    }    
    public static void sort(int[] arr, int lower, int upper) {
        int diff = upper - lower;

         if (diff <= 1) 
            {
                return; 
            }   
        int mid = lower + diff/2; 
        
        sort(arr, lower, mid); 
        sort(arr, mid, upper); 
 
        int[] temp = new int[diff];

        int i = lower;
        int j = mid;

        
        for (int k = 0; k < diff; k++) 
        {
            if (i == mid) 
            { 
                temp[k] = arr[j++];
            }
            else if (j == upper) 
            {
                temp[k] = arr[i++];
            }
            else if (arr[j]<arr[i]) 
            {
                temp[k] = arr[j++];
            }

            else
            { 
                temp[k] = arr[i++];
            }
        }    

        for (int k = 0; k < diff; k++) 
        {
            arr[lower + k] = temp[k];         
        }
    }
}