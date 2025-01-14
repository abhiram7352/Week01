import java.util.*;
public class Problem16{
    public static void main(String args[]){
	   // Creating a Scanner object to read user input
	   Scanner sc =new Scanner(System.in);
	   
	   System.out.print("Enter the number of people I have ");
	   // Reading number of people
	   int numberOfpeople=sc.nextInt();
	   
	   // Here  it is the possible number of handshake can be possible
	   int numberOfHandshake=(numberOfpeople*(numberOfpeople-1))/2;
	   
	   
	   System.out.println("Number of possible handshakes is "+numberOfHandshake);
	}
 }