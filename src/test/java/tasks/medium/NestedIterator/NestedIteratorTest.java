package tasks.medium.NestedIterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NestedIteratorTest {

    // [[1,1],2,[1,1]]
    @Test
    void case1() {
        List<NestedInteger> nestedList = List.of(
                new NestedIntegerImpl(List.of(new NestedIntegerImpl(1), new NestedIntegerImpl(1))),
                new NestedIntegerImpl(2),
                new NestedIntegerImpl(List.of(new NestedIntegerImpl(1), new NestedIntegerImpl(1)))
        );

        var nestedIterator = new NestedIterator(nestedList);

        var result = new ArrayList<>();
        while (nestedIterator.hasNext()) {
            result.add(nestedIterator.next());
        }

        assertThat(result).isEqualTo(List.of(1, 1, 2, 1, 1));
    }

    // [1,[4,[6]]]
    @Test
    void case2() {
        List<NestedInteger> nestedList = List.of(
                new NestedIntegerImpl(1),
                new NestedIntegerImpl(List.of(new NestedIntegerImpl(4), new NestedIntegerImpl(List.of(new NestedIntegerImpl(6)))))
        );

        var nestedIterator = new NestedIterator(nestedList);

        var result = new ArrayList<>();
        while (nestedIterator.hasNext()) {
            result.add(nestedIterator.next());
        }

        assertThat(result).isEqualTo(List.of(1, 4, 6));
    }

}
