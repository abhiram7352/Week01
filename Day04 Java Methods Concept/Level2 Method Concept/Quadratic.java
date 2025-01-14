import java.util.*;

class Quadratic {
   
   // Method to find the delta value (discriminant) for a quadratic equation
   public double findDelta(double a, double b, double c) {
      return Math.pow(b, 2) - 4 * a * c; // Formula for discriminant (Δ)
   }
   
   // Method to find the roots of the quadratic equation
   public double[] findRoots(double a, double b, double c) {
      double delta = findDelta(a, b, c); // Calculate discriminant(Delta)
      double[] roots = new double[0]; // Initialize an empty array for roots

      if (delta > 0) {
         // Two real roots
         roots = new double[2];
         roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
         roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
      } else if (delta == 0) {
		  
         // One real root
         roots = new double[1];
         roots[0] = -b / (2 * a);
      }
      // If delta < 0, no real roots exists
      return roots;
   }
   
   public static void main(String[] args) {
	   // Creating scanner object to read user input
	  Scanner sc=new Scanner(System.in);
	  
      // Create an instance of the Quadratic class
      Quadratic qc = new Quadratic();
      
      System.out.println("Enter the coefficient of quadratic equation is: ");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  int c=sc.nextInt();
      
      // Get the roots of the equation
      double[] roots = qc.findRoots(a, b, c);
      
      // Display the roots of the quadratic equation
      if (roots.length == 0) {
         System.out.println("No real roots exist for the equation.");
      } else if (roots.length == 1) {
         System.out.println("The root of the equation is: " + roots[0]);
      } else {
         System.out.println("The roots of the equation are: " + Arrays.toString(roots));
      }
   }
}
