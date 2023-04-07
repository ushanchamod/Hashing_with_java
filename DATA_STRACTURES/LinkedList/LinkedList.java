package LinkedList;
import java.util.Arrays;

public class LinkedList<T> {
    Node<T> head;

    // get head
    public Node<T> getHead(){
        return head;
    }

    // inset at the beginning
    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(head);
        head = newNode;
    }

    // add
    public void add(T data) {
        Node<T> newNode = new Node<T>(data);

        if (head == null) {
            head = newNode;
        } 
        
        else {
            Node<T> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
            newNode.setNext(null);
        }
    }

    // remove node from beginning
    public T removeAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else {
            Node<T> temp = head;
            head = head.getNext();
            return temp.getData();
        }
    }

    // remove node from end
    public T removeAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else {
            Node<T> temp = head;
            Node<T> prev = null;
            while (temp.getNext() != null) {
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(null);
            return temp.getData();
        }
    }


    // remove given value from list
    public void removeGivenValue(T data) {
        if (head == null) {
            System.out.println("List is empty");
        } 
        
        else {
            Node<T> temp = head;
            Node<T> prev = null;

            while (temp != null && temp.getData() != data) {
                prev = temp;
                temp = temp.getNext();
            }
            if (temp == null) {
                System.out.println("Value not found");
            } else {
                prev.setNext(temp.getNext());
            }
        }
    }

    // get index for given value
    public int indexOf(T data) {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        } else {
            Node<T> temp = head;
            int index = 0;
            while (temp != null) {
                if (temp.getData().equals(data)) {
                    return index;
                }
                index++;
                temp = temp.getNext();
            }
            return -1;
        }
    }

    // get length of list
    public int length() {
        if (head == null) {
            System.out.println("List is empty");
            return 0;
        } else {
            Node<T> temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.getNext();
            }
            return count;
        }
    }

    // return all element in list
    public String print() {
        if (head == null) {
            return "[]";
        } else {
            T[] list = (T[]) new Object[length()];
            Node<T> temp = head;
            int index = 0;
            while (temp != null) {
                list[index] = temp.getData();
                // str += temp.getData() + ",";
                temp = temp.getNext();
                index++;
            }
            // return list;
            return Arrays.toString(list);

        }
    }

    // create array from list and return it
    public Object[] toArray() {
        Object[] array = new Object[length()];
        Node<T> currentNode = head;
        int index = 0;
        while (currentNode != null) {
            array[index] = currentNode.getData();
            currentNode = currentNode.getNext();
            index++;
        }
        return array;
    }
    

    
    // get value related to the index
    public T getValue(int index) {
        if (head == null) {
            // System.out.println("List is empty");
            return null;
        } else {
            Node<T> temp = head;
            int count = 0;
            while (temp != null) {
                if (count == index) {
                    return temp.getData();
                }
                count++;
                temp = temp.getNext();
            }
            return null;
        }
    }
    
}


