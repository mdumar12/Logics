import java.util.Arrays;

public class Sorting_with_one_for_loop
{
	public static void main(String[] args) {
	    int arr[]={1,4,1,2};
		for(int i=0,j=i+1;i<arr.length && j<arr.length;j++){
		    if(arr[i]>=arr[j]){
                arr[j]=arr[j]+arr[i];
                arr[i]=arr[j]-arr[i];
                arr[j]=arr[j]-arr[i];
            }
            if(j==arr.length-1){
              i++;  
              j=i;
            }
            System.out.println(Arrays.toString(arr));
        }
	}
}
