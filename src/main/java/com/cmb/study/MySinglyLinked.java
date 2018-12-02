package com.cmb.study;

public class MySinglyLinked {

    private Node head = null;

    private static class Node {
        private int data;
        private Node next;

        private Node(int data, Node node) {
            this.data = data;
            this.next = node;
        }
    }

    public void addNodeAtTail(int value) {
        Node newNode = new Node(value, null);

        if (head == null) {
            head = newNode;
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    public void addNodeAtHead(int value) {
        Node node = new Node(value, null);

        if(head == null) {
            head = node;
        } else{
            node.next = head;
            head = node;
        }

    }

    public static void reversal() {

    }
}
