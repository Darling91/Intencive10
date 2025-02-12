package ru_aston_Gerasimovich_DS.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamTaskToNewPR {
    package ru_aston_Gerasimovich_DS.test;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

    public class StreamTask {

        public void findHonestElement(){
            //1) Найти все четные элемениты в списке в диапазоне от 1 до 100

            IntStream.rangeClosed(1,100) // генерируем числа от 1 до 100
                    .filter(i -> i % 2 == 0)
                    .forEach(System.out::println);
        }

        public void multiplyEachNumber(){
            //2) Умножить каждое число в массиве [1, 2, 3, 4, 5] на 2

            Stream<Integer> numbres = Stream.of(1, 2, 3, 4, 5);
            List<Integer> result = numbres.map(n -> n*2).collect(toList());
        }

        public void sumArrayNumbers(){
            //3) Посчитать сумму чисел в массиве [1, 2, 3, 4, 5], используя reduce()
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

            int result = numbers.stream().reduce((a,b) -> a+b).get();
            System.out.println(result);
        }

        public void printRangeNumbers(){
            //4)Вывести числа в диапазоне от 1 до 50 с шагом 2
            IntStream.rangeClosed(1,50)
                    .filter(i -> i % 2 != 0) // Фильтруем только нечетные числа
                    .forEach(System.out::println);
        }

        public void firstHonestElement(){
            //5) Найти первый четный элемент в списке [1, 2, 3, 4, 5]

            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

            int result = numbers.stream()
                    .filter(i -> i % 2 == 0)
                    .findFirst().get();
        }

        public void ascendingSort(){
            //6) Отсортировать элементы массива [1, 3, 5, 7, 9] по возрастанию

            int[] array = {1,3,5,7,9};

            int[] result = Arrays.stream(array)
                    .sorted()
                    .toArray();
        }

        public void firstTenNumbers(){
            //7) Вывести первые 10 чисел в списке [0, 1, 2, … 99]

            List<Integer> numbers = IntStream.range(0,99)
                    .boxed()
                    .collect(toList());

            numbers.stream()
                    .limit(10)
                    .forEach(System.out::println);
        }

        public void firstTenNumbers1(){
            //8) Пропустить первые 10 элементов списка [0, 1, 2,.., 99]
            //и начать выводить с 11-го элемента, выводя каждый 10-й элемент

            List<Integer> numbers = IntStream.range(0,99)
                    .boxed()
                    .collect(toList());

            numbers.stream()
                    .skip(10) // пропускаем первые 10 элементов
                    .filter(n -> (n - 10) % 10 == 0) // выводим с 11 элемента каждый 10
                    .forEach(System.out::println);
        }

        public void divisionByThree(){
            // 9) Выведите на экран все числа в диапазоне от 1 до 100, которые делятся на 3

            IntStream.rangeClosed(1,100)
                    .filter(i -> i % 3 == 0)
                    .forEach(System.out::println);
        }

        public void oddNumbers(){
            // 10) Выведите все нечетные числа в заданном массиве

            int[] array = {1,2,3,4,5};

            Arrays.stream(array)
                    .filter(n -> n % 2 != 0)
                    .forEach(System.out::println);
        }

        public void numbersUp(){
            // 11)Выведите на экран только те элементы списка, которые больше заданного числа.

            int n = 3;

            IntStream.rangeClosed(1,100)
                    .filter(i -> i > n)
                    .forEach(System.out::println);
        }

        public void listLessZeroNumbers(){
            // 12) Отфильтруйте все элементы списка, которые меньше 0
            List<Integer> numbers = Arrays.asList(-5, -3, -1, 0, 1, 3 ,5);

            numbers.stream()
                    .filter(i -> i >= 0)
                    .forEach(System.out::println);
        }

        public void intoMap(){
            // 13) Выведите на экран строки, которые начинаются с заданной подстроки.

            List<String> strings = Arrays.asList("apple", "banana", "apricot", "cherry", "avocado"); // Пример списка строк
            String prefix = "ap"; // Заданная подстрока

            // Фильтруем строки, начинающиеся с заданной подстроки, и выводим их
            strings.stream()
                    .filter(s -> s.startsWith(prefix)) // Проверяем, начинается ли строка с подстроки
                    .forEach(System.out::println); // Выводим на консоль
        }

        public void notAMultiplyOfTwo(){
            // 14) Выведите все числа в списке, которые не кратны 2.

            List<Integer> numbers = IntStream.range(1,100)
                    .boxed()
                    .collect(toList());

            numbers.stream()
                    .filter(n -> n % 2 != 0)
                    .forEach(System.out::println);
        }

        public void filterElement(){
            // 15) Отфильтруйте объекты по определенному свойству,
            // например, выведите все записи из базы данных, у которых значение поля равно 1.

            User user1 = new User(1,"Dmitry","TutYa", "123456");
            User user2 = new User(2,"Vlad","fgdsf","gdsfs");
            User user3 = new User(3,"Danya", "fafsfs", "fafasfqeg");
            User user4 = new User(4,"Andrey", "ffafaffa","fafweregwq");

            List<User> users = new ArrayList<>();
            users.add(user1);
            users.add(user2);
            users.add(user3);
            users.add(user4);

            List<User> result = users.stream()
                    .filter(u -> u.getUserId() == 1)
                    .collect(Collectors.toList());
            System.out.println(result);
        }

        public void uniqueFormat(){
            // 16) Выведите только те элементы коллекции, которые удовлетворяют
            // определенному условию, например, являются уникальными или имеют определенный формат.

            List<Integer> numbers = Arrays.asList(1,2,3,4,2,6,6,8,9,10);

            List<Integer> uniqueNumbers = numbers.stream()
                    .distinct()
                    .collect(toList());

            uniqueNumbers.forEach(System.out::println);
        }

        public void notANumbers(){
            // 17) Отфильтруйте элементы массива, которые не являются числами.

            List<Object> mixedList = Arrays.asList(1, "Apple", 3, "fasdq", 4);

            mixedList.stream()
                    .filter(o -> o instanceof Integer)
                    .forEach(System.out::println);
        }

        public void twoLists(){
            // 18) Выведите на экран элементы списка, которые не входят в другой список.

            List<Integer> numbers = Arrays.asList(1,2,3,4,5);
            List<Integer> numbers1 = Arrays.asList(2,4,6,8,10);

            List<Integer> numbers2 = numbers1.stream()
                    .filter(element -> !numbers1.contains(element))// фильтруем элементы
                    // элементы 1 списка не равны элементам 2 списка
                    .collect(toList());

            numbers2.forEach(System.out::println);
        }

        public void arrayHonestNumbers(){
            // 19) Проверить, все ли числа в массиве [0, 1, …, 19] являются четными

            int[] numbers = IntStream.range(0,20)
                    .toArray();

            // проверка все ли элементы четные/четкие
            boolean allEven = IntStream.of(numbers)
                    .allMatch(n -> n % 2 == 0); // Условие для четности

            // Выводим результат
            if (allEven) {
                System.out.println("Все числа четные.");
            } else {
                System.out.println("Не все числа четные.");
            }
        }

        public void arrayHonestNumber(){
            // 20) Проверить, есть ли четное число в списке [0, 1, 2, 3]
            List<Integer> numbers = Arrays.asList(0,1,2,3);

            boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);

            if(hasEven) {
                System.out.println("В списке есть четное число.");
            }
            else {
                System.out.println("В списке нет четных чисел.");
            }
        }

        public void streamUniqueElement(){
            // 21) Собрать все уникальные элементы Stream в список и отсортировать их.

            List<Integer> list = Arrays.asList(1,2,3,4,5,2,3,6,5);

            List<Integer> numbers = list.stream()
                    .distinct()
                    .sorted()
                    .collect(toList());
        }

        public void intoMap1(){
            // 22) Собрать элементы Stream в карту, где ключом будет первая буква каждого слова,
            // а значением — само слово. Отсортировать ключи в алфавитном порядке.

            Stream<String> words = Stream.of("Ivan", "Sergey", "Nikolay", "Petr");

            Map<String,String> result = words
                    .collect(Collectors.toMap(
                            w -> w.substring(0, 1),
                            w -> w, (oldValue, newValue) -> newValue,
                            TreeMap::new
                    ));

            System.out.println(result);
        }

        public void intoMap2(){
            // 23) Собрать числа в Stream в список сумм цифр каждого числа

            List<Integer> numbers = Arrays.asList(123, 456, 789); // Исходный список чисел

            // Собираем суммы цифр каждого числа в новый список
            List<Integer> digitSums = numbers.stream()
                    .map(intoMap2()::sumOfDigits) // Применяем метод для суммирования цифр
                    .collect(Collectors.toList()); // Собираем в список

            // Выводим результат на консоль
            digitSums.forEach(System.out::println);
        }

        // Метод для вычисления суммы цифр числа
        public static int sumOfDigits(int number) {
            return String.valueOf(number) // Преобразуем число в строку
                    .chars() // Получаем поток символов
                    .map(Character::getNumericValue) // Преобразуем символы в числа
                    .sum(); // Суммируем цифры

        }

        public void localDate(){
            // 24) Собрать даты в Stream в список, где каждый элемент — это количество дат в каждом месяце года
            List<LocalDate> dates = Arrays.asList(
                    LocalDate.of(2025, Month.JANUARY, 1),
                    LocalDate.of(2025, Month.FEBRUARY, 2),
                    LocalDate.of(2025, Month.MARCH, 3),
                    LocalDate.of(2025, Month.APRIL, 4),
                    LocalDate.of(2025, Month.MAY, 5)
            );

            // Собираем количество дат в каждом месяце года
            List<Long> dateCountsPerMonth = Month.class.getEnumConstants()
                    .stream()
                    .map(month -> dates.stream()
                            .filter(date -> date.getMonth() == month) // Фильтруем даты по месяцу
                            .count()) // Считаем количество дат
                    .collect(Collectors.toList()); // Собираем в список
        }

        public void filesWidth(){
            // 25) Собрать файлы в Stream в список,
            // где каждый элемент — количество файлов с определенным расширением.

            // Путь к директории, которую нужно просмотреть
            Path directoryPath = Paths.get("your/directory/path"); // Замените на ваш путь

            // Определяем расширения, которые хотим учитывать
            List<String> extensions = Arrays.asList(".txt", ".jpg", ".pdf");

            try {
                // Собираем количество файлов для каждого расширения
                List<Long> fileCounts = extensions.stream()
                        .map(extension -> {
                            try {
                                return Files.list(directoryPath)
                                        .filter(file -> file.toString().endsWith(extension)) // Фильтруем файлы по расширению
                                        .count(); // Считаем количество файлов
                            } catch (IOException e) {
                                e.printStackTrace();
                                return 0L; // Возвращаем 0 в случае ошибки
                            }
                        })
                        .collect(Collectors.toList()); // Собираем в список

                // Выводим результат на консоль
                for (int i = 0; i < extensions.size(); i++) {
                    System.out.printf("Количество файлов с расширением %s: %d%n", extensions.get(i), fileCounts.get(i));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }









    }

}
