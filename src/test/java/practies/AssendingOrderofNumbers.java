package practies;

public class AssendingOrderofNumbers {
	public static void main(String[] args) {
		int[] nums= {1,4,2,6,8,6,9,3};
		for(int i=0; i<nums.length; i++)
		{
		for(int j=0; j<nums.length-i-1; j++)
			{
			if(nums[j]>nums[j+1])
			{
			int temp=nums[j];
			nums[j]=nums[j+1];
			nums[j+1]=temp;
			}
		}
			
	}
		for(int single:nums)
		{
		System.out.print(nums[nums.length-2]);
		}

}
}
