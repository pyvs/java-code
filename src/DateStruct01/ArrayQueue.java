package DateStruct01;

import java.util.Scanner;

public class ArrayQueue
{
    public static void main(String[] args)
    {
        ArrayQueue_1 AQ = new ArrayQueue_1(5);
        char key;
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while(flag)
        {
            System.out.println("a (add):将数据添加到队列中");
            System.out.println("g (get):将数据从队列中取出");
            System.out.println("s (show):显示队列中的所有数据");
            System.out.println("h (head):显示队列头元素");
            System.out.println("e (exit):退出程序");

            key = input.next().charAt(0);
            switch(key)
            {
                case 'a':
                    AQ.addQueue(input.nextInt());
                    System.out.println("队列中的元素个数："+ArrayQueue_1.count);
                    break;
                case 'g':
                    int num = AQ.getqueue();
                    System.out.println("取出的数据为："+num);
                    break;
                case 's':
                    AQ.showqueue();
                    break;
                case 'h':
                    int num1 = AQ.headqueue();
                    System.out.println("取出队头元素为："+num1);
                    break;
                case 'e':
                    flag = false;
                    break;
            }
        }
        System.out.println("程序已退出！");
    }
}
//数组模拟队列
//此队列只能使用一次，需要优化，即环形队列
class ArrayQueue_1
{
    public int MaxSize;
    public int front;//始终指向队列首元素的前一个位置
    public int rear;//指向队列的最后一个元素
    public int arr[];
    public static int count = 0;

    public ArrayQueue_1(int num)
    {
        MaxSize = num;
        front = -1;
        rear = -1;
        arr = new int[MaxSize];
    }
    //判断队列是否为满
    public boolean isFull()
    {
        return rear == MaxSize - 1;
    }
    //判断队列是否为空
    public boolean isEmpty()
    {
        return front == rear;
    }
    //将数据添加到队列中
    public void addQueue(int date)
    {
        if(isFull())
        {
            //抛出异常
            throw new RuntimeException("队列已满，添加数据失败");
        }
        rear++;
        arr[rear] = date;
        count++;
    }
    //将数据从队列中取出
    public int getqueue()
    {
        if(isEmpty())
        {
            throw new RuntimeException("队列为空，取出数据失败");
        }
        front++;
        return arr[front];
    }
    //显示队列中的元素
    public void showqueue()
    {
        if(isEmpty())
        {
            System.out.println("队列为空，无法显示队列");
            return;
        }
        for(int i = front+1;i <= rear;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //显示队头元素
    public int headqueue()
    {
        if(isEmpty())
        {
            throw new RuntimeException("队列为空，无法显示");
        }
        return arr[++front];
    }
}
