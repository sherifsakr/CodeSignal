package InterviewPractice.LinkedLists;

public class RemoveKFromList {

    ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
        if (l == null) return null;

        if ((l.value == k) && (l.next == null)) {
            return null;
        }

        ListNode<Integer> temp = l;
        ListNode<Integer> temp2 = l;

        while (temp != null && temp.value == k) {
            l = temp.next;
            temp = l;
        }


        while (temp != null) {
            if (temp.value == k) {
                temp2.next = temp.next;
                temp = temp.next;
            } else {
                temp2 = temp;
                temp = temp.next;
            }
        }


        return l;
    }

}


class ListNode<T> {
    ListNode(T x) {
        value = x;
    }

    T value;
    ListNode<T> next;
}
