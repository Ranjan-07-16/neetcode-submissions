class Solution {
    public boolean canJump(int[] nums) {
        int flag=0;
        int pointer=0;
        while(pointer<=nums.length-1)
        {
            if(pointer==nums.length-1)
            {
                flag=1;
                return true;
            }
            if(nums[pointer]==0)
            {
                return false;
            }
            else
            {
                pointer+=nums[pointer];
            }
        }
        if(flag==0)
        return false;
        else
        return true;
    }
}