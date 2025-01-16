import java.util.Scanner;
public class MostFrequentCharacter {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // Example input
		System.out.print("Enter any inputstr: ");
        String inputstr = sc.nextLine();
		
		System.out.println("Most frequent character of "+inputstr+" is "+mostFrequentCharacter(inputstr));
	}
		
	static char mostFrequentCharacter(String str){
		String string = str.toLowerCase();
		int[] freq = new int[26];
		char []charArr=new char[26];
		int index=0;
		for(char i='a'; i<='z'; i++){
			int count=0;
			for(int j=0;j<string.length();j++){
				if(string.charAt(j)==(i)){
					count++;
				}
			}
			charArr[index]=i;
			freq[index++]=count;
		}
		
		int maxFre=Integer.MIN_VALUE;
		char maxFreChar=' ';
		for(int j=0;j<freq.length;j++){
			if(freq[j]>maxFre){
				maxFre=freq[j];
				maxFreChar=charArr[j];
			}
		}
		return maxFreChar;
		
	}
}	
		