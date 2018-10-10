package arithmetic;

import util.CommonUtil;

/**
 * 自低向上的归并排序
 *基本思路：将数组分别按成2 4 8 16...（2的幂次方数组） 个数的数组进行归并 排序
 *缺点：双for循环不好优化，效率比自顶向下的效率稍微弱，当N很大时效率才会有所提升
 * @author wu
 *
 */
public class MergeSortBU {

	
	public void sort(int[] arr){
		int n=arr.length;
		for(int sz=1;sz<=n;sz+=sz){
			for(int i=0;i+sz<n;i+=sz+sz){//i+sz 是为保证右边数组一定存在，并且不会越界
				mergeInto(arr, i, i+sz-1, CommonUtil.min(i+2*sz-1, n-1));//i+2*sz-1  可能会产生越界问题
			}
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
	
	public static void main(String[] args) {
		int[] arr=CommonUtil.getRang(100, 10000, 4);
		MergeSortBU bu=new MergeSortBU();
		bu.sort(arr);
	}
}
