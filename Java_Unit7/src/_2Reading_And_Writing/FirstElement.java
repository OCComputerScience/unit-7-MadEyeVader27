package _2Reading_And_Writing;

import java.util.ArrayList;

public class FirstElement
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

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

        for(int i = 0; i < numbers.size(); i += 2)
        {
            System.out.println(numbers.get(i));
        }
    }

}