package S;

import java.util.Scanner;

public class Main {
	// 找出一个数组中只出现过一次的数字
	public static char FirstNotRepeatingChar(String str) {

		char[] arr = str.toCharArray();
		int len = arr.length;
		
		int size=256;
		int[] hashtable = new int[256];


		for (int i = 0; i < len; i++) {
			hashtable[arr[i]]++;
		}

		for (int i = 0; i < len; i++) {
			if (hashtable[arr[i]] == 1) {
				return arr[i];
			}
		}
		return 0;
	}
  public static void main(String[] args) {
	  String s="asdfasdg";
	  char a=FirstNotRepeatingChar(s);
	  System.out.println(a);
}
}
