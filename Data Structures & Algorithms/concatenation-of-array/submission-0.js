class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    getConcatenation(nums) {
        let ans=[];
        let l=nums.length;
        let index=0;
        let lmax=l*2;
        for(let i=0; i<lmax; i++)
        {
            if(index==l)
            {
                index=0;
            }
            let temp=nums[index];
            ans[i]=temp;
            index++;
        }
        return ans;
    }
}