package util;

import java.util.Random;

public class CommonUtil {
	
	public static int[] getRang(int left,int right,int n){
		if(right<left) return null;
		Random rd=new Random();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=rd.nextInt(right-left)+left;
		}
		return arr;
	}
	
	public static int[] getRangNearOrder(int left,int right,int n){
		if(right<left) return null;
		Random rd=new Random();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=rd.nextInt(right-left)+left;
			if(i>0&&(arr[i]<arr[i-1]))
				swap(arr,i,i-1);
		}
		return arr;
	}
	
	/**
	 * 元素交互
	 * @param arr
	 * @param i
	 * @param j
	 */
	public static void swap(int[] arr, int i,int j){
		//这种换发 当arr[i]==arr[j] 时会变成0
		arr[i]=arr[i]+arr[j];//5=3+2
		arr[j]=arr[i]-arr[j];//2=5-3
		arr[i]=arr[i]-arr[j];//3=5-2
	}
	
	public static int min(int i,int j){
		if(i>j){
			return j;
		}else{
			return i;
		}
	}
	/**
	 * 优化的插入排序
	 * @param arr
	 * @throws Exception 
	 */
	public static void betterInser(int[] arr,int l,int r) throws Exception{
		if(l>r){
			throw new Exception("r mast larger then l");
		}
		int tem;
		for(int i=l;i<=r;i++){
			tem=arr[i];
			int j;
			for(j=i;j>l&&tem<arr[j-1];j--){
				arr[j]=arr[j-1];
			}
			arr[j]=tem;
		}
	}
	public static void main(String[] args) {
		int[] arr={3,3};
		CommonUtil.swap(arr, 0, 0);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
	}
}
