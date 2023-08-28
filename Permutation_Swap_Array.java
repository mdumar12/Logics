import java.util.Arrays;

public class Permutation_Swap_Array {

	public static void main(String[] args) {
		String arr[]= {"a","b","c"};
		int len=arr.length,mul=1;
		while(len!=0) {
			mul*=len--;
		}
		while(mul != 0) {
			for(int i=1;i<arr.length;i++) {
				mul--;
				String temp=arr[i];
				arr[i]=arr[0];
				arr[0]=temp;
				System.out.print(Arrays.toString(arr)+" ");
			}
		}
	}

}
