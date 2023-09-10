package tasks.medium.NestedIterator;

import java.util.List;

import static java.util.Collections.emptyList;

public class NestedIntegerImpl implements NestedInteger {

    private final Integer singleInt;
    private final List<NestedInteger> nestedList;

    public NestedIntegerImpl(int singleInt) {
        this.singleInt = singleInt;
        this.nestedList = emptyList();
    }

    public NestedIntegerImpl(List<NestedInteger> nestedList) {
        this.singleInt = null;
        this.nestedList = nestedList;
    }

    @Override
    public boolean isInteger() {
        return this.singleInt != null;
    }

    @Override
    public Integer getInteger() {
        return singleInt;
    }

    @Override
    public List<NestedInteger> getList() {
        return nestedList;
    }

}
