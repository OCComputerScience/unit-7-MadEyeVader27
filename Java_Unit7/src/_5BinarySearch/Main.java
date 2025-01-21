package _5BinarySearch;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println(binarySearch(numbers, 9));

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
    }
    public static int binarySearch(ArrayList<Integer> array, int numToFind)
    {
        int left = 0;
        int right = array.size() - 1;

        System.out.println("Test 4");

        while (left <= right)
        {
            System.out.println("hi");

            //current middle index
            int mid = left + (right - left) / 2;

            //current middle value
            int current = array.get(mid);

            //Evaluate
            if(current == numToFind)
            {
                System.out.println("test 1");
                return mid;

            }
            else if (current < numToFind)
            {
                left = mid + 1;
                System.out.println("Test 2");
            }
            else
            {
                right = mid-1;
                System.out.println("Test 3");
            }
        }
        return -1;
    }
}

