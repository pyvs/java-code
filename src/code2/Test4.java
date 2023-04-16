package code2;

/**
 * @author:LZH
 * @date:2023/4/13
 * @motto:路的尽头还是路，山的那边还是山！
 */
public class Test4
{
    public static void main(String[] args)
    {
        Compture C = new Compture();
        Flash f = new Flash();
        Print p = new Print();
        C.plugin(f);
        C.plugin(p);
    }
}

interface USB
{
    void start();
    void stop();
}

class Flash implements USB
{

    @Override
    public void start()
    {
        System.out.println("开始功能被调用！！！");
    }

    @Override
    public void stop()
    {
        System.out.println("结束功能被调用！！！");
    }
}

class Print implements USB
{

    @Override
    public void start()
    {
        System.out.println("开始打印！！！");
    }

    @Override
    public void stop()
    {
        System.out.println("结束打印！！！");
    }
}

class Compture
{
    public void plugin(USB usb)
    {
        usb.start();
        usb.stop();
    }
}