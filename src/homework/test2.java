package homework;
import  java.util. Scanner;
public class test2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
       char SHAPE = in.next().charAt(0);
       if(SHAPE == 'T')
       {
           Triantgle T = new Triantgle();
          double area = T.getarea(in.nextInt(),in.nextInt());
          System.out.print(area);
       }else if(SHAPE == 'R')
       {
           Rectangle R = new Rectangle();
           double area = R.getarea(in.nextDouble(),in.nextDouble());
           System.out.print(area);
       }else if(SHAPE == 'C')
       {
           Cricle C = new Cricle();
           double area = C.getarea(in.nextInt());
           System.out.print(area);
       }
    }
}
class Shape
{

}
class Triantgle extends Shape
{
    public double getarea(int i,int j)
    {
        return (1.0/2) * i * j;
    }
}
class Rectangle extends Shape
{
    public double getarea(double i,double j)
    {
        return  i * j;
    }
}
class Cricle extends Shape
{
    public double getarea(int i)
    {
        return 3.14 *i*i;
    }
}