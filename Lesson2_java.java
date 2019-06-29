package com.company;

public class Main {

    public static void main(String[] args) {

        // Пункт 1.
        int[] arr1 = {1, 0, 0, 1, 0, 1};
        int i = 0;
        while (i < arr1.length) {
            if (arr1[i] == 0){
                arr1[i] = 1;
            }else{
                arr1[i] = 0;
            }
            i++;
        }
        System.out.println(arr1[0]);

        //Пункт 2.
        int[] arr2 = new int[8];
        int num = 0;
        for (int k : arr2){
            k = num;
            num += 3;
        }

        //Пункт3.
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for ( int n : arr3){
            if (n < 6){
                n *= 2;
            }
        }

        //Пункт4.
        int[][] arr4 = new int[3][3];
        for (int m = 0, s = 0; m < 3; m++, s++){
            arr4[m][s] = 1;
        }
        for (int index1 = 2, index2 = 0; index1 >= 0; index1--, index2++){
            arr4[index1][index2] = 1;
        }
        printArr(arr4);

        //Пункт5.
        int[] arr5 = {1, 6, 8, 32, 2, 5, 76, 4};
        int max = -100;
        int min = 100;
        for(int number : arr5){
            if ( number < min) {
                min = number;
            }else if ( number > max){
                max = number;
            }

        }
        //Результат 5 пункта.
        System.out.println(min);
        System.out.println(max);


        //Проверка 6 пункта.
        int[] arr6 = {10, 9, 1};
        boolean r = checkBalance(arr6);
        System.out.println(r);


    }
    //Выводит двумерный массив.
    public static void printArr (int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j =0; j < arr[i].length; j++ ) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }


    //Пункт6
    public static boolean checkBalance (int[] a){
        int distange1;
        int sum1 = 0;
        int sum2 = 0;
        boolean result = true;
        if (a.length % 2 == 0){
            distange1 = a.length / 2;

        }else {
            distange1 = a.length / 2;
        }
        for (int i = 0; i < distange1; i++){
            sum1 = sum1 + a[i];
        }
        for ( int j = distange1; j < a.length; j++) {
            sum2 += a[j];
        }
        result = ( sum1 == sum2)? true : false;
        return result;
    }
}
