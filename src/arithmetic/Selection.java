package arithmetic;

import util.CommonUtil;

public class Selection{
	
	
	public static void main(String[] args) {
		int n=4;
		int[] arr=CommonUtil.getRang(0, 100, n);
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("---------------");
		Selection sel=new Selection();
		sel.selectSort(arr);
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
	}
	
	public void selectSort(int[] arr){
		int index;
		for(int i=0,n=arr.length;i<n;i++){
			index=i;
			for(int j=i;j<n;j++){
				if(arr[j]<arr[index]){
					index=j;
				}
			}
			if(index!=i);
			CommonUtil.swap(arr, i, index);
		}
	}
}
