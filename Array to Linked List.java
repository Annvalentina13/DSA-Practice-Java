/*
You are given an array arr[] of integers. You have to construct a singly linked list from the elements of the arr[] and return the head of the linked list.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: 1 -> 2 -> 3 -> 4 -> 5 
Explanation: Linked list for the given array will be,
      
Input: arr[] = [10, 11, 12, 13, 14]
Output: 10 -> 11 -> 12 -> 13 -> 14
Explanation: Linked list for the given array will be,
     
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105

*/

/*
// Representation of a node
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
         // Step 1: Create head node using first array element
        Node head = new Node(arr[0]);

        // Step 2: Temporary pointer to build the list
        Node current = head;

        // Step 3: Loop through remaining elements
        for (int i = 1; i < arr.length; i++) {

            // Create new node for current array element
            Node newNode = new Node(arr[i]);

            // Link previous node to new node
            current.next = newNode;

            // Move pointer to the new node
            current = newNode;
        }

        // Step 4: Return head of linked list
        return head;
    }
}
