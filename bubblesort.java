import java.util.Scanner;
public class bubblesort {
	public static void main(String[]args){
		Scanner keybd = new Scanner(System.in);
		System.out.println("enter range 1: ");
		int a = keybd.nextInt();
		System.out.println("enter range 2: ");
		int b = keybd.nextInt();
		System.out.println("enter how many numbers in the list: ");
		int n = keybd.nextInt();
		double[] range = new double[n];
		
		// double[] range = {3,60,35,2,45,320,5};
		n = range.length;
		double temp = 0;
		
		for(int i = 0; i<n; i++){
			range[i]= a+Math.random()*(b-a);
		}
		
		System.out.println("\nList before Bubble Sort:\n");
		for(int k = 0; k<n; k++)
			System.out.println(range[k]);
		

		for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(range[j-1] > range[j]){  
                    temp = range[j-1];  
                    range[j-1] = range[j];  
                    range[j] = temp;  
            	 }
            	/*   
            	System.out.println("\nList after iteration:\n");
				for(int l = 0; l<n; l++)
					System.out.println(range[l]);  
				*/         
            }  
        }
      
        System.out.println("\nList after Bubble Sort:\n");
		for(int k = 0; k<n; k++){
			System.out.println(range[k]);
		}

	}
}