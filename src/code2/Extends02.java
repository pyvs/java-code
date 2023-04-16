package code2;

public class Extends02
{
    public static void main(String[] args)
    {
        bankcard bc = new bankcard();
        creditcard ct = new creditcard();
        System.out.println("初始余额为："+bc.balance);
        System.out.println("用银行卡存1200");
        bc.lodgemoney(1200);
        System.out.println("用银行卡取3600");
        bc.withdrawmoney(3600);
        System.out.println("用银行卡取8900");
        bc.withdrawmoney(8900);
        System.out.println("==============");
        System.out.println("用信用卡存1200");
        ct.lodgemoney(1200);
        System.out.println("用信用卡取3600");
        ct.withdrawmoney(3600);
        System.out.println("用信用卡取3000");
        ct.withdrawmoney(3000);
    }

}
//银行卡类，没有透支额度
class bankcard
{
    public double balance = 5000;
    public void lodgemoney(double lodge)//存钱
    {
        balance += lodge;
        System.out.println("存款成功，当前余额为："+balance);
    }
    public void withdrawmoney(double draw)//取钱
    {
        if(balance >= draw)
        {
            balance -= draw;
            System.out.println("取款成功，当前余额为："+balance);
        }else
        {
            System.out.println("余额不足，取款失败！");
        }
    }
}
//信用卡类，透支额度为1000
class creditcard extends bankcard
{
    public double overdraw = 1000;
    //父类方法的重写，重写看运行类型！！！
    public void withdrawmoney(double draw)
    {
        if((super.balance + overdraw) >= draw && super.balance >= draw)
        {
            super.balance -= draw;
            System.out.println("取款成功，当前余额为："+super.balance);
            System.out.println("透支额度为："+overdraw);
        } else if ((super.balance + overdraw) >= draw && super.balance < draw)
        {
            overdraw = super.balance + overdraw - draw;
            super.balance = 0;
            System.out.println("取款成功，当前余额为："+super.balance);
            System.out.println("可用透支额度为："+overdraw);
        }else
        {
            System.out.println("余额不足，取款失败！");
        }
    }
}
