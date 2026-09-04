//5--->101--->count 1

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Practice {
    public static void positive(int arr[]) {
       boolean posArray[]= new boolean[arr.length+1];
       for(int i=0;i<arr.length;i++){
        if(arr[i]>0 && i<=arr.length){
             posArray[arr[i]]=true;
        }
       }

    }

    public static void main(String args[]) {
     int arr[]={-1,1,3,4};
 positive(arr);
    }
}
