package code1;
import java.util.Scanner;
public class Finbonic
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int N = input.nextInt();
        test T1 = new test();
       if(T1.fin(N) == -1)
       {
           System.out.println("输入的值有误！");
       }else
       {
           System.out.println("第"+N+"项的斐波那契数列值为： "+T1.fin(N));
       }
    }
}
class test
{
    public int fin(int n)
    {
        if(n>0)
        {
            if (n == 1 || n == 2)
            {
                return 1;
            } else
            {
                //运用递归的方法解决，一个数=它的前两个数之和
                return fin(n - 1) + fin(n - 2);
            }
        }else
        {
            return -1;
        }
    }
}
