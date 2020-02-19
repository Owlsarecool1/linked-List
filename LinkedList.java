
public class LinkedList {
    private Node head;
    public LinkedList(){
        head = null;
    }
    public void addInOrder(String x){

        Node temp= new Node(x);
        if (head==null){
            head = temp;
        }
        else if (x.compareTo(head.getValue()) < 0){
            temp.setNext(head);
            head = temp;

        }
        else if ((x.compareTo(head.getValue()))>0){
            Node current = head;
            Node prev = current;
            while( x.compareTo(current.getValue())>0)
            {
                prev=current;
                current=current.getNext();
                if (current==null)
                    {temp.setNext(prev.getNext());
                    break;
                     }
            }
            if (current!=null)
            {temp.setNext (current);
            }
            prev.setNext(temp);
        }
        else{
            temp.setNext(head);
            head=temp;
        }
    }
    public void display() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            String b = temp.getValue();
            String temp2 = "";
            if (b.charAt(b.length() - 1) == '*') {
                System.out.print("*");
                for (int i = 0; i < b.length() - 1; i++) {
                    temp2 += b.charAt(i);
                    System.out.print(b.charAt(i));
                }
                temp.setValue(temp2);
                System.out.print("  ");
            }
            else
                {
                    temp.display();
                    System.out.print("   ");
                }
            temp = temp.getNext();
            if (count % 12 == 0 || temp == null)
                System.out.println();
        }
    }
    public void remove (int x) {
        if(x==0)
        {
            return;
        }
        Node temp=head;
        Node prev=null;
        for (int i=1;i<x;i++)
        {
            prev=temp;
            temp=temp.getNext();
        }
        if (x==1){
            head=head.getNext();
            head.getValue();
        }
        else
        {
            System.out.print(temp.getValue()+ " was removed...");
            System.out.println();
            prev.setNext(temp.getNext());
        }
    }
    public int find(String n){
        Node temp = head;
        int count = 1;
        while(temp != null) {
            if(temp.getValue().compareTo(n) == 0) {
                return count;
            }
            else
                {temp = temp.getNext();
                count++;}
        }
        return 0;
    }
    public int size()
        {
            Node temp = head;
            int count = 0;
            while(temp!= null) {
                temp = temp.getNext();
                count++;
            }
            return count;
        }

        public void addTOFront(String x)
        {
            Node temp;
            temp = new Node(x);
            temp.setNext(head);
            head=temp;
        }
}




