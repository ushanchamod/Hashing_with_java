package LinkedList;

public class Node<T> {
    private T data;
    private Node<T> next;

    // Constructor for initialize the data and next
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    // Getter and Setter for data and next
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
