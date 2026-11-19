class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ar[]=new int[2];
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                if(i!=j)
                {
                    int sum=nums[i]+nums[j];
                    if(sum==target)
                    {
                        ar[0]=i; ar[1]=j;
                        return ar;
                    }
                }
            }
        }
        int a[]=new int[2]; a[0]=0; a[1]=0;
        return a;
    }
}