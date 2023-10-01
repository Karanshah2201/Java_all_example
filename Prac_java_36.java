
    import java.util.Arrays;

public class Prac_java_36<T extends Comparable<T>> {
    public void sortArray(T[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        // Example usage
        Integer[] integerArray = { 5, 1, 3, 2, 4 };
        String[] stringArray = { "banana", "apple", "cherry", "date", "fig" };

        Prac_java_36<Integer> integerSorter = new Prac_java_36<>();
        Prac_java_36<String> stringSorter = new Prac_java_36<>();

        integerSorter.sortArray(integerArray);
        stringSorter.sortArray(stringArray);

        System.out.println("Sorted Integer Array: " + Arrays.toString(integerArray));
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}

