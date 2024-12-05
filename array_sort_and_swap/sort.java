package array_sort_and_swap;

import java.util.Random;

public class sort {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random rand = new Random();
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(256);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nSıralanmış Array: ");

    }
}
