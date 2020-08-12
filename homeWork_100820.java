package ru.geekbrains.j_one.lesson_b.onlain;

public class homeWork_100820 {
    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
     */
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,0,1,1,0,0};
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));

        /*2 Задать пустой целочисленный массив размером 8. Написать метод,
         который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
         */
        int[] arr2 = new int[8];
        int j=1;
        for(int i = 0; i < arr2.length; i++, j = j + 3) {
            arr2[i] = j;
        }
        System.out.println(Arrays.toString(arr2));

        /* 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
        принимающий на вход массив и умножающий числа меньше 6 на 2;
         */
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));


        for (int i = 0; i < arr.length; i++) {
            if (arr3[i] < 6 ) arr3[i] = arr3[i]*2;
        }
        System.out.println(Arrays.toString(arr3));

        /* 4 Задать одномерный массив. Написать методы поиска в нём
        минимального и максимального элемента;
         */
        int[] mas = {7, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 5};
        int min = mas[0], max = mas[0], i, imin = 0, imax = 0;
        for(i = 0; i != mas.length; i++)
        {
            if(mas[i] < min){
                min = mas[i];
                imin = i;
            }
            if(mas[i] > max){
                max = mas[i];
                imax = i;
            }
            System.out.println("max = "+max+" min = "+min);
            System.out.println("imax = "+imax+" imin = "+imin);
        }



    }
}
