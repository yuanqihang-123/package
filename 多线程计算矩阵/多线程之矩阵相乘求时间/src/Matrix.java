
import java.util.Scanner;

public class Matrix {

	/* 矩阵相乘 */

	public static int[][] multiplyMatrix(int[][] a, int[][] b) {

		if (a[0].length != b.length) {

			return null;

		}

		int[][] c = new int[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b[0].length; j++) {

				for (int k = 0; k < a[0].length; k++) {

					c[i][j] += a[i][k] * b[k][j];

				}

			}

		}

		return c;

	}

	/* 打印一个矩阵 */

	public static void printMatrix(int[][] c) {

		if (c != null) {

			for (int i = 0; i < c.length; i++) {

				for (int j = 0; j < c[0].length; j++) {

					System.out.print(c[i][j]+"   "); 
					
				}

				System.out.println();

			}

		} else {

			System.out.println("无效");

		}

		System.out.println();

	}

	public static void main(String[] args) {

		/*Scanner input = new Scanner(System.in);

		System.out.println("Input m=");

		int m = input.nextInt();

		System.out.println("Input n=");

		int n = input.nextInt();

		System.out.println("Input k=");

		int k = input.nextInt();*/
		
		int m = 100;
		int n = 100;
		int k = 100;

		int[][] a = new int[m][n]; // 定义一个m*n的矩阵

		int[][] b = new int[n][k]; // 定义一个n*k的矩阵

		/*System.out.println("输入连续的数构成数组a:");*/

		for (int i = 0; i < m; i++)

			for (int j = 0; j < n; j++)

				a[i][j] = (i+1)*(j+1);

		/*System.out.println("输入连续的数构成数组b:");*/

		for (int i = 0; i < n; i++)

			for (int j = 0; j < k; j++)

				b[i][j] = (i+1)*(j+1);
 
		
		long time = 0L ;
		for(int i = 0 ; i < 1000 ; i++){
			long begin = System.nanoTime();
			int[][] c = multiplyMatrix(a, b);
			long end = System.nanoTime();
			time += end-begin;
		}
		

		/*System.out.println("Matrix a:");

		printMatrix(a); // 打印a

		System.out.println("Matrix b:");

		printMatrix(b); // 打印b

		System.out.println("Matrix c:");

		printMatrix(c); // 打印c*/
		
		System.out.println("单线程花费的时间为:");
		
		System.out.println(time/1000);
		
		/*input.close();*/

	}

}
