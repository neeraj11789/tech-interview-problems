package v1.leetcode.arrays102;

import java.util.List;
import org.assertj.core.util.Lists;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author neerajgupta
 * @since 04/04/21
 */
@Setter
@Getter
@NoArgsConstructor
public class MaxConsecutiveOnes {
    private List<Integer> list = Lists.newArrayList(1, 0, 1, 1, 1, 0, 1, 1);

    public MaxConsecutiveOnes(List<Integer> list) {
        this.list = list;
    }

    public int run(){
        int counter = 0;
        int maxCounter = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == 0) counter=0;
            else counter++;
            if(counter > maxCounter) maxCounter = counter;
        }
        return Math.max(counter, maxCounter);
    }
}
