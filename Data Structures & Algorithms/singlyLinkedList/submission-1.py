class LinkedList:
    
    def __init__(self):
        # self.head = None
        # self.next None
        self.ll = []
    
    def get(self, index: int) -> int:
        # temp = self.head
        # if not temp:
        #     return -1
        # i = 0
        # while temp:
        #     if i == index:
        #         return 
        if (not self.ll) or (index >= len(self.ll)):
            return -1
        return self.ll[index]
        

    def insertHead(self, val: int) -> None:
        # if not self.head:
        #     self.head = val
        # temp = self.head
        # val.next = temp
        # self.head = val
        if not self.ll:
            self.ll.append(val)
            return
        newll = []
        newll.append(val)
        for v in self.ll:
            newll.append(v)
        self.ll = newll

    def insertTail(self, val: int) -> None:
        # if not self.head:
        #     self.head = val
        if not self.ll:
            self.ll.append(val)
            return
        self.ll.append(val)
        
        

    def remove(self, index: int) -> bool:
        if (not self.ll) or (index >= len(self.ll)):
            return False
        newll = []
        for i in range(len(self.ll)):
            if i != index:
                newll.append(self.ll[i])
        self.ll = newll
        return True

        

    def getValues(self) -> List[int]:
        return self.ll
