package Task5;

public class ElementSearcher {
    public static void main(String[] args) {
        int[] array = {158,207,392,62,315,434,487,268,405,241};
        searchElement(array, 431); //type element to search here
    }
    public static void searchElement(int[] array, int el) {
        boolean isFound = false;
        for(int i = 0; i < array.length; i++) {
            if (array[i] == el) {
                System.out.println(el + " found under " + i + " index.");
                isFound = true;
            }
        }
        if (isFound == false) {
            System.out.println( el + " is not in array");
        }
    }
}
