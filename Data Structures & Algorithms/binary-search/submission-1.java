class Solution {
    public int search(int[] nums, int target) {
        int l=nums.length;
        int flag=0;
        int ll=0;
        int ul=l;
        int rval=0;
        do
        {
            int mid=(ll+ul)/2;
            if(nums[mid]==target)
            {
                flag=1;
                return mid;
            }
            else if(nums[mid]<target)
            {
                ll=mid+1;
            }
            else if(nums[mid]>target)
            {
                ul=mid-1;
            }
        }while(ll<ul && ll>=0 && ul<=l-1);
        if(flag==0)
        {
            rval=-1;
        }
        return rval;
    }
}