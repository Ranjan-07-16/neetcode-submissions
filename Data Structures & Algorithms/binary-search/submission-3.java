class Solution {
    public int search(int[] nums, int target) {
        int ll=0;
        int ul=nums.length-1;
        int flag=0;
        do
        {
            int mid=ll+(ul-ll)/2;
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
        }while(ll<=ul);
        if(flag==0);
        return -1;
    }
}