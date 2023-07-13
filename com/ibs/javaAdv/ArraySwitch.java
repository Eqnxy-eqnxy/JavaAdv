package com.ibs.javaAdv;

public class ArraySwitch {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int maxInd = 0;
        int minInd = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 21) - 10);
            System.out.println(arr[i]);
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] > arr[i]) {
                maxInd = arr[i - 1];
            }
            if ((arr[i + 1] < 0) && (arr[i] > 0)) {
                minInd = arr[i];
            }
        }

        int temp = arr[minInd];
        arr[minInd] = arr[maxInd];
        arr[maxInd] = temp;

        System.out.println("min =" + minInd + " max = " + maxInd);

    }
}