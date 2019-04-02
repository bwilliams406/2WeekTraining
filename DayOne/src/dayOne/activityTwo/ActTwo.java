package dayOne.activityTwo;

import dayOne.activityone.ValueException;

import java.util.ArrayList;
import java.util.Collections;


public class ActTwo implements ActTwoInterface {

    public static void main(String[] args) {
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



        ActTwo firstTry = new ActTwo();
        firstTry.occurances(sportBalls, "Ball");



    }

    @Override
    public int occurances(ArrayList list, String item) {

        // if value is empty, throw exception
        int counter = 0;
        if (list.isEmpty()) {
            try {
                throw  new ValueException("Missing value or no Occurances");
            } catch (ValueException e) {
                e.printStackTrace();
            }

            //loop through the arraylist and find each occurance
        } else {
            for (int i = 0; i < list.size(); i++){
                if (list.get(i).equals(item)){
                    counter++;
                }
            }
            System.out.println("Freq of occurance value is: " + Collections.frequency(list, "Ball"));
        }
        return counter;

    }
}
