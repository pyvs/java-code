package SortAlgorithm;

import java.util.Arrays;

/**
 * @author:LZH
 * @date:2023/4/14
 * @motto:路的尽头还是路，山的那边还是山！
 */
public class BubbleSort01
{
    public static void main(String[] args)
    {
        //从小到大排列
        int arr[] = {12,35,25,16,10,8,67,34};
        int temp;
        //加一个标签进行判断是否前两次就排好序
        boolean flag = true;
        for(int i = 0;i < arr.length - 1;i++)
        {
            //内层循环将两个相邻的数据进行比较，进行交换位置
            for (int j = 0; j < arr.length - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])//将>改为<即可进行从大到小的排列
                {
                    flag = false;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(flag)
            {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
