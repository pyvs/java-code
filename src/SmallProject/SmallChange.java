package SmallProject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChange
{
    public static void main(String[] args)
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
                    System.out.println(detail);
                    break;
                case "2"://收益入账
                    System.out.println("请输入收益金额：");
                    money = input.nextDouble();
                    //收益金额的校验--if
                    if(money <=0)
                    {
                        System.out.println("输入的收益金额有误，请重新输入！");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    //+=可作为字符串拼接符号；
                    detail += "\n收益入账\t+"+money+"\t"+sdf.format(date)+"\t"+balance;
                    //System.out.println(detail);
                    break;
                case "3"://消费
                    System.out.println("请输入消费的金额：");
                    money = input.nextDouble();
                    //消费金额校验
                    if(money <= 0)
                    {
                        System.out.println("输入的消费金额有误，请重新输入！");
                        break;
                    }
                    if(money >balance)
                    {
                        System.out.println("余额不足");
                        break;
                    }
                    balance -= money;
                    System.out.println("请输入消费场所：");
                    note = input.next();
                    detail += "\n"+note+"\t-"+money+"\t"+sdf.format(date)+"\t"+balance;
                    //System.out.println(detail);
                    break;
                case "4":
                    String answer;
                    System.out.println("是否要退出零钱通：（Y/N）");
                    answer = input.next();
                    if(answer.equals("Y"))
                    {
                        loop = false;
                        break;
                    } else if (answer.equals("N"))
                    {
                        System.out.println("请继续选择你的操作！");
                    }
                    break;
                default:
                    System.out.println("你的选择有误，请重新选择！");
                    break;
            }
        }while(loop);
        System.out.println("已退出了零钱通");
    }
}
