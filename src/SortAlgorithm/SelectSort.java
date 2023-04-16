package SortAlgorithm;

import java.util.Arrays;
import java.util.Queue;

/**
 * @author:LZH
 * @date:2023/4/14
 * @motto:路的尽头还是路，山的那边还是山！
 */
public class SelectSort
{
    //由简到难，逐步推导，不可能一次性写出
    public static void main(String[] args)
    {
        int arr1[] = {23,12,34,32,56,15,45,33};
        //假设最小的数是第i个
        for(int i = 0;i < arr1.length - 1;i++)//最后一个数据不用参与比较
        {
            int minIndex = i;
            int min = arr1[i];
            for(int j = i + 1;j < arr1.length;j++)
            {
                if(arr1[j] < min)//从大到小排列，改变此处的<为>即可
                {
                    min = arr1[j];
                    minIndex = j;
                }
            }
            //进行判断此数字是否本来就在此位置
            if(minIndex != i)
            {
                arr1[minIndex] = arr1[i];
                arr1[i] = min;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
