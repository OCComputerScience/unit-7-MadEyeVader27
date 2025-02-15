package _6SelectionSort;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] array1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array2 = {5, 6, 4, 8, 9, 7, 3, 1, 2};

        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array: ");
        System.out.println(Arrays.toString(array2));
        System.out.println();

        // sort first array


        // sort second array

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array sorted: ");
        System.out.println(Arrays.toString(array2));
    }

    public static void selectionSort(int[] array)
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            int currMinIndx = i;
            
            for(int j = i+1; i < array.length; j++)
            {
                  if(array[j] < array[currMinIndx])
                  {
                      currMinIndx = j;
                  }
            }
            Swap(array[currMinIndx], array[i]);
        }

    }

    public static void Swap()
    {

    }

}
