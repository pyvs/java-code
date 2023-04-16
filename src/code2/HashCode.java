package code2;

public class HashCode
{
    public static void main(String[] args)
    {
        hashcode1 hc1 = new hashcode1();
        hashcode2 hc2 = new hashcode2();
        System.out.println(hc1.hashCode());
        System.out.println(hc2.hashCode());
    }
}
class hashcode1
{
    public void print()
    {
        System.out.println("hashcode演示！");
    }
}
class hashcode2
{
    public void print2()
    {
        System.out.println("hashcode演示！");
    }
}