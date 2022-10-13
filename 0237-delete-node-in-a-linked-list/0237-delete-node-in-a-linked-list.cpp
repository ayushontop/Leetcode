/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    void deleteNode(ListNode* node) {
        ListNode *temp=node;
        ListNode *next=node->next;
        while(next!=NULL)
        {
            temp->val=next->val;
            next=next->next;
            if(next==NULL)
                temp->next=NULL;
            temp=temp->next;
            
        }
        
    }
};