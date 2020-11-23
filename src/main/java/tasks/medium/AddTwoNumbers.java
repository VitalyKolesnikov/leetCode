package tasks.medium;

import java.util.Objects;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addWithCarry(l1, l2, false);
    }

    public ListNode addWithCarry(ListNode l1, ListNode l2, boolean carry) {
        if (l1 == null && l2 == null) return (!carry) ? null : new ListNode(1);
        int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
        return new ListNode((carry ? ++sum : sum) % 10, addWithCarry(l1 == null ? null : l1.next, l2 == null ? null : l2.next, sum > 9));
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public static ListNode fromString(String str) {
            if (str.length() == 0) return null;
            return new ListNode(Integer.parseInt(str.substring(0, 1)), fromString(str.substring(1)));
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val &&
                    Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }

}