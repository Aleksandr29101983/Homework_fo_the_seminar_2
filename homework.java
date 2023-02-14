//                               Домашнее задание к семинару 2

// ЗАДАЧА: Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено

// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

// нельзя использовать math.pow

// Декомпозиция:
// Создать файл README
// Создать метод чтения из файла
// Создать метод возведения числа в положительную степень
// Создать метод возведения числа в отрицательную степень
// Создать метод записи в файл
// Создать метод управления работой программы

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
    }
    // Метод считывания файла:
    public static int[] readFile() throws FileNotFoundException {// FileNotFoundException Выдаст ошибку при отсутствии файла
        File file = new File("input.txt"); // создаем класс файл - присвоим файл некой сущности)
        Scanner scanner = new Scanner(file); // На вход классу сканер подаем файл
        String line = scanner.nextLine(); // присвоить строковой переменной следующую строку
        int[] intArray = new int[2];
        String[] stringArray = line.split(" "); // Создали массив из строки разбив по пробелам
        int a = Integer.parseInt(stringArray[1]); // Преобразуем в число второй элемент стокового массива
        intArray[0] = a;
        line = scanner.nextLine(); // присвоить строковой переменной следующую строку
        stringArray = line.split(" "); // Создали массив из строки разбив по пробелам
        a = Integer.parseInt(stringArray[1]); // Преобразуем в число второй элемент стокового массива
        intArray[1] = a;
        // scanner.hasNextLine() - проверяет, есть ли несчитанные строки
        scanner.close(); // Закрыли сканер
        return intArray;
    }
}