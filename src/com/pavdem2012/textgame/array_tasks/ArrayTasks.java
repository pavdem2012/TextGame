package com.pavdem2012.textgame.array_tasks;

public class ArrayTasks {

    /**
     * Найдите индексы первого вхождения максимального элемента двумерного массива.
     * 
     * @param numberArray array for processing;
     * @return the indices of the first occurrence of an element in a
     *         two-dimensional array.
     */
    public String getMaxElement(int[][] numberArray) {
        String indicesFirstOccurrenceMaximalElement = "";
        int cashI = 0;
        int cashJ = 0;
        int max = numberArray[0][0];
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                if (numberArray[i][j] > max) {
                    max = numberArray[i][j];
                    cashI = i;
                    cashJ = j;
                    indicesFirstOccurrenceMaximalElement = "" + cashI + "; " + cashJ + ";";
                }
            }
        }
        System.out.println("Максимальный элемент массива: " + max + ";\n");
        return indicesFirstOccurrenceMaximalElement;
    }

    /**
     * Дано нечетное число n, не превосходящее 15. Создайте двумерный массив из n×n
     * элементов, заполнив его символами "." (каждый элемент массива является
     * строкой из одного символа). Затем заполните символами "*" среднюю строку
     * массива, средний столбец массива, главную диагональ и побочную диагональ. В
     * результате "*" в массиве должны образовывать изображение звездочки. Выведите
     * полученный массив на экран, разделяя элементы массива пробелами.
     * 
     * @param n array size;
     */

    public void printSnowFlake(int n) {
        String[][] charArray = new String[n][n];
        System.out.println("\nМассив n x n заполненный (.):\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                charArray[i][j] = ".";
                System.out.print(charArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nМассив со снежинкой:\n");
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                if (j == n / 2 || i == n / 2 || i == j || i == n - 1 - j) {
                    charArray[i][j] = "*";
                }
                System.out.print(charArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Дано число n, не превышающее 100. Создайте массив размером n×n и заполните
     * его по следующему правилу. На главной диагонали должны быть записаны числа 0.
     * На двух диагоналях, прилегающих к главной, числа 1. На следующих двух
     * диагоналях числа 2, и т.д. Выведите полученный массив на экран, разделяя
     * элементы массива пробелами.
     * 
     * @param numberArray array for processing;
     */
    public void fillingFromMainDiagonal(int[][] numberArray) {
        System.out.println("\nЗаполненный массив:\n");
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                numberArray[i][j] = (int) Math.abs(i - j);
                if (i == j) {
                    numberArray[i][j] = 0;
                }
                System.out.print(numberArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Дан двумерный массив и два числа: i и j. Поменяйте в массиве столбцы с
     * номерами i и j
     * 
     * @param numberArray array for processing;
     * @param x           column number;
     * @param y           other column number;
     */
    public void permutationOfColumns(int[][] numberArray, int x, int y) {
        int a = numberArray[0].length;
        if (x > a - 1 || y > a - 1) {
            System.out.println("\nНомер столбца находится за пределлами массива, введите другое значение.");
        } else {
            System.out.println("\nИзначальный массив:\n");
            for (int i = 0; i < numberArray.length; i++) {
                for (int j = 0; j < numberArray[i].length; j++) {
                    System.out.print(numberArray[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("\nМассив с поменяными столбцами:\n");
            int cash;
            for (int i = 0; i < numberArray.length; i++) {
                cash = numberArray[i][x];
                numberArray[i][x] = numberArray[i][y];
                numberArray[i][y] = cash;
                for (int j = 0; j < numberArray[i].length; j++) {
                    System.out.print(numberArray[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }

    /**
     * Дано число n, не превосходящее 10, и массив размером n × n. Проверьте,
     * является ли этот массив симметричным относительно главной диагонали. Выведите
     * слово “YES”, если массив симметричный, и слово “NO” в противном случае.
     * 
     * @param numberArray array for processing;
     * @param n           size and maximum number of array;
     */
    public void checkingSymmetryArray(int[][] numberArray, int n) {
        System.out.println("\nПолученый массив:\n");
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                numberArray[i][j] = (int) (Math.random() * n);
                System.out.print(numberArray[i][j] + " ");
            }
            System.out.println("");
        }
        String Output = "";
        int nonconformityCounter = 0;
        int cashI = 0;
        int cashJ = 0;
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                cashI = numberArray[i][j];
                cashJ = numberArray[j][i];
                if (cashI != cashJ) {
                    nonconformityCounter++;
                }
                if (nonconformityCounter > 0) {
                    Output = "NO";
                } else {
                    Output = "YES";
                }
            }
        }
        System.out.println("\n" + Output);
    }

    /**
     * "В кинотеатре n рядов по m мест в каждом (n и m не превосходят 20). В
     * двумерном массиве хранится информация о проданных билетах, число 1 означает,
     * что билет на данное место уже продан, число 0 означает, что место свободно.
     * Поступил запрос на продажу k билетов на соседние места в одном ряду.
     * Определите, можно ли выполнить такой запрос. Программа должна вывести номер
     * ряда, в котором есть k подряд идущих свободных мест. Если таких рядов
     * несколько, то выведите номер наименьшего подходящего ряда. Если подходящего
     * ряда нет, выведите число 0."
     * 
     * @param n the number of rows in the cinema;
     * @param m number of seats in a row;
     * @param k the required number of seats nearby;
     */
    public void checkingFreeSeats(int n, int m, int k) {
        if (k > m) {
            System.out.println("\nРяд кинотеатра вмещает всего " + m + " мест.");
            return;
        }
        int[][] numberArray = new int[n][m];
        System.out.println("\nПлан кинозала с продаными билетами:\n");
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                numberArray[i][j] = (int) (Math.random() * 2);
                System.out.print(numberArray[i][j] + " ");
            }
            System.out.println("");
        }
        Integer emptyPlace = null;
        for (int i = 0; i < numberArray.length; i++) {
            emptyPlace = 0;
            for (int j = 0; j < numberArray[i].length; j++) {
                if (numberArray[i][j] == 0) {
                    emptyPlace++;
                    if (emptyPlace == k) {
                        System.out.println("\nВозможно приобрести билеты в " + (i + 1) + " ряд.");
                        break;
                    }
                } else {
                    emptyPlace = 0;
                }
            }
            if (emptyPlace == k) {
                break;
            }
        }
        if (emptyPlace != k) {
            System.out.println("\nБилетов по вашему запросу 0.");
        }
    }

    /**
     * Дан прямоугольный массив размером n×m. Поверните его на 90 градусов по
     * часовой стрелке, записав результат в новый массив размером m×n.
     * 
     * @param n number in the original array lines;
     * @param m number in the original array columns;
     */
    public void rotationArray(int n, int m) {
        int[][] numberArray = new int[n][m];
        int[][] temporary = new int[m][n];
        System.out.println("\nНаполненный изначальный масив:\n");
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                numberArray[i][j] = (int) (Math.random() * m);
                System.out.print(numberArray[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temporary[j][n - 1 - i] = numberArray[i][j];
            }
        }
        System.out.println("\nМасив повернутый на 90':\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(temporary[i][j] + " ");
            }
            System.out.println("");
        }
    }

    /**
     * По данным числам n и m заполните двумерный массив размером n×m числами от 1
     * до n×m “змейкой”.
     * 
     * @param n number the array lines;
     * @param m number the array columns;
     */
    public void snakeFillingArray(int n, int m) {
        int[][] numberArray = new int[n][m];
        int num = 1;
        for (int i = 0; i < numberArray.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < numberArray[i].length; j++) {
                    numberArray[i][j] = num;
                    num++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    numberArray[i][j] = num;
                    num++;
                }
            }
        }
        System.out.println("\nМассив заполненный" + "змейкой" + ":\n");
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                System.out.print(numberArray[i][j] + " ");
            }
            System.out.println("");
        }
    }

    /**
     * По числам n и m заполнить массив размерности n×m числами от 1 до произведения
     * n и m по диагоналям.
     * 
     * @param n number the array lines;
     * @param m number the array columns;
     */
    public void diagonallyFillingArray(int n, int m) {
        int num = 0;
        int[][] numberArray = new int[n][m];
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                numberArray[i][j] = ++num;
            }
        }
        int[][] result = new int[n][m];
        int rowIndex = 0;
        int columnIndex = 0;
        int currentRow = 0;
        int currentColumn = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[currentRow][currentColumn] = numberArray[i][j];
                if (currentRow == n - 1) {
                    if (n < m && columnIndex < m - 1) {
                        currentRow = 0;
                        currentColumn = ++columnIndex;
                    } else {
                        currentRow = ++rowIndex;
                        currentColumn = m - 1;
                    }
                } else if (currentColumn == 0) {
                    if (columnIndex < m - 1) {
                        currentRow = rowIndex;
                        currentColumn = ++columnIndex;
                    } else {
                        currentColumn = columnIndex;
                        currentRow = ++rowIndex;
                    }
                } else {
                    currentRow++;
                    currentColumn--;
                }
            }
        }
        System.out.println("\nМассив заполненый по диагонали:\n");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    /**
     * Заполнить массив размером a × c в виде шахматной доски. Вместо одного цвета
     * 0, другого - числа по возрастанию. В левом верхнем углу число 1.
     * 
     * @param a number the array lines;
     * @param c number the array columns;
     */
    public void checkerboardPatternFilling(int a, int c) {
        int pass = 0;
        int number = 1;
        int[][] numberArray = new int[a][c];
        for (int i = 0; i < a; i++) {
            if (i % 2 == 1) {
                pass = 1;
            } else {
                pass = 0;
            }
            for (int j = pass; j < c; j++) {
                numberArray[i][j] = number;
                number++;
                j++;
            }
        }
        System.out.println("\nМассив заполненный в шахматном порядке:\n");
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                System.out.print(numberArray[i][j] + " ");
            }
            System.out.println("");
        }
    }

    /**
     * Двумерный массив размером f * g наполнить числами от 1 до k*x в виде
     * свернувшейся калачиком змейки.
     * 
     * @param f number the array lines;
     * @param g c number the array columns;
     */
    public void spiralFillingArray(int f, int g) {
        int[][] array = new int[f][g];
        int num = 1;
        for (int i = 0; i < g; i++) {
            array[0][i] = num;
            num++;
        }
        for (int j = 1; j < f; j++) {
            array[j][g - 1] = num;
            num++;
        }
        for (int i = g - 2; i >= 0; i--) {
            array[f - 1][i] = num;
            num++;
        }
        for (int j = f - 2; j > 0; j--) {
            array[j][0] = num;
            num++;
        }
        int iX = 1;
        int jY = 1;
        while (num < f * g) {
            while (array[iX][jY + 1] == 0) {
                array[iX][jY] = num;
                num++;
                jY++;
            }
            while (array[iX + 1][jY] == 0) {
                array[iX][jY] = num;
                num++;
                iX++;
            }
            while (array[iX][jY - 1] == 0) {
                array[iX][jY] = num;
                num++;
                jY--;
            }
            while (array[iX - 1][jY] == 0) {
                array[iX][jY] = num;
                num++;
                iX--;
            }
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < g; j++) {
                if (array[i][j] == 0) {
                    array[i][j] = num;
                }
            }
        }
        System.out.println("\nМассив в виде свернувшейся калачиком змейки:\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 10 == array[i][j]) {
                    System.out.print(array[i][j] + "   ");
                } else if (array[i][j] % 100 == array[i][j]) {
                    System.out.print(array[i][j] + "  ");
                } else if (array[i][j] % 1000 == array[i][j]) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}
