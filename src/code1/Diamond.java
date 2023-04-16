package code1;
import java.util.Scanner;
public class Diamond
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入菱形的层数：");
        int N = input.nextInt();
        System.out.println(N+"层菱形的形状为：");
        for(int i = 0;i < N / 2 + 1;i++)
        {
            for(int j = 0;j < N / 2 -i;j++)
            {
                System.out.print(" ");
            }
            for(int k = 0;k < 2*i+1;k++)
            {
                    System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i < N / 2 + 1;i++)
        {
            for(int j = 0;j < i;j++)
            {
                System.out.print(" ");
            }
            //菱形下半部分的*的个数，对此处的代码逻辑较为模糊！
            for(int k = 2 * (N / 2 - i)+1;k > 0;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
