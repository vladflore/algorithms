public class GenerateCombinations {

    private NChooseK strategy;

    public void setStrategy(NChooseK strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int[] elements, int n, int k) {
        strategy.execute(elements, n, k);
    }
}
