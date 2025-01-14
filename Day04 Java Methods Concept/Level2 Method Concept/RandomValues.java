import java.util.*;

class RandomValues {

   // Method where we finding random value nd store in array
   public int[] generateRandom4DigitNumbers(int size) {
      int[] randomNumbers = new int[size];
      for (int i = 0; i < size; i++) {
         randomNumbers[i] = (int) (Math.random() * 9000) + 1000; // Generate 4-digit random number between 1000 and 9999
      }
      return randomNumbers;
   }

   // Method to find the average, min, and max values of an array
   public double[] calculateAverageMinMax(int[] numbers) {
      double sum = 0;
      int min = numbers[0];
      int max = numbers[0];
      
      // Loop through the array to calculate sum, min, and max
      for (int num : numbers) {
         sum += num;
         min = Math.min(min, num);  // Find the minimum value
         max = Math.max(max, num);  // Find the maximum value
      }
      
      double average = sum / numbers.length; // Calculating the average of all numbers
      return new double[] {average, min, max}; // Return an array containing average, min, and max
   }

   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
      // Create an instance of RandomValues class 
      RandomValues randomValues = new RandomValues();
	   System.out.println("Enter the number of random: ");
      int size = sc.nextInt(); // Input number of random value
      
      // Generate the array of random 4-digit numbers
      int[] randomNumbers = randomValues.generateRandom4DigitNumbers(size);
      System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));
      
      // Get the average, min, and max values
      double[] results = randomValues.calculateAverageMinMax(randomNumbers);
      
      // Display the results
      System.out.println("Average Value: " + results[0]);
      System.out.println("Minimum Value: " + results[1]);
      System.out.println("Maximum Value: " + results[2]);
   }
}
