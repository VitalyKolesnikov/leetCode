package tasks.medium.NestedIterator;

import java.util.List;

public interface NestedInteger {

    /**
     * @return true if this NestedInteger holds a single integer, rather than a nested list.
     */
    boolean isInteger();

    /**
     * @return the single integer that this NestedInteger holds, if it holds a single integer.
     * Null if this NestedInteger holds a nested list
     */
    Integer getInteger();

    /**
     * @return the nested list that this NestedInteger holds, if it holds a nested list.
     * Empty list if this NestedInteger holds a single integer
     */
    List<NestedInteger> getList();

}
