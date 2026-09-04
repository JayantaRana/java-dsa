public class Max_min{
	public  static void main(String args[]){
		int a[]={80,56,2,3,69};
	int max=a[0];
	int i;
      for(i=0;i<a.length;i++){
      if(a[i]>max){
      max=a[i];
   }
}
System.out.println("Max element " +max);

	int min=a[0];
		
       for(i=0;i<a.length;i++){
        if(a[i]<min){
         min=a[i];
         }
      }
	   System.out.println("Min element " +min);
	}
}