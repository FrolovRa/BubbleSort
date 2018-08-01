import java.util.Arrays;

class BubbleSort
        {
private static int i = 1;
static int[] BubbleSorting(int[] arr)
        {
        //System.out.println(Arrays.toString(arr));
        //System.out.println("iteration number " + i);
        for (int index = 0; index < arr.length-1; index++)
        {
        //System.out.print("index = "+index);
        if (arr[index] > arr[index + 1])
        {
        int buff = arr[index];
        arr[index] = arr[index+1];
        arr[index+1] = buff;
        }

        //System.out.println(Arrays.toString(arr));

        }
        i++;
        // check the complete of BubbleSorting
        for (int index = 0; index < arr.length-1; index++)
        {
        if (arr[index] > arr[index + 1])
        {
        BubbleSorting(arr);
        }

        }

        return arr;

        }

static void BubbleSorting(double[] arr)
        {
        //System.out.println(Arrays.toString(arr));
        //System.out.println("iteration number " + i);
        for (int index = 0; index < arr.length-1; index++)
        {
        //System.out.print("index = "+index);
        if (arr[index] > arr[index + 1])
        {
        double buff = arr[index];
        arr[index] = arr[index+1];
        arr[index+1] = buff;
        }

        //System.out.println(Arrays.toString(arr));

        }
        i++;
        // check the complete of BubbleSorting
        for (int index = 0; index < arr.length-1; index++)
        {
        if (arr[index] > arr[index + 1])
        {
        BubbleSorting(arr);
        }

        }

        }
        }
