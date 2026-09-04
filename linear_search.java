class linear_search{
    public static int linearSearch(int arr[], int key){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==key){
            return i;
            }
        }
        return -1;
    
    }
    public static void main(String args[]){
      int array[]={23,54,2,87,9};
      //int key=2;
     // int value = linearSearch(array, 9);
      System.out.println(" key is found at index  " +linearSearch(array, 54));
    }
}