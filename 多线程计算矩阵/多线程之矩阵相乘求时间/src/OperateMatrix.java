
public class OperateMatrix {
 
     int[][] matrix1 = null;        //第一个矩阵
     int[][] matrix2 = null;        //第二个矩阵
     int[][] result = null;        //存放矩阵相乘结果
     public static int line = 0;    //记录当前参与计算的是第一个矩阵的第几行
     
     //定义构造方法
     public OperateMatrix() {}
     
     public OperateMatrix(int[][] m1,int[][] m2) {
         
         this.matrix1 = m1;
         this.matrix2 = m2;
         result = new int[matrix1.length][matrix2[0].length];
     }
     
     //返回矩阵相乘的结果
     public int[][] getResult() {
         
         try {
             
             /*
              * 当矩阵还没有完全计算完时
              * 令当前线程睡眠1毫秒等待
              * 然后再次判断
              * 
              * */
             while( OperateMatrix.line < matrix1.length ) {
                 
                 Thread.sleep(1);
                 
             }
         }catch(Exception e) {
             
             e.printStackTrace();
         }
         
         return this.result;
         
     }
     
     //第一个矩阵的行乘以第二个矩阵的列，得到新矩阵的行
     public void operate() {
         for(int k=0;k<25;k++){
        	 
        	 OperateMatrix.line += 1;            //记录行数加1
        	 
        	 for( int i = 0; i < matrix1[0].length; i++ ) {
        		 
        		 int sum = 0;        //存储第一个矩阵的行和 第二个矩阵的列的计算结果
        		 for( int j = 0; j < matrix2.length; j++ ) {
        			 
        			 sum += matrix1[OperateMatrix.line - 1][j] * matrix2[j][i];        //第一个矩阵的当前行乘以第二个矩阵
        		 }
        		 
        		 result[OperateMatrix.line - 1][i] = sum;        //保存结果
        	 }
         }
         
         
     
     }
 }