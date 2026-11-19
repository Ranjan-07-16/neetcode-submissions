class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ar[]=new int[nums.length];
        int index=0;
        for(int i=0; i<nums.length; i++)
        {
            int temp=1;
            for(int j=0; j<nums.length; j++)
            {
                if(j!=i)
                {
                   temp=temp*nums[j];
                }
            }
            ar[index]=temp;
            index++;
        }
        return ar;
    }
}