package _4ArrayListEquals;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> moreNumbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        moreNumbers.add(1);
        moreNumbers.add(2);
        moreNumbers.add(3);
        moreNumbers.add(4);
        moreNumbers.add(5);
        moreNumbers.add(6);
        moreNumbers.add(7);
        moreNumbers.add(8);
        moreNumbers.add(9);
        moreNumbers.add(19);

        System.out.println(equals(numbers, moreNumbers));
    }

    public static boolean equals(ArrayList<Integer> arr1, ArrayList<Integer> arr2)
    {
        boolean runningBool = true;

            for(int i = 0; i < arr1.size(); i++)
            {
                if(arr1.get(i) == arr2.get(i))
                {
                    runningBool = true;
                }
                else
                {
                     runningBool = false;
                }
            }

        return runningBool;
    }
}
