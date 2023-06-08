public class Linklist {
    Node head;
    public  void insertAtfront(int val){
        Node newnode=new Node(val);
        newnode.next=head;
        head=newnode;
    }
    public  void insertAtend(int val){
        Node temp=head;
        if(head==null){
            head=new Node(val);
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(val);
    }
    public  void insertAtmid(int val,int insert){
        Node curr=head;
        while(curr.data!=val){
            curr=curr.next;
        }
        Node newnode=new Node(insert);
        newnode.next=curr.next;
        curr.next=newnode;
    }
    public  Node reverse(){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
   public void deletefront(){
        head=head.next;
   }
  public void deleteval(int val){
        if(head==null){
            return;
        }else if(head.next==null){
            head=head.next;
            return;
        }else{
            Node curr=head;
            Node prev=null;
            while(curr.data!=val){
                prev=curr;
                curr=curr.next;
            }
            prev.next=curr.next;
            curr=null;
        }
  }
}
