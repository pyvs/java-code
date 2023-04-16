package DateStruct01;
//二维数组转为稀疏数组
public class sparseArr01
{
    public static void main(String[] args)
    {
        int arr1[][] = new int[11][11];
        arr1[1][2] = 1;
        arr1[2][3] = 2;
        arr1[5][6] = 2;
        //sum是数组中不同于0的总个数
        int sum = 0;
        System.out.println("原始的二维数组：");
        for (int i = 0; i < arr1.length; i++)
        {
            for(int j = 0;j < arr1[i].length;j++)
            {
                if(arr1[i][j] != 0)
                {
                    sum++;
                }
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("sum ="+sum);

        int sparsearr[][] = new int[sum +1][3];
        //稀疏数组的第一行的值定义完成
        sparsearr[0][0] = 11;
        sparsearr[0][1] = 11;
        sparsearr[0][2] = sum;
        //稀疏数组的第几行的表示
        int count = 0;
        for (int i = 0; i < arr1.length; i++)
        {
            for(int j = 0;j < arr1[i].length;j++)
            {
                if(arr1[i][j] != 0)
                {
                    count++;
                   sparsearr[count][0] = i;
                   sparsearr[count][1] = j;
                   sparsearr[count][2] = arr1[i][j];
                }
            }
        }
        System.out.println("稀疏数组的表示：");
//        for(int i = 0;i < sparsearr.length;i++)
//        {
//            for(int j = 0;j < sparsearr[i].length;j++)
//            {
//                System.out.print(sparsearr[i][j]+" ");
//            }
//            System.out.println();
//        }
        for(int i = 0;i < sparsearr.length;i++)
        {
            System.out.printf("%d\t%d\t%d\t",sparsearr[i][0],sparsearr[i][1],sparsearr[i][2]);
            System.out.println();
        }
        //将稀疏数组恢复为二维数组
        int arr2[][] = new int[sparsearr[0][0]][sparsearr[0][1]];
        for(int i = 1;i < sparsearr.length;i++)
        {
            arr2[sparsearr[i][0]][sparsearr[i][1]] = sparsearr[i][2];
        }
        System.out.println("恢复后的二维数组：");
        for (int i = 0; i < arr2.length; i++)
        {
            for(int j = 0;j < arr2[i].length;j++)
            {
                System.out.print(arr2[i][j] +" ");
            }
            System.out.println();
        }
    }
}
