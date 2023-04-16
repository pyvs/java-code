package code2;

public class Extend01
{
    public static void main(String[] args)
    {
        cat cat1 = new cat("tom");
        cat1.eat();
        cat1.drink();
        cat1.climbtree();
        System.out.println("=========");
        dog dog1 = new dog("大黄");
        dog1.eat();
        dog1.drink();
        dog1.police();
    }
}
class pet
{
    public String name;
    public pet(String name)
    {
        this.name = name;
    }
    public void eat()
    {
        System.out.println(this.name+"正在吃饭");
    }
    public void drink()
    {
        System.out.println(this.name+"正在喝水");
    }
}
class cat extends pet
{
    public cat(String name)
    {
        super(name);
    }
    public void climbtree()
    {
        System.out.println("名字叫"+this.name+"的cat正在爬树");
    }
}
class dog extends pet
{
    public dog(String name)
    {
        super(name);
    }
    public void police()
    {
        System.out.println("名字叫"+this.name+"的dog正在警戒");
    }
}