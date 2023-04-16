package code2;

/**
 * @author:LZH
 * @date:2023/4/13
 * @motto:路的尽头还是路，山的那边还是山！
 */
public class Test2
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        cat.play();
        Dog dog = new Dog();
        dog.play();
    }
}

abstract class Animals
{
    public abstract void play();
}

class Cat extends Animals
{
    @Override
    public void play()
    {
        System.out.println("我是猫，我爱玩老鼠");
    }
}

class Dog extends Animals
{
    @Override
    public void play()
    {
        System.out.println("我是狗，我爱玩飞盘");
    }
}