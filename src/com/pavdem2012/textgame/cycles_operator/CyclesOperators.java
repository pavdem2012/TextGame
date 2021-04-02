package com.pavdem2012.textgame.cycles_operator;

public class CyclesOperators {
    /**
     * Дана переменная n. Вывести факториал n.
     * 
     * @param n int for proccesing
     * @return factorial of number n
     */
    public int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * Даны две переменные: x, y. Вычислить x в степени y.
     * 
     * @param x int for proccesing
     * @param y int for proccesing
     * @return x to the power of y
     */
    public int degreeCalculator(int x, int y) {
        int j = 1;
        for (int i = 0; i < y; i = i + 1) {
            j *= x;
        }
        return j;
    }

    /**
     * Вывести массив типа boolean в обратном порядке используя цикл со счётчиком.
     * 
     * @param arrayForProcessing array for processing
     * @return boolean array in reverse order as string
     */
    public String reverseArray(boolean[] arrayForProcessing) {
        String processedText = "";
        for (int i = arrayForProcessing.length - 1; i >= 0; i--) {
            processedText += arrayForProcessing[i] + " ";
        }
        return processedText;
    }

    /**
     * Массив типа char выводить символы пока не встретится пробел.
     * 
     * @param inputText text for processing.
     * @return an array of characters up to the first space.
     */
    public String arrayToSpace(String inputText) {
        String outputText = "";
        char[] strToArray = inputText.toCharArray();
        for (int i = 0; strToArray[i] != ' '; i++) {
            outputText += strToArray[i];
        }
        return outputText;
    }

    /**
     * Альтернативное решение Массив типа char выводить символы пока не встретится
     * пробел.
     * 
     * @param inputText text for processing.
     * @return an array of characters up to the first space.
     */
    public String arrayToSpaceAlternative(String inputText) {
        String outputText = "";
        char[] strToArray = inputText.toCharArray();
        int i = 0;
        while (strToArray[i] != ' ') {
            outputText += strToArray[i];
            i++;
        }
        return outputText;
    }

    /**
     * По данному числу N вывести все целые степени двойки, не превосходящие N, в
     * порядке возрастания. Например: 1 2 4 8 16 32 для N=52
     * 
     * @param N int for processing
     * @return all integer powers of two not exceeding N
     */
    public String integerPowersOfTwo(int N) {
        String outputText = "";
        int x = 1;
        while (x < N) {
            outputText += x + ";" + " ";
            x *= 2;
        }
        return outputText;
    }

    /**
     * Дано натуральное число N. Выведите слово YES, если число N является точной
     * степенью двойки, или слово NO в противном случае.
     * 
     * @param N int for processing
     * @returnthe word YES if the number N is an exact power of two, or the word NO
     *            otherwise.
     */
    public String exactPowerOfTwo(int N) {
        String outputText = "";
        int x = 1;
        while (x < N) {
            x = x * 2;
        }
        if (x == N) {
            outputText = "YES";
        } else {
            outputText = "NO";
        }
        return outputText;
    }

    /**
     * Определите сумму всех элементов последовательности, завершающейся числом 0.
     * Массив {3,2,3,5,0,7,5,4}
     * 
     * @param numberArray array for processing
     * @return the sum of all elements of a zero-terminated sequence.
     */
    public int getMaxItemCount(int[] numberArray) {
        int sum = 0;
        for (int counter = 0; counter < numberArray.length; counter++) {
            if (numberArray[counter] == 0) {
                break;
            }
            sum = sum + numberArray[counter];
        }
        return sum;
    }

    /**
     * Последовательность состоит из натуральных чисел и завершается числом 0.
     * Определите, какое количество элементов этой последовательности, равны ее
     * наибольшему элементу. {3,5,1,5,2,3,5,0,7,5,4}
     * 
     * @param numberArray array for processing
     * @return the number of largest elements of the sequence to zero
     */
    public int numberOfLargestElementsSequence(int[] numberArray) {
        int max = 0;
        int numMax = 0;
        int number = -1;
        int counter = 0;
        while (number != 0) {
            number = numberArray[counter];
            counter++;
            if (number > max) {
                max = number;
                numMax = 1;
            } else if (number == max) {
                numMax += 1;
            }
        }
        return numMax;
    }

    /**
     * Вывести все элементы массива с четными индексами {3,5,1,5,2,3,5,0,7,5,4}
     * 
     * @param numberArray array for processing
     * @return all array elements with even indices
     */

    public String allElementsWithEvenIndex(int[] numberArray) {
        String processedText = "";
        int evenIndex = 0;
        for (int index = 0; index < numberArray.length; index++) {
            evenIndex = numberArray[index];
            if (index % 2 == 0) {
                processedText += evenIndex + ";" + " ";
            }
        }
        return processedText;
    }

