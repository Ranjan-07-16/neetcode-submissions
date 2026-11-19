class Solution {
    /**
     * @param {number[]} nums
     * @param {number} val
     * @return {number}
     */
    removeElement(nums, val) {
        let ar=[];
        let index=0;
        for(let i=0; i<nums.length; i++)
        {
            if(nums[i]!=val)
            {
                ar[index]=nums[i];
                index++;
            }
        }
        return ar;
    }
}