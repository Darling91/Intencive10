package ru_aston_Gerasimovich_DS.task2;

public class Algorytm3 {

    // 3) Дан массив чисел. Найдите первое уникальное в этом массиве число.

        public static void arrayFirstUniqueNumber(int[] arr2) {
            int[] myArray = {7, 1, 7, 8, 1, 67, 6, 5, 6};

            for (int i = 0; i < 9; i++) {
                if (i == 9) { //Чтобы не было выхода за пределы массива тем самым "ошибки типа java.lang.ArrayIndexOutOfBoundsException"
                    break;
                }
                if (myArray[i] == myArray[i + 1]) { //сравниваем первую ячейку со второй и если они равны то в консоль число не выводим
                    System.out.println();
                } else {
                    System.out.println(myArray[i]); //иначе выводим

                }
            }
        }
    }
