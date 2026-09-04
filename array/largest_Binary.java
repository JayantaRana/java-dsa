// find largest number of an array using binary search

public class largest_Binary {
public int findMax (int arr[], int low, int high){

    if(low == high){
       return arr[low];
    }
    if((high==low+1) && arr[low]>= arr[high]){
        return arr[low];
    }
     if((high==low+1) && arr[low]<arr[high]){
        return arr[high];
    }
    int mid=(low+high)/2;

}

public  static void main(String args[]){

}
    
}
