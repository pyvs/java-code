package code2;

/**
 * @author:LZH
 * @date:2023/4/13
 * @motto:路的尽头还是路，山的那边还是山！
 */
public class Test1
{
    public static void main(String[] args)
    {
        Student1 S = new Student1(5,"Jack",19);
        System.out.println(S.toString());
        S.study("Math");
        S.eat("chicken");
        Teacher T = new Teacher("Lihua",56,"Math");
        System.out.println(T.toString());
        T.teach();
        T.eat("chicken");

    }

}

class Person
{
    public String name;
    public int age;
    public void eat(String something)
    {
        System.out.println("我叫"+this.name+" 年龄:"+this.age+" 我爱吃"+something);
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}

class Student1 extends Person
{
    public int clas;
    public String name;
    public int age;
    public void study(String subject)
    {
        System.out.println("我爱学习"+subject);
    }

    public Student1(int clas, String name, int age)
    {
        super(name,age);
        this.clas = clas;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "姓名："+this.name+" 年龄："+this.age+" 班级："+this.clas;
    }
}

class Teacher extends Person
{
    public String name;
    public int age;
    public String subject;
    public void teach()
    {
        System.out.println("我教的科目是"+subject);
    }

    public Teacher(String name, int age, String subject)
    {
        super(name, age);
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    @Override
    //返回类型不为空，需要输出语句输出
    public String toString()
    {
            return "姓名："+this.name+" 年龄："+this.age+" 教学科目："+this.subject;
    }
}