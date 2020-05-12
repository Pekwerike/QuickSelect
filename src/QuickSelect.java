public class QuickSelect<Item> implements Comparable<Item> {

    @Override
    public int compareTo(Item item) {
        return this.compareTo(item);
    }

    private static boolean less(Comparable a, Comparable b) {
        return b.compareTo(a) > 0;
    }

    private static void exchange(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public Comparable select(Comparable[] inputArray, int k) {
        Shuffle.shuffle(inputArray);
        int low = 0;
        int high = inputArray.length - 1;
        while(high > low) {
            int j = partition(inputArray, low, high);
            if (k > j) low = j + 1;
            else if (k < j) high = j - 1;
            else return inputArray[k];
        }
        return inputArray[k];

    }


    private static int partition(Comparable[] inputArray, int low, int high){
        int i = low + 1;
        int j = high;
        int k = low;
        while(true){
            while(less(inputArray[low], inputArray[j])){
                j = j -1;
                if(j <= low) break;

            }

            while(less(inputArray[i], inputArray[low])){
                i = i + 1;
                if(i >= high) break;
            }

            if(i >= j) break;
            exchange(inputArray, i, j);
        }
        exchange(inputArray, k, j);
        return j;
    }
}
