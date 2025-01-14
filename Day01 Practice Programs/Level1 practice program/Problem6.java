public class Problem6{
    public static void main(String args[]){
	   // Here is the fees of courses
	   int courseFee=125000;
	   // Here is the discount percentage
	   int discountPercent=10;
	   // We are calculating the discount on courses
	   double discount=(courseFee*discountPercent)/(double)(100);
	   // This is the total course fee after discount
	   double feeAfterDiscount=courseFee-discount;
	   System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+feeAfterDiscount);
	}
 }