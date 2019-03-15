package com.fjsh.interview.sort;
/**
 *
 * @Author: <fujiansheng@meituan.com> 
 * @Description：
 * @Date: Created in :2019-03-15 20:13  
 * @Modified by:
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array=new int[]{2,4,8,1,9,3};
        sort(array,0,array.length-1);
        for(int i:array){
            System.out.println(i);
        }
    }
    public static void sort(int[] array,int start,int end){
        if(start>=end){
            return;
        }
        int mid=(end+start+1)/2;
        sort(array,start,mid-1);
        sort(array,mid,end);
        merge(array,start,mid,end);
    }
    public static void merge(int[] array,int start,int mid,int end){
        if(start>=end){
            return;
        }
        int[] arrtem=new int[end-start+1];
        int startem=start;
        int midtem=mid;
        int index=0;
        while (startem<mid&&midtem<=end){
            if(array[startem]<array[midtem]){
                arrtem[index++]=array[startem++];
            }else {
                arrtem[index++]=array[midtem++];
            }
        }
        while (startem<mid){
            arrtem[index++]=array[startem++];
        }
        while (midtem<=end){
            arrtem[index++]=array[midtem++];
        }
        for(int i=start,indextem=0;i<=end;i++,indextem++){
            array[i]=arrtem[indextem];
        }
    }
}
