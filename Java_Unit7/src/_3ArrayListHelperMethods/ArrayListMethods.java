package _3ArrayListHelperMethods;

import java.util.ArrayList;

public class ArrayListMethods
{
    public static void print(ArrayList<Double> arr)
    {
        for(double numbers : arr)
        {
            System.out.println(numbers);
        }
    }

    public static void condense(ArrayList<Double> arr)
    {

    }

    public static void duplicate(ArrayList<Double> arr)
    {
        for(int i = 0; i < arr.size(); i++)
        {
            arr.add(arr.get(i));
        }
    }
}
