package dayOne.activityone;

import java.util.ArrayList;

public class ActOne implements ActOneInterface {

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>(5);

        // add() method to add elements in the list
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
        System.out.println("Middle index value of ArrayList is: "  + num);
        System.out.println("Value for index value "  + num + " is: " + arrList.get(num) );
    }

    @Override
    public int middleValue(ArrayList list) {

        // throw excpetion if list is empty
        // else compute arraylist
        if (list.isEmpty()) {
            try {
                throw  new ValueException("No values in array list");
            } catch (ValueException e) {
                e.printStackTrace();
            }
        }

        // Take length of arraylist and divide by 2
        // Chose left side as middle value
        return list.size() / 2;
    }

}

