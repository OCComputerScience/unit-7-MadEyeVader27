public class sorter
{
    public static void main(String[] args)
    {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        selectionSort(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void selectionSort(int[] arr)
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            int lowestIdx = i;

            for(int j = i + 1; j < arr.length-2; i++)
            {
                if(arr[lowestIdx] > arr[j])
                {
                    lowestIdx = j;
                }

                swapElements(arr, i, lowestIdx);
            }
        }
    }

    private static void swapElements(int[] arr, int a, int b) {
        //swap elements
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
