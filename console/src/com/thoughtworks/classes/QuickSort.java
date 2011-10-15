package com.thoughtworks.classes;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 10/15/11
 * Time: 4:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class QuickSort {
    public static int partition(int before[], int low, int high) {
        int key = before[low];
        while (low < high) {
            while (low < high) {
                if (before[high] < key) {
                    switchNumber(before, high, low);
                    break;
                }
                high--;
            }
            while (low < high) {
                if (before[low] > key) {
                    switchNumber(before, low, high);
                    break;
                }
                low++;
            }
        }

        return low;
    }

    private static void switchNumber(int[] before, int first, int second) {
        int temp = before[second];
        before[second] = before[first];
        before[first] = temp;
    }

    public static void sort(int[] before, int low, int high) {
        if (low < high) {
            int mid = partition(before, low, high);
            sort(before, low, mid);
            sort(before, mid + 1, high);
        }
    }


    public static void sort(int[] before) {
        int low = 0;
        int high = before.length - 1;
        sort(before, low, high);
    }

}
