class Solution {
    public int majorityElement(int[] nums) {
        int freq[]=new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            int temp=nums[i];
            int c=0;
            for(int j=0; j<nums.length; j++)
            {
                if(nums[j]==temp)
                {
                    c++;
                }
            }
            freq[i]=c;
        }
        for(int i=0; i<freq.length; i++)
        {
            for(int j=0; j<freq.length-i-1; j++)
            {
                if(freq[j]>freq[j+1])
                {
                    int k=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=k;
                }
            }
        }
        int l=nums.length;
        return nums[l-1];
    }
}