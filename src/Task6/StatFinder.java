package Task6;

import java.util.Arrays;

public class StatFinder {
    public static void main(String[] args) {
        int[] data1 = {1, 1, 1, 1, 1,-1, 1, 1, 1, 1};
        int[] data2 = {206,430,73,30,293,322,42,36,447,229};

        System.out.println("Arithmetic mean = " + calcArithmeticMean(data1));
        System.out.println("Arithmetic mean = " + calcArithmeticMean(data2));

        System.out.println("Mediana = " + calcMediana(data1));
        System.out.println("Mediana = " + calcMediana(data2));

        System.out.println("Mode = " + calcMode(data1));
        System.out.println("Mode = " + calcMode(data2));

        System.out.println("Standart Deviation = " + calcDeviation(data1));
        System.out.println("Standart Deviation = " + calcDeviation(data2));
    }


    public static double calcArithmeticMean(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double)sum / array.length;
    }

    public static double calcMediana(int[] array) {
        Arrays.sort(array); // sorting array before finding mediana
        int middle = array.length/2;
        if (array.length%2 == 1) {
            return array[middle];
        } else {
            return (array[middle-1] + array[middle]) / 2.0;
        }
    }

    public static int calcMode(int[] array) {
        int maxValue = 0, maxCount = 0;

        for (int i = 0; i < array.length; ++i)
        {
            int count = 0;
            for (int j = 0; j < array.length; ++j)
            {
                if (array[j] == array[i])
                    ++count;
            }
            if (count > maxCount)
            {
                maxCount = count;
                maxValue = array[i];
            }
        }

        return maxValue;
    }

    public static double calcDeviation(int[] array)
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = array.length;

        for(int element : array) {
            sum += element;
        }

        double mean = sum/length;

        for(int element : array) {
            standardDeviation += Math.pow(element - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
}