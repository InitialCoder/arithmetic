package arithmetic;

import util.CommonUtil;

public class Insertion {
	
	public static void main(String[] args) {
		Insertion insert=new Insertion();
		int n=100000;
//		int[] arr=CommonUtil.getRang(0, 10000, n);
		int[] arr=CommonUtil.getRangNearOrder(0, 10000, n);
		int[] arr1=arr.clone();
		int[] arr2=arr.clone();
		long start=System.currentTimeMillis();
		insert.commonInsert(arr);
		System.out.println("commonInsert : "+(System.currentTimeMillis()-start));
		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("------------------------");
		long start1=System.currentTimeMillis();
		insert.betterInser(arr1);
		System.out.println("betterInsert : "+(System.currentTimeMillis()-start1));
		for (int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("-------shellSort-------------");
		long start2=System.currentTimeMillis();
		insert.shellInser(arr2);
		System.out.println("betterInsert : "+(System.currentTimeMillis()-start2));
		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i]+" ");
		}
	}
	
	public void commonInsert(int[] arr){
		for(int i=0,n=arr.length;i<n;i++){
			for(int j=i;j>0&&arr[j]<arr[j-1];j--){
				CommonUtil.swap(arr, j, j-1);
			}
		}
	}
	
	/**
	 * 优化的插入排序
	 * @param arr
	 */
	public void betterInser(int[] arr){
		int tem;
		for(int i=0,n=arr.length;i<n;i++){
			tem=arr[i];
			int j;
			for(j=i;j>0&&tem<arr[j-1];j--){
				arr[j]=arr[j-1];
			}
			arr[j]=tem;
		}
	}
	/**
	 * 优化的插入排序
	 * @param arr
	 * @throws Exception 
	 */
	public void betterInser1(int[] arr,int l,int r) throws Exception{
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
	
	/**
	 * 希尔排序
	 * @param arr
	 */
	public void shellInser(int[] arr){
		
		int n=arr.length;
		int d=n;
		while(true){
			d=d/2;
			int tem;
			for(int i=0;i<n;i+=d){
				tem=arr[i];
				int j;
				for(j=i;j>0&&arr[j-d]>tem;j-=d){
					arr[j]=arr[j-d];
				}
				arr[j]=tem;
				/*for(int j=i-d;j>=0&&arr[j]>arr[j+d];j-=d){
					CommonUtil.swap(arr, j, j+d);
				}*/
				
			}
			
			if(d==1){
				break;
			}
		}
		
	}
}