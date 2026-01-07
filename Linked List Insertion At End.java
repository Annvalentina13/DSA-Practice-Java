/*
You are given the head of a Singly Linked List and a value x, insert that value x at the end of the LinkedList and return the head of the modified Linked List.

Examples :

Input: x = 6,
   
Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6
Explanation: We can see that 6 is inserted at the end of the linkedlist.
   
Input: x = 1,
   
Output: 4 -> 5 -> 1
Explanation: We can see that 1 is inserted at the end of the linked list.
      
Constraints:
0 ≤ number of nodes ≤ 105
0 ≤ node->data , x ≤ 103

*/

/**
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public static Node insertAtEnd(Node head, int x) {
        // Create new node
        Node newNode = new Node(x);

        // If list is empty
        if (head == null) {
            return newNode;
        }

        // Traverse to last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Insert at end
        temp.next = newNode;

        return head;
    }
}
