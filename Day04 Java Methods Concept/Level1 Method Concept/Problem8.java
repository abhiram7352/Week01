import java.util.Scanner;

public class Problem8 {

    public static int[] findSmallestAndLargest(int n1, int n2, int n3){
	    int arr[]=new int[2];
		
	    if(n1<n2 && n1<n3){
		   arr[0]=n1;
		}else if(n2<n1 && n2<n3){
		   arr[0]=n2;
		}else{
		   arr[0]=n3;
		}
		if(n1>n2 && n1>n3){
		   arr[1]=n1;
		}else if(n2>n1 && n2>n3){
		   arr[1]=n2;
		}else{
		   arr[1]=n3;
		}
		return arr;
	
	}
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Take a user input (natural number)
        System.out.println("Enter a three number: ");
		System.out.print("First number: ");
        int n1 = scanner.nextInt();  // First number
		
		System.out.print("Second number: ");
        int n2 = scanner.nextInt();  // Second number
		
		System.out.print("Third number: ");
        int n3 = scanner.nextInt();  // Third number
		
		int arr[]=findSmallestAndLargest(n1,n2,n3);

        int smallestNum=arr[0];  //Finding smallest number
		int greatestNum=arr[1];  // Finding greatest element
		
		System.out.println("Smallest number is : "+smallestNum);
		System.out.println("Greatest number is : "+greatestNum);
    }
}
