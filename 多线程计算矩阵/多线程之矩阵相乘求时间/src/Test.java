public class Test {

   public static void main(String args[]) {
      
   
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
            
            OperateMatrix om = new OperateMatrix(a,b);                //实例化OperateMatrix对象
            
            //根据第一个矩阵的行数，启动对应数量的线程
            long begin = System.nanoTime();
            for( int i = 0; i < 4; i++ ) {
                
                new ThreadOperate( om,"计算第一个矩阵的第" + (i+1) + "行*第二个矩阵的所有列" ).start();
            }
            long end = System.nanoTime();
            System.out.println(end-begin);
            
    
           
            
        }
        
   
   
   //打印计算结果（为了方便，将打印方法定义在测试类中，实际不应该这样做）
  /* public static void display(int[][] result) {
       
       for( int i = 0; i < result.length; i++ ) {
           
           for( int j = 0; j < result[i].length; j++ ) {
               
               System.out.print( result[i][i] + "\t" );
           }
           
           System.out.println();
       }
   }*/
  
}
