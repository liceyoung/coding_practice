class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
        head = prev = ListNode()
        # initialised head with a blank ListNode and remain head at the same
        get = lambda x,y: x if x.val < y.val else y
        while list1 and list2:
            prev.next = prev = (mini := get(list1,list2))
            if mini == list1: list1 = list1.next
            else: list2 = list2.next
        prev.next = list1 or list2
        return head.next