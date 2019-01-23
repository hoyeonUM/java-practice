import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void basicTest() {
        Solution1 solution = new Solution1();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String result = solution.run(participant, completion);
        assertEquals("leo", result);
    }

    @Test
    public void duplicateTest() {
        Solution1 solution = new Solution1();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String result = solution.run(participant, completion);
        assertEquals("mislav", result);
    }

    @Test
    public void allDuplicateTest() {
        Solution1 solution = new Solution1();
        String[] participant = {"mislav", "mislav", "mislav", "mislav"};
        String[] completion = {"mislav", "mislav", "mislav"};
        String result = solution.run(participant, completion);
        assertEquals("mislav", result);
    }

}
