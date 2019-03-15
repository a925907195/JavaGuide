package com.fjsh.interview.sort;

import com.sun.deploy.util.ArrayUtil;

/**
 *
 * @Author: <fujiansheng@meituan.com> 
 * @Description：
 * @Date: Created in :2019-03-15 20:40  
 * @Modified by:
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{100,2, 4, 8, 1, 9, 3,0};
        sort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void sort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = find(array,start,end);
        sort(array, start, mid - 1);
        sort(array, mid+1, end);
    }

    public static int find(int[] array, int start, int end) {
       if(start>=end){
           return start;
       }
       int starIndex=start;
       int endIndex=end;
       int hole=start;
       while (starIndex<endIndex){
           while (array[hole]<array[endIndex]&&starIndex<endIndex){
               endIndex--;
           }
           if(starIndex<endIndex){
               int tem=array[hole];
               array[hole]=array[endIndex];
               array[endIndex]=tem;
               hole=endIndex;
           }
           while (array[hole]>array[starIndex]&&starIndex<endIndex){
               starIndex++;
           }
           if(starIndex<endIndex){
               int tem=array[hole];
               array[hole]=array[starIndex];
               array[starIndex]=tem;
               hole=starIndex;

           }
       }
       return starIndex;
    }
}