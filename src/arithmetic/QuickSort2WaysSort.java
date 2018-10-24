package arithmetic;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import util.CommonUtil;
/**
 * 快速排序 的双路排序：从数组两边一起向中间进行区分两部分的元素，，主要解决重复出现相同元素时快速排序变慢的情况
 * @author wu
 *
 */
public class QuickSort2WaysSort {

	public void sort(int[] arr){
		
		quickSort(arr,0,arr.length-1);
	}
	public void quickSort(int[] arr,int l,int r){
		
		//小优化：小于16个元素时使用插入排序算法
		if(r-l<=15){
			CommonUtil.betterInser(arr, l, r);
			return ;
		}
			
		int p=partition(arr,l,r);
		quickSort(arr, l, p-1);
		quickSort(arr, p+1,r);
	}

	private int partition(int[] arr,int l,int r){
		//优化思路：快速排序在数据近乎有序的时候时间复杂度趋向n方级别，因为分区的时候会导致数据几乎只在一边，递归的层级变深了。
		//	 	通过随机获取参考的界限使得每次递归时左右树的平衡
		CommonUtil.swap(arr, l, (int)(Math.random()*(r-l+1))+l);
		int v=arr[l];
		int i=l+1,
			j=r;
		while(true){
			while( i<r&&arr[i]<v)i++;
			while( j>l+1&&arr[j]>v)j--;
			if(i>j)break;
			CommonUtil.swap(arr, i, j);
			i++;
			j--;
		}
		CommonUtil.swap(arr, l, j);
		return j;
	}
	
	
	
	public static void main(String[] args) {
		int n=10000000;
		int m=10;
		int[] arr = CommonUtil.getRang(1,100000, n);
		int[] arrr=arr.clone();
		
		int[] arr1 = CommonUtil.getRang(1, 100, n);
		int[] arr11=arr1.clone();
		QuickSort2WaysSort sort2=new QuickSort2WaysSort();
		QuickSort sort=new QuickSort();
		/*
		long t1=System.currentTimeMillis();
		sort.sort(arr1);
		long t2=System.currentTimeMillis();
		sort2.sort(arr11);
		long t3=System.currentTimeMillis();
		System.out.println(" sort  repeatArr :"+(t2-t1));
		System.out.println(" sort2  repeatArr :"+(t3-t2));*/
		
		long t4=System.currentTimeMillis();
		sort.sort(arr);
		long t5=System.currentTimeMillis();
		sort2.sort(arrr);
		long t6=System.currentTimeMillis();
		
		System.out.println(" sort  CommontArr :"+(t5-t4));
		System.out.println(" sort1  CommontArr :"+(t6-t5));
		
	}
}
