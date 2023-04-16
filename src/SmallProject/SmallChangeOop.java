package SmallProject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOop
{
    public static void main(String[] args)
    {
        SCOp SC = new SCOp();
        SC.Mainmenu();
    }
}
class SCOp
{
    boolean loop = true;
    Scanner input = new Scanner(System.in);
    String key;
    String detail = "----------零钱通明细-----------";
    //收益入账的几个变量
    double money = 0;
    double balance = 0;
    Date date = null;
    //格式化日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    //消费的变量
    String note;
    //主菜单
    public void Mainmenu()
    {
        do
        {
            System.out.println("\n=========零钱通菜单=========");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消   费");
            System.out.println("\t\t4 退   出");
            System.out.println("请选择1-4：");
            key = input.next();
            switch(key)
            {
                case "1"://金钱来源明细
                    this.showdetail();
                    break;
                case "2"://收益入账
                    this.income();
                    break;
                case "3"://消费
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("你的选择有误，请重新选择！");
                    break;
            }
        }while(loop);
        System.out.println("已退出了零钱通");
    }
    //明细
    public void showdetail()
    {
        System.out.println(detail);
    }
    //收入
    public void income()
    {
        System.out.println("请输入收益金额：");
        money = input.nextDouble();
        //收益金额的校验--if
        if(money <=0)
        {
            System.out.println("输入的收益金额有误，请重新输入！");
        }
        balance += money;
        date = new Date();
        //+=可作为字符串拼接符号；
        detail += "\n收益入账\t+"+money+"\t"+sdf.format(date)+"\t"+balance;
        //System.out.println(detail);
    }
    //消费
    public void pay()
    {
        System.out.println("请输入消费的金额：");
        money = input.nextDouble();
        //消费金额校验
        if(money <= 0)
        {
            System.out.println("输入的消费金额有误，请重新输入！");
            return;
        }
        if(money >balance)
        {
            System.out.println("余额不足");
            return;
        }
        balance -= money;
        System.out.println("请输入消费场所：");
        note = input.next();
        detail += "\n"+note+"\t-"+money+"\t"+sdf.format(date)+"\t"+balance;
        //System.out.println(detail);
    }
    //消费
    public void exit()
    {
        String answer;
        System.out.println("是否要退出零钱通：（Y/N）");
        answer = input.next();
        if(answer.equals("Y"))
        {
            loop = false;
            return;
        } else if (answer.equals("N"))
        {
            System.out.println("请继续选择你的操作！");
            return;
        }
    }
}
