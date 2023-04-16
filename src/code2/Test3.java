package code2;

/**
 * @author:LZH
 * @date:2023/4/13
 * @motto:路的尽头还是路，山的那边还是山！
 */
public class Test3
{
    public static void main(String[] args)
    {
        SportsCar car1 = new SportsCar("法拉利");
        System.out.println(car1.getBrand());
        car1.run();
        car1.price();
        SportsCar car2 = new SportsCar("兰博基尼");
        System.out.println(car2.getBrand());
        car2.run();
        car2.price();
    }
}

abstract class Car
{
    private String brand;

    public Car(String brand)
    {
        this.brand = brand;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public abstract void run();
}

class SportsCar extends Car
{
    public SportsCar(String brand)
    {
        super(brand);
    }

    @Override
    public void run()
    {
        System.out.println("超级跑车！！！");
    }

    public void price()
    {
        System.out.println("售价 100万元人民币");
    }
}