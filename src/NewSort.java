import java.util.Scanner;

public class NewSort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 int n;
		 n=s.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=s.nextInt(); 
		 }
	     for (int i = 0; i < n-1; i++) {
	            for (int j = 0; j < n-i-1; j++) {
	                if (arr[j] > arr[j+1])
	                {
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	     }
	            }
	     System.out.println("The Sorted order is");
	     for(int i=0;i<n;i++) {
			 System.out.println(arr[i]);
		 }
	     s.close();

	}

}