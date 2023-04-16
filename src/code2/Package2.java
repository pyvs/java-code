package code2;

public class Package2
{
    public static void main(String[] args)
    {
        Account A1 = new Account("LZH",56743,"131715");
        System.out.println(A1.show());
    }
}
class Account
{
    private String name;
    private double balance;
    private String password;

    public Account(String name, double balance, String password)
    {
        //对输入的值进行判断
        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if(name.length() > 1 && name.length() < 5)
        {
            this.name = name;
        }else
        {
            System.out.println("名字长度不符合标准，已为你设置默认值");
            this.name = "无名氏";
        }
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        if(balance > 20)
        {
            this.balance = balance;
        }else
        {
            System.out.println("余额不符合标准，已为你设置默认值");
            this.balance = 25.0;
        }
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        if(password.length() == 6)
        {
            this.password = password;
        }else
        {
            System.out.println("密码长度有误，已为你设置默认值");
            this.password = "000000";
        }
    }
    public String show()
    {
        return "姓名："+getName()+" 余额："+getBalance()+" 密码："+getPassword();
    }
}
