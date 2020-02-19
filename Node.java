public class Node {
    private String value;
    private Node next;
    public Node(String v)
    {
        value = v;
        next = null;
    }
    public void setNext(Node a)
    {
        next = a;
    }
    public Node getNext()
    {
        return next;
    }
    public void display()
    {
        System.out.print(value);
    }
    public String getValue()
    {
        return value;
    }
    public void setValue(String val)
    {
        value = val;
    }
}
