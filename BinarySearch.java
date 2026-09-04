import java.io.*;
import java.util.Arrays;

import javax.swing.text.html.parser.Element;
class BinarySearch{
    int binarySearch(int arr[], int x)
   
    // x is search element 
    {
      Arrays.sort(arr);
     int l=0, r=arr.length-1;
     while(1<=r){
        int m=l+(r-1)/2;
        if(arr[m]==x)
             return m;
        if(arr[m]<x)
           return l=m+1;
    else
    r=m-1;
     }
    return -1;
    }


public static void main (String args[]){
    
  BinarySearch ob =new BinarySearch();
  int arr[]={4,2,6,10,8};

  int n=arr.length;
  int x=8;
  int result=ob.binarySearch(arr,x);
  if (result==-1)
  System.out.println("Element is not present in array");
  else
  System.out.println("Elemnt prasent at"+ " " + result);
}
}

