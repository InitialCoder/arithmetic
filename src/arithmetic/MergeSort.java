package arithmetic;

import util.CommonUtil;

/**
 * 自顶向下的归并排序：递归
 * @author wu
 *
 */
public class MergeSort{
	
	
	public static void main(String[] args) {
		int n=40000;
		int [] arr=CommonUtil.getRang(0, 100, n);
		int [] arr1=arr.clone();
		MergeSort sort=new MergeSort();
		long st=System.currentTimeMillis();
		sort.sort(arr);
		long t1=System.currentTimeMillis();
		System.out.println(t1-st);
		long t2=System.currentTimeMillis();
		sort.betterSort(arr1);
		long t3=System.currentTimeMillis();
		System.out.println(t3-t2);
		
		
		
		/*for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}*/
		
	}
	
	public void sort(int[] arr){
		
		merge(arr,0,arr.length-1);
		
	}
	/**
	 * 数据量少的时候可以达的到明显的效果
	 * @param arr
	 */
	public void betterSort(int[] arr){
		
		beterMerge(arr,0,arr.length-1);
		
	}

	private void merge(int[] arr, int r, int l) {
		
		if(r>=l){
			return ;
		}
		int mid=(r+l)/2;
		merge(arr,r,mid);
		merge(arr,mid+1,l);
		mergeInto(arr,r,mid,l);
	}
	
	/**
	 * 插入排序的优化
	 * @param arr
	 * @param r
	 * @param l
	 */
	private void beterMerge(int[] arr, int r, int l) {
		

		if(l-r<15){
			//使用插入排序，因为数组越小时越近乎有序，此时调用插入排序会有更好的效果
			try {
				CommonUtil.betterInser(arr, r, l);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ;
		}
		int mid=(r+l)/2;
		merge(arr,r,mid);
		merge(arr,mid+1,l);
		if(arr[mid]>arr[mid+1]){//上面的归并过程已经保证r到mid  是有序的，mid+1到l也是有序的，所以真正需要排序的情况下是mid下标的数比mid+1 下标的数大的时候
			mergeInto(arr,r,mid,l);
		}
	}

	private void mergeInto(int[] arr, int r, int mid, int l) {
		int[] temArr=new int[l-r+1];
		for(int i=r;i<=l;i++){
			temArr[i-r]=arr[i];
		}
		
		int j=r;//左边下标
		int k=mid+1;//右边下标
		for(int i=r;i<=l;i++){
			if(j>mid){
				arr[i]=temArr[k-r];
				k++;
			}else if(k>l){
				arr[i]=temArr[j-r];
				j++;
			}else if(temArr[j-r]>temArr[k-r]){
				arr[i]=temArr[k-r];
				k++;
			}else{
				arr[i]=temArr[j-r];
				j++;
			}
		}
	}
	
}