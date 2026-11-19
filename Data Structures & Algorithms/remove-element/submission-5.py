class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        ar=[]
        for item in nums:
            if not item==val:
                ar.append(item)
        k=len(ar)
        nums=ar
        return k