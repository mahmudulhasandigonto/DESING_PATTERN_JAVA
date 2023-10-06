public class Application {

    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        int[] array = {1, 2, 3, 4, 5};

        sorter.setSortingStrategy(new BubbleSortStrategy());
        sorter.sortArray(array);

        sorter.setSortingStrategy(new BubbleSortStrategy());
        sorter.sortArray(array);

    }
}
