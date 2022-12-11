package com.epam.mjc.stage0;

public class ArrayTasks {
    public String[] seasonsArray() {
        String[] seasons = new String[]{"winter", "spring", "summer", "Autumn"};
        return seasons;
    }
    public int[] generateNumbers(int length) {
        int[] givenNumbers = new int[length];
        for(int i = 0;i<length;i++){
            givenNumbers[i] = i + 1;
        }
        return givenNumbers;
    }
    public int totalSum(int[] arr) {
        int sumNumbers = 0;
        for(int i : arr){
            sumNumbers += i;
        }
        return sumNumbers;
    }
    public int findIndexOfNumber(int[] arr, int number) {
        int x = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]==number) {
                x = i;
                break;
            }
        }
        return x;
    }
    public String[] reverseArray(String[] arr) {
        String[] newString = new String[arr.length];
        int x = 0;
        for(int i = arr.length-1; i >= 0; i--){
            newString[x] = arr[i];
            x++;
        }
        return newString;
    }
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int[] newInt1 = new int[0];
        for (int i : arr){
        if (i > 0){
            if (newInt1.length > 0){
                int[] AdditionArrayForNewInt = new int[newInt1.length + 1];
                AdditionArrayForNewInt[AdditionArrayForNewInt.length - 1] = i;
                System.arraycopy(newInt1, 0 , AdditionArrayForNewInt, 0, newInt1.length);
                newInt1 = AdditionArrayForNewInt;
            } else {
                newInt1 = new int[1];
                newInt1[0] = i;
                }
            }
        }
        return newInt1;
    }
    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        return arr;
    }
}
