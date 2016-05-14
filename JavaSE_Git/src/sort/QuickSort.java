package sort;

public class QuickSort {
     public int getMiddle(int[] list,int low,int high){
    	int temp = list[low];
    	 while(low < high){
    		 while(low < high && list[high] >= temp){
    			 high--;
    		 }
    		 list[low] =list[high];
    		 while(low < high && list[low] <= temp){
    			 low++;
    		 }
    		 list[high] =list[low];
    	 }
    	 list[low] = temp;
    	 return low;
     }
     
     
     public void quickSort(int[] list,int low,int high){
    	 if(low < high){
    		 int middle = getMiddle(list,low,high);
    		 quickSort(list,low,middle-1);
    		 quickSort(list,middle+1,high);
    	 }
     }
     public void  quick(int[] arr){
    	 if(arr.length > 0){
    		 quickSort(arr,0,arr.length-1);
    		
    	}
    	
    	 
     }
      
     public static void main(String[] args){
      int[]	a={1,3,5,7,9,2,4,6,8,0};
      QuickSort q = new QuickSort();
    	   q.quick(a);
    	   for(int i =0;i < a.length;i++){
       		System.out.println(a[i]);
       	} 
     }
}
