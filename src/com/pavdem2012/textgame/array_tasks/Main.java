package com.pavdem2012.textgame.array_tasks;

public class Main {

    public static void main(String[] args) {
        ArrayTasks arrayTasks = new ArrayTasks();
        // Найдите индексы первого вхождения максимального элемента двумерного массива.
        // {{1, 2, 3, 3, 4, 5}, {6, 5, 4, 4, 2, 1}, {1, 2, 3, 3, 4, 4}, {9, 8, 7, 6, 5,
        // 6}};
        int[][] twoDimArray = { { 1, 2, 3, 3, 4, 5 }, { 6, 5, 4, 4, 2, 1 }, { 1, 2, 3, 3, 4, 4 },
                { 9, 8, 7, 6, 5, 6 } };
        System.out.println("\nИзначальный массив:\n");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + "  ");
            }
            System.out.println("\n");
        }
        System.out
                .println("Индексы первого вхождения максмиального элемента: " + arrayTasks.getMaxElement(twoDimArray));

        // Дано нечетное число n, не превосходящее 15. Создайте двумерный массив из n×n
        // элементов, заполнив его символами "." (каждый элемент массива является
        // строкой из одного символа). Затем заполните символами "*" среднюю строку
        // массива, средний столбец массива, главную диагональ и побочную диагональ. В
        // результате "*" в массиве должны образовывать изображение звездочки. Выведите
        // полученный массив на экран, разделяя элементы массива пробелами.
        int n = 15;
        arrayTasks.printSnowFlake(n);

        // Дано число n, не превышающее 100. Создайте массив размером n×n и заполните
        // его по следующему правилу. На главной диагонали должны быть записаны числа 0.
        // На двух диагоналях, прилегающих к главной, числа 1. На следующих двух
        // диагоналях числа 2, и т.д. Выведите полученный массив на экран, разделяя
        // элементы массива пробелами.
        int b = 100;
        n = b;
        int[][] twoDimArray2 = new int[n][n];
        arrayTasks.fillingFromMainDiagonal(twoDimArray2);

        // Дан двумерный массив и два числа: i и j. Поменяйте в массиве столбцы с
        // номерами i и j
        int x = 0;
        int y = 1;
        int[][] twoDimArray3 = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 } };
        arrayTasks.permutationOfColumns(twoDimArray3, x, y);

        // Дано число n, не превосходящее 10, и массив размером n × n. Проверьте,
        // является ли этот массив симметричным относительно главной диагонали. Выведите
        // слово “YES”, если массив симметричный, и слово “NO” в противном случае.
        int d = 10;
        n = d;
        int[][] twoDimArray4 = new int[n][n];
        arrayTasks.checkingSymmetryArray(twoDimArray4, n);

        // "В кинотеатре n рядов по m мест в каждом (n и m не превосходят 20). В
        // двумерном массиве хранится информация о проданных билетах, число 1 означает,
        // что билет на данное место уже продан, число 0 означает, что место свободно.
        // Поступил запрос на продажу k билетов на соседние места в одном ряду.
        // Определите, можно ли выполнить такой запрос. Программа должна вывести номер
        // ряда, в котором есть k подряд идущих свободных мест. Если таких рядов
        // несколько, то выведите номер наименьшего подходящего ряда. Если подходящего
        // ряда нет, выведите число 0."
        int n1 = 5;
        n = n1;
        int m = 15;
        int k = 5;
        arrayTasks.checkingFreeSeats(n, m, k);

        // Дан прямоугольный массив размером n×m. Поверните его на 90 градусов по
        // часовой стрелке, записав результат в новый массив размером m×n.
        int n2 = 3;
        n = n2;
        int m1 = 4;
        m = m1;
        arrayTasks.rotationArray(n, m);

        // По данным числам n и m заполните двумерный массив размером n×m числами от 1
        // до n×m “змейкой”.
        int n3 = 3;
        n = n3;
        int m2 = 5;
        m = m2;
        arrayTasks.snakeFillingArray(n, m);

        // По числам n и m заполнить массив размерности n×m числами от 1 до произведения
        // n и m по диагоналям.
        int n4 = 3;
        n = n4;
        int m3 = 5;
        m = m3;
        arrayTasks.diagonallyFillingArray(n, m);
    }
}
