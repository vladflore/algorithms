public class IterateThreeTimesStrategy implements NChooseK {

    private int count;
    private boolean printCombination;

    @Override
    public void execute(int[] elements, int n, int k) {
        if (k != 3) {
            throw new IllegalArgumentException(
                    "This algorithm requires to choose 3 from n to generate the possible combinations!");
        }
        for (int i = 0; i < elements.length - 2; i++) {
            for (int j = i + 1; j < elements.length - 1; j++) {
                for (int m = j + 1; m < elements.length; m++) {

                    // TODO duplicates are not handled

                    count++;
                    if (printCombination) {
                        System.out.println("[" + elements[i] + ", " + elements[j] + ", " + elements[m] + "]");
                    }
                }
            }
        }
    }

    public int getCount() {
        return count;
    }

    public void setPrintCombination(boolean value) {
        printCombination = value;
    }
}
