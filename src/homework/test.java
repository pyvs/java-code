package homework;
import java.util.Scanner;
public class test
{
    public static void main(String[] args)
    {
        {
            Scanner in = new Scanner(System.in);
            System.out.println("please input a name for the dog ");
            Dog dog = new Dog(in.nextLine());
            System.out.println("please input a name for the cat ");
            Cat cat = new Cat(in.nextLine());
            dog.showName();
            dog.cry();
            dog.swimming();
            cat.showName();
            cat.cry();
            cat.climbUpTree();
        }
    }
}

class Animal
{
    protected String name;
    public Animal(String name)
    {
        this.name = name;
    }
    public void showName()
    {
        System.out.print(name+",");
    }
    public void cry()
    {
        System.out.print("Different animals make different sounds");
    }
}
class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }
    public void cry()
    {
        System.out.print("wang...wang,");
    }
    public void swimming()
    {
        System.out.print("can swimming.\n");
    }
}
class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
    }
    public void cry()
    {
        System.out.print("miao...miao,");
    }
    public void climbUpTree()
    {
        System.out.print("can climb the tree.");
    }
}
