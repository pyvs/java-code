package DateStruct01;

public class LinkedLIst01
{
    public Node head;
    public int ListLength;

    //头插法建立单链表（不带头结点）,先创建一个节点
    public void addFirst(int data)
    {
        Node node = new Node(data);
        if(this.head == null)
        {
            this.head = node;
        } else
        {
            node.next = this.head;
            this.head = node;
        }
        this.ListLength++;
    }

    //尾插法建立单链表
    public void addLast(int date)
    {
        Node node = new Node(date);

        if(this.head == null)
        {
            this.head =node;
        }else
        {
            Node cur = this.head;
            while(cur.next != null)
            {
                cur = cur.next;
            }
            cur.next = node;
        }
        this.ListLength++;
    }

    //使用while循环遍历单链表
    public void PrintList()
    {
        Node cur = this.head;
        while(cur != null)
        {
            System.out.print(cur.value+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //根据给出的值进行查找
    public boolean ListFind(int key)
    {
        Node cur = this.head;
        while(cur.next != null)
        {
            if(cur.value == key)
            {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //获取单链表的长度
    public int ListLength()
    {
        return this.ListLength;
    }

    //寻找待插入位置的前驱节点
    public Node Getpos(int pos)
    {
        Node cur = this.head;
        int index = 0;
        while(index != pos - 1)
        {
            cur = cur.next;
            index++;
        }
        return cur;
    }

    //插入操作
    public void Insert(int pos,int date)
    {
        if(pos < 0 || pos > this.ListLength)
        {
            System.out.println("插入位置不合理，请重新插入！！！");
        }

        if(pos == 0)
        {
            addFirst(date);
            return;
        }

        if(pos == this.ListLength)
        {
            addLast(date);
            return;
        }

        Node node = new Node(date);
        Node prv = Getpos(pos);
        node.next = prv.next;
        prv.next = node;
        this.ListLength++;
     }

    //修改指定位置的值（改）
    public void modfiy(int pos,int date)
    {
        if(head == null)
        {
            System.out.println("链表为空，无法修改单链表的值");
        }

        if(pos < 0 || pos > this.ListLength -1)
        {
            System.out.println("插入位置不合理，请重新插入！！！");
        }

        int index = 0;
        Node  cur = this.head;
        while(index != pos)
        {
            cur = cur.next;
            index++;
        }
        cur.value = date;
    }

    //删除操作（按值删除）
    public void delete(int key)
    {
        if(this.head.value == key)
        {
            //如果链表为空或第一个结点为删除的值
            this.ListLength--;
            this.head = this.head.next;
            return;
        }
        //要删除节点的前驱节点
        Node prev = Getpos(key);
        //前驱节点的下一节点的下一个
        prev.next = prev.next.next;
        this.ListLength--;
    }

}

//节点的定义
class Node
{
    public int value;
    public Node next;

    public Node(int value)
    {
        this.value = value;
    }
}
