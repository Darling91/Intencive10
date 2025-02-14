package ru_aston_Gerasimovich_DS.task2;

import java.util.Random;

public class Algorytm4 {
    public static void main(String[] args) {
        int size = 10; // Размер массива
        int[] array = new int[size];

        // Заполнение массива случайными числами
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Случайные числа от 0 до 99
        }

        System.out.println("Исходный массив:");
        printArray(array);

        // Сортировка массива слиянием
        mergeSort(array, 0, array.length - 1);

        System.out.println("Отсортированный массив:");
        printArray(array);
    }

    // Метод сортировки слиянием
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Рекурсивное деление массива на две половины
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Слияние отсортированных половин
            merge(array, left, mid, right);
        }
    }

    // Метод слияния
    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = array[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = array[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Метод для вывода массива
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
