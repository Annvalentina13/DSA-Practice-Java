/*
Given a two integer linkedLists ll1 and ll2, you need to find if both the LinkedLists contain the same elements in the same order or not. 

Examples:

Input: ll1[] = [1, 2, 3, 4], ll2[] = [4, 3, 2, 1]
Output: false
Explanation: Both arrays are not same as they don't contain elements in the same order. So we print false.
Input: ll1[] = [5, 6, 7, 8, 9], ll2[] = [5, 6, 7, 8, 9]
Output: true
Explanation: Both arrays are same as they contain the same elements and in same order. So we print true.
Constraints:
1 <=  ll1.size(), ll2.size()  <= 106
1 <= ll1[i], ll2[i] <= 106

*/

class Solution {
    public static boolean areEqual(LinkedList<Integer> ll1, LinkedList<Integer> ll2) {
        return ll1.equals(ll2);
    }
}
