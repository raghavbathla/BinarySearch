package BinarySearch;

public class main {
    public static void main(String[] args) {
        String[] arr = { "Raghav", "radhika", "Mansi", "raman"};
        String x = "raman";
        int result = BinarySearch.binarySearch(arr, x)  ;

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}
