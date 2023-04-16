package code2;

public class ToString
{
    public static void main(String[] args)
    {
        tostring1 ts = new tostring1();
        System.out.println(ts.toString());
    }
}
class tostring1
{
    String name = "jack";
    int age = 18;
    String gender = "male";

    @Override
    //子类重写了toString;
    public String toString()
    {
        return "tostring1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
