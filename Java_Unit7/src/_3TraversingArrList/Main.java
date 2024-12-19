package _3TraversingArrList;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //for loop to add values
        for(int i = 0; i < 50; i++)
        {
            numbers.add(i);
            i++;
        }


        //for loop to iterate through and remove elements

        for(int i = 0; i < numbers.size(); i++)
        {
            if(numbers.get(i) % 2 == 0)
            {
                numbers.remove(i);
                i++;
            }
        }

        System.out.println(numbers);
    }

}
