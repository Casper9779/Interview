package sort;

import java.util.Arrays;

public class sort {
	public static int[] bubble(int a[]) {
		for (int i = a.length - 1; i > 0; i--) {
			// 扫描次数
			int falg = 0;
			for (int j = 0; j < i; j++) {
				// 交换次数 从左至右
				if (a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
					falg++;
				}
			}
			if (falg == 0)
				break;
		}
		return a;
	}

	public static int[] select(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}

		return a;

	}

	public static int[] insert(int a[]) {
		for (int i = 1; i < a.length; i++) {
			int tmp = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > tmp) {
				a[j + 1] = a[j];// 把所有值往后推一个
				j--;
			}
			a[j + 1] = tmp;// 把最小的元素放第一个
		}

		return a;

	}

	// 先从数列中取出一个数作为基准数
	//
	// 2、分区过程，将比这个数大的数全放到它的右边，小于或等于它的数全放到它的左边
	//
	// 3、再对左右区间重复第二步，直到各区间只有一个数
	public static int[] quick(int a[], int left, int right) {
	    if(left>right) return null;
		int low = left;
		int high = right;
//		int temp = 0;
//		if (l <= r) {
//			temp = a[l];
//			while (l != r) {// 从两边交替扫描，直到left=right
//
//				while (r > l && a[r] >= temp)
//					r--;// 从右到左 找到第一个比基准元素小的元素
//				a[l] = a[r];
//				while (l < r && a[l] <= a[r])
//					l++;
//				a[r] = a[l];
//
//			}
//           a[r]=temp;
//           quick(a, left, l-1);
//           quick(a, r+1, right);
//		}

		int key=a[left];
		while(low<high){
			while(low<high&&a[high]>key){
				--high;
			}
			a[low]=a[high];
			while(low<high&&a[low]<key){
				++low;
			}
			a[high]=a[low];
		}
		    a[low]=key;
		    quick(a, left, low-1);
		    quick(a, low+1, right);
		    
		return a;

	}
	
	  private static int number=0;
	public static void MergeSort(int[] a) {  
        // TODO Auto-generated method stub  
        System.out.println("开始排序");  
        Sort(a, 0, a.length - 1);  
    }  
  
    static void Sort(int[] a, int left, int right) {  
        if(left>=right)  
            return;  
      
        int mid = (left + right) / 2;  
        //二路归并排序里面有两个Sort，多路归并排序里面写多个Sort就可以了  
        Sort(a, left, mid);  
        Sort(a, mid + 1, right);  
        merge(a, left, mid, right);  
  
    }  
  

    private static void merge(int[] a, int left, int mid, int right) {  
      
        int[] tmp = new int[a.length];  
        int r1 = mid + 1;  
        int tIndex = left;  
        int cIndex=left;  
        // 逐个归并  
        while(left <=mid && r1 <= right) {  
            if (a[left] <= a[r1])   
                tmp[tIndex++] = a[left++];  
            else  
                tmp[tIndex++] = a[r1++];  
        }  
            // 将左边剩余的归并  
            while (left <=mid) {  
                tmp[tIndex++] = a[left++];  
            }  
            // 将右边剩余的归并  
            while ( r1 <= right ) {  
                tmp[tIndex++] = a[r1++];  
            }  
             
            System.out.println("第"+(++number)+"趟排序:\t");  
            // TODO Auto-generated method stub  
            //从临时数组拷贝到原数组  
             while(cIndex<=right){  
                    a[cIndex]=tmp[cIndex];  
                    //输出中间归并排序结果  
                    System.out.print(a[cIndex]+"\t");  
                    cIndex++;  
                }  
             System.out.println();   
        }  
    
   

}
