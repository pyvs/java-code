package code1;
import java.util.Scanner;
public class HollowDiamond
{
    public static void main(String[] args)
    {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("请输入空心菱形的层数：");
        int n = myscanner.nextInt();
        for (int i = 0; i < n / 2 + 1; i++)
        {
            //控制行数
            for (int j = 0; j < n / 2 + 1 - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++)
            {
                if (k == 0 || k == 2 * i)
                {
                    //输出第一颗和最后一颗*
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = n / 2; i >= 0; i--)
        {
            for (int j = n / 2 - i + 1; j > 0; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++)
            {
                if (k == 0 || k == 2 * i)
                {
                    //输出第一颗和最后一颗*
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
