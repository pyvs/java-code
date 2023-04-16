package code2;

/**
 * @author:LZH
 * @date:2023/4/13
 * @motto:路的尽头还是路，山的那边还是山！
 */
public class Test7
{
    public static void main(String[] args)
    {
        PingPangPlayer P1 = new PingPangPlayer("马龙",35);
        P1.english();
        P1.Learn();
        PingPangcoach P2 = new PingPangcoach("刘国梁",55);
        P2.teach();
        System.out.println("=======================");
        BasketballPlayer B1 = new BasketballPlayer("科比",45);
        B1.english();
        B1.Learn();
        Basketballcoach B2 = new Basketballcoach("詹姆斯",67);
        B2.teach();
    }
}

interface LearnEnglish
{
    void english();
}

class Person02
{
    private String name;
    private int age;

    public Person02(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}

 abstract class Athletes extends Person02
{
    public Athletes(String name, int age)
    {
        super(name, age);
    }
    public abstract void Learn();
}

abstract class Coach extends Person02
{
    public Coach(String name, int age)
    {
        super(name, age);
    }

    public  abstract void teach();
}

class PingPangPlayer extends Athletes implements LearnEnglish
{

    public PingPangPlayer(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void english()
    {
        System.out.println("年龄"+super.getAge()+"的乒乓球运动员 "+super.getName()+"正在学习英语！！！");
    }

    @Override
    public void Learn()
    {
        System.out.println("年龄"+super.getAge()+"的乒乓球运动员 "+super.getName()+"正在练习乒乓球！！！");
    }
}

class PingPangcoach extends Coach
{

    public PingPangcoach(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void teach()
    {
        System.out.println("年龄"+super.getAge()+"的乒乓球教练 "+super.getName()+"正在教学！！！");

    }
}

class BasketballPlayer extends Athletes implements LearnEnglish
{

    public BasketballPlayer(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void english()
    {
        System.out.println("年龄"+super.getAge()+"的篮球运动员 "+super.getName()+"正在学习英语！！！");
    }

    @Override
    public void Learn()
    {
        System.out.println("年龄"+super.getAge()+"的篮球运动员 "+super.getName()+"正在练习篮球！！！");
    }
}

class Basketballcoach extends Coach
{

    public Basketballcoach(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void teach()
    {
        System.out.println("年龄"+super.getAge()+"的篮球教练 "+super.getName()+"正在教学！！！");

    }
}