    /**
     * Вывести все четные элементы массива {3,5,1,5,2,3,5,0,7,5,4}.
     * 
     * @param numberArray array for processing
     * @return all even elements of the array.
     */
    public String allEvenElements(int[] numberArray) {
        String processedText = "";
        int evenIndex = 0;
        for (int index = 0; index < numberArray.length; index++) {
            evenIndex = numberArray[index];
            if (evenIndex % 2 == 0) {
                processedText += evenIndex + ";" + " ";
            }
        }
        return processedText;
    }

    /**
     * Найти количество положительных элементов в данном массиве. {1,-2,3,-4,5}
     * 
     * @param numberArray array for processing
     * @return the number of positive elements in the given array
     */
    public int numberOfPositiveElementsInArray(int[] numberArray) {
        int counter = 0;
        int number = 0;
        for (int i = 0; i < numberArray.length; i++) {
            number = numberArray[i];
            if (number > 0) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Дан массив чисел. Выведите все элементы массива, которые больше предыдущего
     * элемента . {1,5,2,4,3}
     * 
     * @param numberArray array for processing
     * @return array elements that are larger than the previous one
     */
    public String elementsAreLargerPreviousOne(int[] numberArray) {
        String processedText = "";
        int number = 0;
        int previousNumber = 0;
        for (int i = 1; i < numberArray.length; i++) {
            number = numberArray[i];
            previousNumber = numberArray[i - 1];
            if (number > previousNumber) {
                processedText += number + "; ";
            }
        }
        return processedText;
    }

    /**
     * Дан массив целых чисел. Если в нем есть два соседних элемента одного знака,
     * выведите эти числа. Если соседних элементов одного знака нет - не выводите
     * ничего. Если таких пар соседей несколько - выведите первую пару.
     * {-1,2,3,-1,-2}
     * 
     * @param intList4 array for processing
     * @return two adjacent elements of the same sign
     */
    public String twoAdjacentElements(int[] numberArray) {
        String processedText = "";
        int previousNumber = 0;
        int number = 0;
        for (int i = 1; i < numberArray.length; i++) {
            previousNumber = numberArray[i - 1];
            number = numberArray[i];
            if (previousNumber > 0 & number > 0 | previousNumber < 0 & number < 0) {
                processedText = "\nСоседние элементы одного знака: " + previousNumber + "; " + number + "; \n";
                break;
            }
        }
        return processedText;
    }

    /**
     * Дан массив. { 3, 5, 1, 5, 2, 3, 5, 0, 7, 5, 4 } Создать новый массив и
     * наполнить его данным массивом, но в обратном порядке. Вывести новый массив на
     * экран.
     * 
     * @param numberArray array for processing
     * @return array in reverse order
     */
    public String arrayToNewReverseArray(int[] numberArray) {
        String processedText = "";
        int length = numberArray.length;
        int[] temporary = new int[length];
        for (int i = 0; i < length; i++) {
            temporary[i] = numberArray[length - i - 1];
            processedText += temporary[i] + "; ";
        }
        return processedText;
    }

    /**
     * Выведите значение наименьшего из всех положительных элементов в массиве.
     * Известно, что в массиве есть хотя бы один положительный элемент.
     * {5,-4,3,-2,1}
     * 
     * @param numberArray array for processing
     * @return smallest of all positive elements in the array
     */
    public String smallestOfPositiveElements(int[] numberArray) {
        String processedText = "";
        int min = numberArray[0];
        int number = 0;
        for (int i = 0; i < numberArray.length; i++) {
            number = numberArray[i];
            if (number > 0 & numberArray[i] < min) {
                min = number;
                processedText = "\nНаименьший из положительных элементов: " + min + ";\n";
            }
        }
        return processedText;
    }

    /**
     * Выведите значение наименьшего нечетного элемента списка, а если в списке нет
     * нечетных элементов - выведите число 0 {0,1,2,3,4} -> 1 {2,4,6,8,10} -> 0
     */
    public String smallestOddElementList(int[] numberArray) {
        String processedText = "";
        int n = numberArray.length;
        int min = numberArray[n - 1];
        int number = 0;
        for (int i = 0; i < numberArray.length; i++) {
            number = numberArray[i];
            if (number % 2 != 0 & numberArray[i] < min) {
                min = number;
                processedText = "Hаименьший нечетный элемент списка: " + min + "; ";
                break;
            } else if (number % 2 == 0) {
                processedText = "0";
            }
        }
        return processedText;
    }
}
