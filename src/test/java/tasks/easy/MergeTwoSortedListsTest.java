package tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoSortedListsTest {

    @Test
    void case1() {
        var list1 = new MergeTwoSortedLists.ListNode(
                1, new MergeTwoSortedLists.ListNode(
                2, new MergeTwoSortedLists.ListNode(
                4)));

        var list2 = new MergeTwoSortedLists.ListNode(
                1, new MergeTwoSortedLists.ListNode(
                3, new MergeTwoSortedLists.ListNode(
                4)));

        var expected = new MergeTwoSortedLists.ListNode(
                1, new MergeTwoSortedLists.ListNode(
                1, new MergeTwoSortedLists.ListNode(
                2, new MergeTwoSortedLists.ListNode(
                3, new MergeTwoSortedLists.ListNode(
                4, new MergeTwoSortedLists.ListNode(
                4))))));

        var actual = new MergeTwoSortedLists().mergeTwoLists(list1, list2);

        assertEquals(expected, actual);
    }

}
