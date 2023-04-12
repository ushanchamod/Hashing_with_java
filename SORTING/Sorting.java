package SORTING;

import LinkedList.LinkedList;
import LinkedList.Node;

public class Sorting {
    LinkedList<String> list;
    Node<String> head;
    Node<String> temp;

    public Sorting(LinkedList<String> list) {
        this.list = list;
        head = list.getHead();
        temp = head;
    }

    public void shortList() {
        while (temp != null) {
            String[] current = temp.getData().split(",");

            String[] next;
            if (temp.getNext() != null) {
                next = temp.getNext().getData().split(",");
            } else {
                next = null;
            }

            if (next != null) {
                if (Integer.parseInt(current[4]) > Integer.parseInt(next[4])) {
                    list.swap(temp, temp.getNext());
                    temp = head;
                }
            }
            temp = temp.getNext();
        }
        list.removeAtBeginning();
    }
}
