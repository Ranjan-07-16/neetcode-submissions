class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        ar=[]
        for item in nums:
            if item!=val:
                ar.append(item)
        nums=ar        