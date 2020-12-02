import java.util.Arrays;

public class FixAndRecurStrategy implements NChooseK {

    private int count;
    private boolean printCombination;

    @Override
    public void execute(int[] elements, int n, int k) {
        int[] currentCombination = new int[k];
        generate(elements, 0, n - 1, currentCombination, 0, k);
    }

    private void generate(int[] elements, int indexStart, int indexEnd, int[] currentCombination, int currCombPos,
            int k) {
        if (currCombPos == k) {
            count++;
            if (printCombination) {
                System.out.println(Arrays.toString(currentCombination));
            }
            return;
        }

        for (int i = indexStart; i <= indexEnd && indexEnd - i + 1 >= k - currCombPos; i++) {
            currentCombination[currCombPos] = elements[i];
            generate(elements, i + 1, indexEnd, currentCombination, currCombPos + 1, k);
        }
    }

    public int getCount() {
        return count;
    }

    public void setPrintCombination(boolean value) {
        printCombination = value;
    }
}