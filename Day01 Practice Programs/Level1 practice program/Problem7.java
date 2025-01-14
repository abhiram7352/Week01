public class Problem7{
    public static void main(String args[]){
	   // This is the km radius of earth
	   int kmRadius=6378;
	   
	   //This is mile distance radius of earth and I am calculating from earth km radius
	   double mileRadius=1.6*kmRadius;
	   
	   // Earth's volume in cubic km
	   double earthVolumeInKm = (4/3.0)*3.14*kmRadius*kmRadius*kmRadius;
	   
	   // Earth's volume in cubic mile
	   double earthVolumeInMile = (4/3.0)*3.14*mileRadius*mileRadius*mileRadius;
	   System.out.println("The volume of earth in cubic kilometers is "+earthVolumeInKm+" and cubic miles is "+earthVolumeInMile );
	}
 }