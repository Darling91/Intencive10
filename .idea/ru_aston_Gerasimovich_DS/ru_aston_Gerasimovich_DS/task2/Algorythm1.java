package ru_aston_Gerasimovich_DS.task2;

public class Algorythm1 {

    //1)Напишите программу, которая проверяет отсортирован ли массив по
    // возрастанию. Если он отсортирован по возрастанию то выводится “OK”,
    // если нет, то будет выводиться текст “Please, try again”

    public static boolean sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return false;
    }


        public static void main(String[] args) {
            int[] arr = {5, 2, 8, 1, 4};
            sortArray(arr);
            if (sortArray(arr)) {
                System.out.println("OK");
            } else {
                System.out.println("Please, try again");
            }
        }
    }
