/*
 Copyright 2014 Mike Randrup <github@mikerandrup.com>
 See LICENSE file for license details.
 */
package ListStructures;

/**
 *
 * @author Mike Randrup <github@mikerandrup.com>
 */
public class ListImplementationLinked implements List {
    
    public ListImplementationLinked() {
        _length = 0;
    }

    @Override
    public void InsertAtHead(Object item) {
        if (head == null) {
            head = new Node(item);
        }
        else {
            Node oldHead = head;
            head = new Node(item);
            head.Next = oldHead;
        }
        
        _length++;
    }

    @Override
    public void InsertAtTail(Object item) {
        
        if (head == null) {
            head = new Node(item);
        }
        else {
           Node currentNode = head;
           while (currentNode.Next != null) {
               currentNode = currentNode.Next;
           }
           currentNode.Next = new Node(item);
        }
        
        _length++;
    }
    
    @Override
    public int GetLength() {
        return _length;
    }
    
    public Node head;
    private int _length;
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        Node currentNode = head;
        while (currentNode != null) {
            sb.append(String.format("[%s], ", currentNode.toString()));
            currentNode = currentNode.Next;
        }
        
       sb.append(String.format("\nList has %s items.", GetLength()));
        
        return sb.toString();
    }
    
    public static class Node {
        public Node(Object data) {
            Data = data;
        }
        public Object Data;
        public Node Next;
        public String toString() {
            return Data!=null ? Data.toString() : "NoData";
        }
    }
    
}
