public static int[] maxWindow(int[] n, int k) {
		int c = 0;
		LinkedList<Integer> q = new LinkedList<>();// 保存最大下标
		int[] res = new int[n.length - k + 1];
		for (int i = 0; i < n.length; i++) {
			while (!q.isEmpty() && n[q.peekLast()] <= n[i]) {
				
				//q里保存的下标的小于当前值 删除它的下标
				
				q.pollLast();
			}
			//如果都添加进来说明他是递减的
			q.addLast(i);
			if (q.peekFirst() == i - k) {//判断他的下标有没有过期   i-k 3-3=0？ 过期删除
				q.pollFirst();
			}
			if (i >= k - 1) { //i>k-1 添加
				res[c++] = n[q.peekFirst()];
			}
		}
		return res;

	}
