package com.bootcamp.javaPrograms1;

public class DoublyLinkedListDemo {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;

    public DoublyLinkedListDemo() {
        head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void delete(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }

    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Display the doubly-linked list from tail to head
    public void displayBackward() {
        Node current = head;
        while (current != null && current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedListDemo dll = new DoublyLinkedListDemo();

        dll.insert(1);
        dll.insert(2);
        dll.insert(3);

        System.out.println("Doubly-Linked List (Forward):");
        dll.displayForward();

        System.out.println("Doubly-Linked List (Backward):");
        dll.displayBackward();

        dll.delete(2);

        System.out.println("Doubly-Linked List after deleting 2 (Forward):");
        dll.displayForward();
    }
}






