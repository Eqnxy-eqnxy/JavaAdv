package com.ibs.javaAdv;

public class ArraySwitch {
    public static void main(String[] args) {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 21) - 10);
        }

        int maxNeg = Integer.MAX_VALUE;
        int maxNegIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < maxNeg && arr[i] < 0) {
                maxNeg = arr[i];
                maxNegIndex = i;
            }
        }

        int minPos = Integer.MAX_VALUE;
        int minPosIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] < minPos) {
                minPos = arr[i];
                minPosIndex = i;
            }
        }

        System.out.println("\nДо подмены:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nmax negative = " + maxNeg + " index: " + maxNegIndex);
        System.out.println("min positive = " + minPos + " index: " + minPosIndex);

        if (maxNegIndex != -1 && minPosIndex != -1) {
        int temp = arr[minPosIndex];
        arr[minPosIndex] = arr[maxNegIndex];
        arr[maxNegIndex] = temp;
            } else {
            System.out.println("Недостаточно значений в массиве для подмены");
        }
        System.out.println("\nПосле подмены:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nmax negative = " + arr[maxNegIndex] + " index: " + maxNegIndex);
        System.out.println("min positive = " + arr[minPosIndex] + " index: " + minPosIndex);
    }
}