//mohamed abd elgleel sayed
//sec 2
// ben 15
package medo;
public class medo {
   

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int target =14;
	
				  for (int i = 0; i < arr.length; i++) {
				        for (int j = i + 1; j < arr.length; j++) {
				            if (arr[j] == target - arr[i])
				            {
				            	System.out.println(i);
				            	System.out.println(j);
				            	System.exit(0);
				            }
		              }
		            }
	}

}
