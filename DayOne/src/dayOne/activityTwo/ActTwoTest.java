package dayOne.activityTwo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActTwoTest {

    final ActTwo tester = new ActTwo();

    @Test
    public void Occurances() {

        ArrayList<String> sportBalls = new ArrayList<>(9);

        //  add() method to add elements in the list
        sportBalls.add("Ball");
        sportBalls.add("Ball");
        sportBalls.add("Bat");
        sportBalls.add("FootBall");
        sportBalls.add("BaseBall");
        sportBalls.add("Ball");
        sportBalls.add("Hat");
        sportBalls.add("Ball");
        sportBalls.add("Glove");



        assertEquals(9, sportBalls.size());
        assertEquals(4, tester.occurances(sportBalls, "Ball"));
    }
}