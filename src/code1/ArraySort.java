package code1;
import java.util.Scanner;
public class ArraySort
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要插入的数字：");
        int insert = input.nextInt();
        int index = 0;
        int arr[] = {12,15,34,78,97};
        for(int i = 0;i < arr.length;i++)
        {
            //插入的数大于数组中的任何数，最大数的下标赋给索引
            if(insert > arr[arr.length - 1])
            {
                index = arr.length;
                break;
            }
            if(insert > arr[i] )
            {
                continue;
            }else
            {
                index = i;
                break;
            }
        }
        int newarr[] = new int[arr.length+1];
        for(int i = 0;i < newarr.length;i++)
        {
            if(i < index )
            {
                newarr[i] = arr[i];
            }else if(i == index)
            {
                newarr[i] = insert;
            }else
            {
                //索引之后的值进行传递
                newarr[i] = arr[i-1];
            }
        }
        for (int i = 0; i < newarr.length; i++)
        {
            System.out.print(newarr[i]+" ");
        }
    }
}
