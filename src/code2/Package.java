package code2;

public class Package
{
    public static void main(String[] args)
    {
        student s1 = new student("jack",94.6,78.5,87.3);
        student s2 = new student("milan",93.6,67.5,73.3);
        System.out.print(s1.show()+"\n总分："+s1.allscore()+"\n"+"最高分："+s1.maxscore()+" 最低分"+s1.lowscore()+" 平均分："+s1.averagescore());
        System.out.println();
        System.out.println("=====================");
        System.out.print(s2.show()+"\n总分："+s2.allscore()+"\n"+"最高分："+s2.maxscore()+" 最低分:"+s2.lowscore()+" 平均分："+s2.averagescore());

    }

}
class student
{
    private String name;
    private  double javascore;
    private double androidscore;
    private double mysqlscore;

    public student(String name, double javascore, double androidscore, double mysqlscore)
    {
        this.name = name;
        this.javascore = javascore;
        this.androidscore = androidscore;
        this.mysqlscore = mysqlscore;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getJavascore()
    {
        return javascore;
    }

    public void setJavascore(double javascore)
    {
        this.javascore = javascore;
    }

    public double getAndroidscore()
    {
        return androidscore;
    }

    public void setAndroidscore(double androidscore)
    {
        this.androidscore = androidscore;
    }

    public double getMysqlscore()
    {
        return mysqlscore;
    }

    public void setMysqlscore(double mysqlscore)
    {
        this.mysqlscore = mysqlscore;
    }

    public String show()
    {
        return "学生姓名："+getName()+"\njava成绩："+getJavascore()+
                " Android成绩:"+getAndroidscore()+" Mysql成绩："+getMysqlscore();
    }
    public double allscore()
    {
        return javascore + androidscore + mysqlscore;
    }
    public double maxscore()
    {
        double arr[] = new double[3];
        arr[0] = javascore;
        arr[1] = androidscore;
        arr[2] = mysqlscore;
        double max = arr[0];
        for (int i= 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public double lowscore()
    {
        double arr[] = new double[3];
        arr[0] = javascore;
        arr[1] = androidscore;
        arr[2] = mysqlscore;
        double low = arr[0];
        for (int i= 1; i < arr.length; i++)
        {
            if(arr[i] < low)
            {
                low = arr[i];
            }
        }
        return low;
    }

    public double averagescore()
    {
        return (javascore + androidscore + mysqlscore) / 3;
    }
}
