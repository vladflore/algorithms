import java.util.stream.IntStream;

public class Client {
    public static void main(String[] args) {

        int[] elements = IntStream.rangeClosed(1, 5).toArray();
        int k = 3;

        FixAndRecurStrategy fixAndRecur = new FixAndRecurStrategy();
        fixAndRecur.setPrintCombination(true);
        IterateThreeTimesStrategy iterateThreeTimesStrategy = new IterateThreeTimesStrategy();
        iterateThreeTimesStrategy.setPrintCombination(true);

        GenerateCombinations generateCombinations = new GenerateCombinations();

        generateCombinations.setStrategy(fixAndRecur);
        long start = System.currentTimeMillis();
        generateCombinations.executeStrategy(elements, elements.length, k);
        System.out.println("Done in " + (System.currentTimeMillis() - start) + " ms");

        generateCombinations.setStrategy(iterateThreeTimesStrategy);
        start = System.currentTimeMillis();
        generateCombinations.executeStrategy(elements, elements.length, k);
        System.out.println("Done in " + (System.currentTimeMillis() - start) + " ms");
    }
}
