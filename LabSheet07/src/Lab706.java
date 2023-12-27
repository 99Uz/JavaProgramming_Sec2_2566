import javax.swing.*;
public class Lab706 {

	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		int indexNumber = Integer.parseInt(JOptionPane.showInputDialog("input index of array:"));
		while(checkIndex(nums, indexNumber)) {
			indexNumber = Integer.parseInt(JOptionPane.showInputDialog("input index of array,again:"));
		}
		int currentValue = currentData(nums, indexNumber); //method return value
		/*if(previousValue == 0) {
		JOptionPane.showMessageDialog(null, "Current data,nums[" + indexNumber + "] is " + currentValue +
											"\nNo previous data" +
											"\nNext data,nums[" + (indexNumber+1) + "] is " + nextValue);
		}
		else if(nextValue == 0) {
		JOptionPane.showMessageDialog(null, "Current data,nums[" + indexNumber + "] is " + currentValue +
											"\nPrevious data,nums[" + (indexNumber-1) + "] is " + previousValue +
											"\nNo next data");
		}
		else {
		JOptionPane.showMessageDialog(null, "Current data,nums[" + indexNumber + "] is " + currentValue +
											"\nPrevious data,nums[" + (indexNumber-1) + "] is " + previousValue +
											"\nNext data,nums[" + (indexNumber+1) + "] is " + nextValue);
		}*/
		JOptionPane.showMessageDialog(null, "Current data,nums["+indexNumber+"] is " + currentValue +
						((indexNumber-1<0)?"\nNo previous data":"\nPrevious data, nums["+(indexNumber-1)+"] is " + prevData(nums,indexNumber)) +
						((indexNumber+1>nums.length-1)?"\nNo next data":"\nNext data, nums["+(indexNumber+1)+"] is " + nextData(nums,indexNumber)));
	}//end of main()
	
	public static boolean checkIndex(int[] nums,int index) {
		/*if((index >= nums.length) || (index < 0)) {
			return true;
		}
		else {
			return false;
		}*/
		
		return ((index >= nums.length) || (index < 0))? true : false;
	}//end of checkIndex()
	
	public static int currentData(int[] nums, int index) {
		return nums[index];
		
	}//end of currentData()
	
	public static int prevData(int[] nums, int index) {
		return nums[index-1];
	}//end of prevData()
	
	public static int nextData(int[] nums, int index) {
		return nums[index+1];
	}//end of nextData()
}
