package leetcode.arrays102;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.assertj.core.util.Lists;
import lombok.Getter;
import lombok.Setter;

/**
 * @author neerajgupta
 * @since 04/04/21
 */
@Setter
@Getter
public class NumbersWithEvenNoOfDigits {
    private List<Integer> list = Lists.newArrayList(12,345,2,6,7896);

    public Integer run() {
        return list.stream().filter(number -> {
            int counter = 0;
            while (number > 0){
                number = number / 10;
                counter++;
            }
            return counter % 2 == 0 ;
        }).collect(Collectors.collectingAndThen(Collectors.counting(), Long::intValue));
    }
}
