	
	   public static ArrayList<Integer> heap(){
//		   heapify(a, a.length);
		   Integer a[]={9,3,4,6,1};
		   List<Integer> l=Arrays.asList(a);
		   PriorityQueue<Integer> p=new PriorityQueue<>(l);
		  ArrayList<Integer> s=new ArrayList<>();
		  for(int i=0;i<l.size();i++){
			 Integer t= p.peek();
			 p.poll();
			 s.add(t);
		  }
		   
		   
		return s;
		   
	   }
