public class MergeSort {

    public static void sort(Double object[], int begin, int end){

        if(begin < end){

            int splitPoint = split(object, begin, end);

            // sort first and second halves
            sort(object, begin, splitPoint);
            sort(object, splitPoint + 1, end);

            join(object, begin, splitPoint, end);

        }

    }

    public static int split(Double object[], int begin, int end){

        int splitPoint = (begin + end) / 2;
        return splitPoint;

    }

    public static void join(Double object[], int begin, int splitPoint, int end){

        // Find sizes of two subarrays to be merged
        int size1 = splitPoint - begin + 1;
        int size2 = end - splitPoint;

        // Create temp arrays
        Double L[] = new Double[size1];
        Double R[] = new Double[size2];

        // Copy data to temp arrays
        for (int i = 0; i < size1; ++i)
            L[i] = object[begin + i];

        for (int j = 0; j < size2; ++j)
            R[j] = object[splitPoint + 1 + j];

        // Merge the temp arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = begin;

        while (i < size1 && j < size2) {

            if (L[i] <= R[j]) {

                object[k] = L[i];
                i++;

            }
            else {

                object[k] = R[j];
                j++;

            }
            k++;

        }

        // Copy remaining elements of L[] if any
        while (i < size1) {

            object[k] = L[i];
            i++;
            k++;

        }

        // Copy remaining elements of R[] if any
        while (j < size2) {

            object[k] = R[j];
            j++;
            k++;

        }

    }

}
