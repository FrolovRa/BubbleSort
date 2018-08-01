import java.util.Arrays;

class BubbleSort {
        static int[] BubbleSorting(int[] arr) {
            boolean status = true;
            do {
                for (int i = 0; i < arr.length - 1; i++) {
                    System.out.println("index = " + i);
                    if (arr[i] > arr[i + 1]) {
                        int temp;
                        temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                    System.out.println(Arrays.toString(arr));
                }
                //check the complete of sorting
                for(int i = 0; i < arr.length - 1; i++){
                    if (arr[i]>arr[i+1]) {
                        System.out.println("array is not sorted yet");
                        System.out.println(Arrays.toString(arr));
                        break;
                    }
                    if (i == arr.length - 2){
                        status = false;
                        System.out.println("finished!");
                    };

                }
            } while (status);
            return arr;
        }

}

