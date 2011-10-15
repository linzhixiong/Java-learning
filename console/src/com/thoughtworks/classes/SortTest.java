package com.thoughtworks.classes;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 10/15/11
 * Time: 4:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class SortTest {

    @Test
    public void shouldReturnOrderNumber() throws Exception {
        int[] before = {0,2,2,3,234,43443,434,3,4,34,3,4,34,34,3,4,34,3,4,34343,4,34,34,3,434,34,3,4,3,4,34,344,34,34,3,4,34,34,3,4,7,3234,43,4343,4,3,4,34,34,3,4,34,3,4,34,3,4,34,3,4,3,43,43,4,25,43,5,3,65,2,34,2,3,2,4,3,53432343,4,34,3,42,34,2,34,24,2,42,4,234,2,4,24,3,4,243,2,443242,34,2,423424,24,2,4,24,54,2,34,2,34,2,332,2344,323,434235,556,56,565,6,5634,2312321,31};
        QuickSort.sort(before);
        for (int i = 0; i < before.length; i++) {
            System.out.println(before[i]);
        }

    }
}
