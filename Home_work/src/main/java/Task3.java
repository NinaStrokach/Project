import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        int[] arr = Value('6', '9');
        System.out.println(Arrays.toString(arr));
        System.out.println();
        task6(new int[]{ 1, 3, 5, -2, 18, -9, 0});
        System.out.println(task7(new int[]{3, 1, 2, 2, 2, 2}) + "\n");
        System.out.println(Arrays.toString(task8(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 3)) +"\n");
        System.out.println(Arrays.toString(task8(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, - 3)) +"\n");
    }

    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
           С помощью цикла и условия заменить 0 на 1, 1 на 0; */
    public static void task1() {
        int[] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                nums[i] = 0;
            } else nums[i] = 1;
            {
                System.out.println(nums[i]);
            }
        }}

    /* 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    public static void task2() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
       arr[i] = i + 1;
       System.out.println("arr["+i+"] =" + arr[i]);

    }
    }

    /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2; */
    public static void task3() {
        int[] nums = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] < 6) nums[i] = nums[i] * 2;
        }
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println (i + "-" + nums[i]+" ");
    }}


    /* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
    если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких
    элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */

    public static void task4() {
        int n = 4;
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            int row = array[i].length;
            for (int j = 0; j < array.length; j++) {
                if ((i == j) || (j == row - 1 - i)) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + "");
            }
            System.out.println();
        }
        System.out.println();
    }

    /* 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа
    int длиной len, каждая ячейка которого равна initialValue;
     */

         public static int[] Value(final int len, final int initialValue) {
         int[] arr = new int[len];
         for (int i = 0; i < arr.length; i++) {
             arr[i] = initialValue;
         }
         return arr;
     }

/* 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ; */
public static void task6(final int[] arr){
    int min = arr[0];
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    System.out.println("Min:" + min);
    System.out.println("Max:" + max);
    System.out.println();
}

/* 7. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
 если в массиве есть место, в котором сумма левой и правой части массива равны.
Примеры:
checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1

граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.*/
public static boolean task7(final int[] arr) {
    int value = arr.length;
    boolean result = false;
    for (int i = 0; i < value -1; i++) {
        int left = 0;
        int right = 0;
        for (int j = 0; j <= i; j++) {
            left += arr[j];
        }
        for (int k = i + 1; k < value; k++) {
            right += arr[k];
        }
        if (left == right) {
            result = true;
        }
    }
    return result;
}

/* 8. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
 или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
  Для усложнения задачи нельзя пользоваться вспомогательными массивами.
  Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при
  n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
 */

public static int[] task8(final int[] input, final int shift) {
    int[] arr = input.clone();
    if (shift < 0) {
        for (int i = 0; i< Math.abs(shift); i++) {
            int buffer = arr[0];
            for (int j = 0; j < arr.length; j++) {
                if ((j+1) < arr.length) {
                    arr[j] = arr[j + 1];
                } else {
                    arr[j] = buffer;
                }
            }
        }
    } else if (shift > 0) {
        for (int j = 0; j < shift; j++) {
            int buffer = arr[arr.length - 1];
            for (int i = arr.length - 1; i>0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = buffer;
        }
    }
    return arr;
}}











