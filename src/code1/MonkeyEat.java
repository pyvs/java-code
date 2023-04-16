package code1;

public class MonkeyEat
{
    public static void main(String[] args)
    {
        test2 t2 = new test2();
        int N = t2.Peache(1);
        if(N == -1)
        {
            System.out.println("输入的值有错误！");
        }else
        {
            System.out.println("第1天有"+N+"个桃子");
        }
    }
}
class test2
{
    public int Peache(int day)
    {
        if(day == 10)
        {
            return 1;
        } else if (day >= 1 && day <=9)
        {
            return (Peache(day+1) + 1)*2;
        }else
        {
            return -1;
        }
    }
}
