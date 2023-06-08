import java.util.Scanner;

public class Main {
    public  static Node reverse(Node head){
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
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Linklist l=new Linklist();

        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            l.insertAtend(x);
        }

        //l.print();

        l.insertAtfront(9);
        l.insertAtend(6);
        l.insertAtmid(9,6);
        l.print();
        System.out.println();
        Linklist dummy=new Linklist();
        dummy.head=l.head;

        dummy.deleteval(6);
        dummy.print();
        System.out.println();
        l.print();
        System.out.println();
       l.head= l.reverse();
       l.print();
        System.out.println();
      //  l.print();
        dummy.print();
    }
}