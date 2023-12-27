
public class Lab_Example701 {

	public static void main(String[] args) {
		int[] nums = {12,50,93,45,75,52,80};
		for(int i = 0; i < nums.length; i++) {
			System.out.println("nums["+i+"]="+nums[i]);
		}
		System.out.println("\nusing foreach to display value from array nums\n");
		int j = 0;
		for(int _nums:nums) {
			System.out.println("nums["+j+"]="+_nums);
			j+=1;
		}
		printArray(nums); //method no return
	}//end of main()
	
	public static void printArray(int[] number) {
		System.out.println("\nusing method to display values from array number\n");
		for(int i = 0; i < number.length; i++) {
			System.out.println("nums["+i+"]="+number[i]);
		}
	}//end of printArray()
}
