package _ArraySumContinuous;

public class Main
{
      public static int[] findSum(int[] arr, int target)
      {
          int currSum = 0, startIdx = 0;

          for (int i = 0; i < arr.length; i++)
          {
              currSum += arr[i];

              if(currSum < target)
              {
                  continue;
              }

              while(currSum > target && startIdx < i)
              {
                currSum -= arr[startIdx];
                startIdx++;
              }

              if(currSum == target)
              {
                  return new int[] { startIdx + 1, i + 1};
              }


          }
          return new int[]{};
      }

}
