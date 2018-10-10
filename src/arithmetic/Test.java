package arithmetic;

import util.CommonUtil;

class Test{
	
	public static void main(String[] args) {
		MergeSort sort1=new MergeSort();
		MergeSortBU bu=new MergeSortBU();
		int n=50000000;
		int[] arr=CommonUtil.getRang(100, 10000, n);
		int[] arr1=arr.clone();
		
		long t1=System.currentTimeMillis();
		sort1.sort(arr);
		long t2=System.currentTimeMillis();
		bu.sort(arr1);
		long t3=System.currentTimeMillis();
		System.out.println("tem 1-----------"+(t2-t1));
		System.out.println("tem 2------------"+(t3-t2));
		
	}
}
