package algorithm.basic;


/**
 * @author miss cassie
 * 快速排序的效率在同为O(N*logN)的几种排序方法中效率较高
 * 采用的思想是分治法
 */
public class QuickSort {
	
	public void quicksort(int[] nums, int left, int right){
		
		if(nums.length == 0)
			return;
		
		boolean flag = true;
		int i = left;
		int j = right;
		int key = nums[i];
		
		while(i != j){
			//先用key遍历数组的后面部分
			if(flag){
				if(key > nums[j]){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					flag = false;
				}
				else{
					j--;
				}
			}
			else{
				//再用key遍历数组的前面部分
				if(key < nums[i]){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					flag = true;
				}
				else{
					i++;
				}
			}
		}
		
		//若输入的数组个数为1，则停止递归
		if(i > left)
    	  quicksort(nums,left,i-1);
		if(right > j)
		  quicksort(nums,j+1,right);
	
	}
	
	public static void main(String[] args){
	
		QuickSort qs = new QuickSort();
		int[] nums = {48,15,24,59,64,79,97,40};
		qs.quicksort(nums, 0, 7);
		for(int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
		}
	}
 
}// end of class
