import java.io.IOException;
import java.io.File;
import java.util.Scanner;

class Node {
    public String name;
    public Node next;
    public Node prev;

    Node(String name) {
        this.name = name;
        this.next = null;
        this.prev = null;
    }
}

class LinkedList {
    private Node head;
    private Node tail;

    public void insert(String name) {
        Node newNode = new Node(name);
        Node temp = head;

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else if(name.compareTo(head.name) < 0) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        }
        else if(name.compareTo(tail.name) > 0) {
            newNode.prev = tail;
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
        }
        else {
            while(name.compareTo(temp.name) < 0) {
                temp = temp.next;
            }
            temp.prev.next = newNode;
            newNode.prev = temp.prev;
            newNode.next = temp;
            temp.prev = newNode;
        }
    }

    void delete(String name) {
        Node temp = head;

        if(name.compareTo(head.name) = 0) {
            head = head.next;
            head.prev = null;
        }
        else if(name.compareTo(tail.name) = 0) {
            tail = tail.prev;
            tail.next = null;
        }
        else {
            while (temp != null && name.compareTo(temp.name) != 0) {
                temp = temp.next;
            }
            if (temp != null) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }

    void displayAsc() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.name);
            temp = temp.next;
        }
    }

    void displayDesc() {
        Node temp = tail;
        while(temp != null) {
            System.out.println(temp.name);
            temp = temp.prev;
        }
    }
}

class Driver {
    public static void main(String[] args) throw IOException {
        String file = "src/input.txt";
        LinkedList list = new LinkedList();
        Scanner input = new Scanner(new File(file));
        while(input.hasNext()) {
            list.insert(input.nextLine());
        }
        list.displayAsc();
        System.out.print("==================");
        list.displayDesc();
    }
}