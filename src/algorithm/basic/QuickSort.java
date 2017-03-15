package algorithm.basic;


/**
 * @author miss cassie
 * ���������Ч����ͬΪO(N*logN)�ļ������򷽷���Ч�ʽϸ�
 * ���õ�˼���Ƿ��η�
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
			//����key��������ĺ��沿��
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
				//����key���������ǰ�沿��
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
		
		//��������������Ϊ1����ֹͣ�ݹ�
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
