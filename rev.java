public class rev{
     //reverse function
	static void rverseArray(int arr[], int start,int end){
		int temp;
		while(start<end){
			temp=arr[start];
			arr[start]=arr[end];
            arr[end]=temp;
			start++;
			end--;
		}
	}
    
	static void printArray(int arr[],int size){
	
	for(int i=0; i<arr.length;i++){
    System.out.print(arr[i]+" ");

	}
	System.out.println();
}
public static void main(String args[]){
	int arr[]={1,2,3,4,5};
	printArray(arr,5);
	rverseArray(arr,0,4);
	System.out.print("Reverce array is \n" );
	printArray(arr, 5);

}

}