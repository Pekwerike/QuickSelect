import java.util.Random;
public class Shuffle<Item> implements Comparable<Item> {
    public static void shuffle(Comparable[] inputArray){
        Random stdRandom = new Random();
        int N = inputArray.length;
        for(int i = 1; i < N; i++){
            int randomNumber = stdRandom.nextInt(i);
            exchange(inputArray, i, randomNumber);
        }
    }

    private static void exchange(Comparable[] inputArray, int i, int j){
        Comparable swap = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = swap;
    }

    @Override
    public int compareTo(Item item) {
        return this.compareTo(item);
    }
}
