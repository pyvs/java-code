package code2;

/**
 * @author:LZH
 * @date:2023/4/13
 * @motto:路的尽头还是路，山的那边还是山！
 */
public class Test6
{
    public static void main(String[] args)
    {
        Stu S = new Stu("李华",16,5,"男");
        S.ACode();
        S.showInfo();
    }
}

interface Programmer
{
    void ACode();
}

class Stu implements Programmer
{
    private String name;
    private int age;
    private int clas;
    private String gender;

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

    public int getClas()
    {
        return clas;
    }

    public void setClas(int clas)
    {
        this.clas = clas;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public Stu(String name, int age, int clas, String gender)
    {
        this.name = name;
        this.age = age;
        this.clas = clas;
        this.gender = gender;
    }

    @Override
    public void ACode()
    {
        System.out.println("程序员正在敲代码！！！");
    }

    public void showInfo()
    {
        System.out.println("姓名："+this.name+" 年龄："+this.age+" 班级："+this.clas+" 性别："+this.gender);
    }
}