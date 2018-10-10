package arithmetic;

import util.CommonUtil;

public class BubblingSort{
	
	public static void main(String[] args) {
		
		BubblingSort sort=new BubblingSort();
		int n=40;
		int[] arr=CommonUtil.getRang(0, 100, n);
		sort.bubblingSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public void bubblingSort(int[] arr){
		
		for(int i=0,n=arr.length;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1])
					CommonUtil.swap(arr, j, j+1);
			}
		}
		
	}
	
	
}