package code1;
import java.util.Scanner;
public class Pyramid
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入层数：");
        int N = input.nextInt();
        System.out.println(N+"层金字塔的形状为：");
        for (int i = 1; i <= N; i++)
        {
            //每一行的空格数
            for(int k = 0;k < N-i;k++)
            {
                System.out.print(" ");
            }
            //每一行的*的个数
            for(int j = 1;j <= 2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
