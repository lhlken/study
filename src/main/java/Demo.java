import com.alibaba.fastjson.JSON;

public class Demo{
    public static void main(String[] args){
        List list1=new List();
        List list2=new List();
        //添加元素
        Node node1=new Node(1);
        Node node2=new Node(3);
        node1.next=node2;
        Node node3=new Node(2);
        Node node4=new Node(4);
        node3.next=node4;
        list1.setRoot(node1);
        list2.setRoot(node2);
        System.out.println(JSON.toJSONString(merge(list1,list2)));


    }
    public static List merge(List list1,List list2){
        Node temp=list1.getRoot();
        Node temp1=list2.getRoot();
        while(temp.next!=null){
            temp=temp.next;
        }
        if(temp.value<temp1.value){
            temp.next=temp1;
            return list1;
        }
        temp=list1.getRoot();
        temp1=list2.getRoot();
        while(temp1.next!=null){
            temp1=temp1.next;
        }  if(temp1.value<temp.value){
            temp1.next=temp;
            return list2;
        }  temp=list1.getRoot();
        temp1=list2.getRoot();
        Node temp2=temp.next;  while(temp1!=null){
            while(temp!=null){
                if(temp.value<temp1.value){
                    if(temp.next!=null){
                        if(temp.next.value>temp1.value){
                            temp2=temp.next;
                            temp.next=temp1;
                            Node temp3=temp1.next;
                            temp1.next=temp2;
                            temp1=temp3;
                            break;

                        }
                        //后移
                        temp=temp.next;
                    }
                    else{
                        temp2=temp.next;
                        temp.next=temp1;
                        Node temp3=temp1.next;
                        temp1.next=temp2;
                        temp1=temp3;
                        break;  }
                }
            }
        }
        return list1;


    }
}
class Node{
    public Node next;
    public int value;
    public Node(int value){
        this.value=value;
    }
}
class List{
    private Node root;
    public Node getRoot(){
        return root;
    }
    public void  setRoot(Node root){
        this.root=root;
    }


}