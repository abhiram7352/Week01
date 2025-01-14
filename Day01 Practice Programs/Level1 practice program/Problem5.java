public class Problem5{
    public static void main(String args[]){
	   // This is the number of pen we have
	   int totalPen=14;
	   // Total number of student
	   int totalStudent=3;
	   // Equally Distributed pen
	   int equalDistributedPen=totalPen/totalStudent;
	   // Remaining pen after distribution
	   int remainingPen=totalPen%totalStudent;
	   System.out.println("The Pen Per Student is "+equalDistributedPen+" and the remaining pen not distributed is "+remainingPen
);
	}
 }