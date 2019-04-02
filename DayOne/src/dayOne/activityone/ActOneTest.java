package dayOne.activityone;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ActOneTest {

    @Test
    public void middleValue() {
        ArrayList<Integer> arrList = new ArrayList<>(9);
        arrList.add(15);
        arrList.add(20);
        arrList.add(25);
        arrList.add(22);
        arrList.add(26);
        arrList.add(34);
        arrList.add(19);
        arrList.add(50);
        arrList.add(38);

        ActOne firstTry = new ActOne();
        int num = firstTry.middleValue(arrList);
        assertTrue(Arrays.asList(26).contains(arrList.get(num)));
    }
}