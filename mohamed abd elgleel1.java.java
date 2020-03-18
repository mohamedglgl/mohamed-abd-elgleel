
 //mohamed abd elgleel sayed
//sec 2
//BN 15

package glgl2;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class java {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6,7,8,9,9};
		int s1 = arr1.length;
		int s2 = arr2.length;
		int[] res =new int [s1+s2];
		int i = 0 ;   int g = 0 ;   int f = 0 ;
		while (i<s1 && g<s2)
		{
			if (arr1[i] < arr2[g])
			{
				res[f]= arr1[i];
				i++;   f++;
			}
			else
			{
				res[f]= arr2[g];
				g++;   f++;
			}
		}
		while(i<s1)
			res[f++]= arr1[i++];
		while(g<s2)
			res[f++]= arr2[g++];
		System.out.print("res =");
		for (int x=0 ; x < res.length ; x++)
		{
			System.out.print(" "+res[x]);
		}
	}

}

