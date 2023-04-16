package homework;

public class Interface_
{
    public static void main(String[] args)
    {
        UsbDiskWriter usbDiskWriter = new UsbDiskWriter();
        Camera camera = new Camera();
        Mobile mobile = new Mobile();

        usbDiskWriter.start();
        usbDiskWriter.stop();

        camera.start();
        camera.stop();

        mobile.start();
        mobile.stop();
    }
}
interface Usb
{
    void start();
    void stop();
}

 class UsbDiskWriter implements Usb
{
    @Override
    public void start() {
        System.out.println("开始访问 U 盘");
    }

    @Override
    public void stop() {
        System.out.println("停止访问 U 盘");
    }
}

 class Camera implements Usb
{
    @Override
    public void start() {
        System.out.println("开始连接照相机");
    }

    @Override
    public void stop() {
        System.out.println("断开与照相机的连接");
    }
}

 class Mobile implements Usb
{
    @Override
    public void start() {
        System.out.println("开始连接手机");
    }

    @Override
    public void stop() {
        System.out.println("断开与手机的连接");
    }
}





