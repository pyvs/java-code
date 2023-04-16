package code2;

/**
 * @author:LZH
 * @date:2023/4/13
 * @motto:路的尽头还是路，山的那边还是山！
 */
public class Test5
{
    public static void main(String[] args)
    {
        Rose R = new Rose("玫瑰花","红色",159,"法国");
        R.ShowInof();
        R.Warning();
    }
}

class Flower
{
    private String color;
    private int price;
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public Flower(String name ,String color,int price)
    {
        this.color = color;
        this.price = price;
        this.name = name;
    }

    public void ShowInof()
    {
        System.out.println("花名:"+this.name+" 颜色："+this.color+" 价格："+this.price);
    }
}

class Rose extends Flower
{
    private String area;

    public Rose(String name,String color, int price, String area)
    {
        super(name,color, price);
        this.area = area;
    }

    public String getArea()
    {
        return area;
    }

    public void setArea(String area)
    {
        this.area = area;
    }

    public void ShowInof()
    {
        super.ShowInof();
        System.out.println("产地："+this.area);
    }

    public void Warning()
    {
        System.out.println("玫瑰有刺，小心扎手！！！");
    }
}