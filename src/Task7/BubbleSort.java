package Task7;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {158, 207, 392, 62, 315, 434, 487, 268, 405, 241};
        sortAscending(array);
        System.out.println("Sorted ascending: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
            System.out.println();
        sortDescending(array);
        System.out.println("Sorted descending: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static int[] sortAscending(int[] array){
        for (int i = 0; i < ( array.length - 1 ); i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] sortDescending(int[] array){
        for (int i = 0; i < ( array.length - 1 ); i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
