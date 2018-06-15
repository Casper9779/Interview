package S;

import java.util.Scanner;

public class Bit {
	// 找出一个数组中只出现过一次的数字
	public static  void FindNumsAppearOnce(int[] array , int[] n1, int[] n2) {
       
		int bit=0;
		for(int  i=0;i<array.length;i++){
			bit^=array[i];
		}
		int a1=0;
		int a2=0;
		
		int index=Integer.lowestOneBit(bit);
		
		for(int i=0;i<array.length;i++){
			if(isBit(array[i],index)){
				a1^=array[i];
			}else{
				a2^=array[i];
			}
		}
		
		
		n1[0]=a1;
		n2[0]=a2;
		
	}
	private static boolean isBit(int i, int index) {
		// TODO Auto-generated method stub
		return (1<<(index-1)&i)==0?true:false;
	}
	
	public static void main(String[] args) {
		int[] a=new int[]{1,2,3,1,2,3,4,5};
		  int[] n1=new int[1];
		  	int[] n2=new int[1];
		 FindNumsAppearOnce(a,n1,n2);
		System.out.println(n1[0]+ " "+n2[0]);
	}

}
