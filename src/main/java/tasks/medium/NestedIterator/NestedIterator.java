package tasks.medium.NestedIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */

public class NestedIterator implements Iterator<Integer> {

    private final List<Integer> flatList = new ArrayList<>();
    private final Iterator<Integer> flatListIterator;

    public NestedIterator(List<NestedInteger> nestedList) {
        flatMap(nestedList);
        this.flatListIterator = this.flatList.iterator();
    }

    private void flatMap(List<NestedInteger> nestedList) {
        nestedList.forEach(element -> {
            if (element.isInteger()) {
                this.flatList.add(element.getInteger());
            } else {
                flatMap(element.getList());
            }
        });
    }

    @Override
    public Integer next() {
        return this.flatListIterator.next();
    }

    @Override
    public boolean hasNext() {
        return this.flatListIterator.hasNext();
    }

}
