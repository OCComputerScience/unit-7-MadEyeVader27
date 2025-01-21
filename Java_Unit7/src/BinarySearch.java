public class BinarySearch
{
    public static int binarySearch(int[] array, int numToFind)
    {
        int left = 0;
        int right = array.length - 1; //size if ArrayList

        while (left <= right)
        {
            //current middle index
            int mid = left + (right - left) / 2;

            //current middle value
            int current = array[mid];

            //Evaluate
            if(current == numToFind)
            {
                return mid;
            }
            else if (current < numToFind)
            {
                left = mid + 1;
            }
            else
            {
                right = mid-1;
            }
        }
        return -1;
    }
}
