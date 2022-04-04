package Array;

import java.util.Arrays;

public class MultidimensionalArray {
	
	static int [] [] a= {{1,2,3},{4,5,6,7},{8}};
	static int [] [] b;
	public static void main(String[] args) {
		b=new int[2] [4];
		System.out.println(a [1][3]);
		System.out.println(a[2][0]);
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(b[i][j]);
			}
		}
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++)
		
			System.out.println(a[i][j]);
		}
	
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.deepToString(a));
}
}
