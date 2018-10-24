package arithmetic;

import util.CommonUtil;

class Test{
	
	public static void main(String[] args) {
		MergeSort sort1=new MergeSort();
		MergeSortBU bu=new MergeSortBU();
		QuickSort qs=new QuickSort();
		int n=1000000;
		int[] arr=CommonUtil.getRang(100, 110, n);
//		int[] arr=CommonUtil.getRangNearLyOrder(n, 1);
		int[] arr1=arr.clone();
		int[] arrqs=arr.clone();
				
		long t1=System.currentTimeMillis();
		sort1.sort(arr);
		long t2=System.currentTimeMillis();
		bu.sort(arr1);
		long t3=System.currentTimeMillis();
		System.out.println("tem 1-----------"+(t2-t1));
		System.out.println("tem 2------------"+(t3-t2));
		
		long qt=System.currentTimeMillis();
		qs.sort(arrqs);
		long qt1=System.currentTimeMillis();
		System.out.println(qt1-qt);
	}
}
