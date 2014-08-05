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
        if (Head == null) {
            Head = new Node(item);
        }
        else {
            Node oldHead = Head;
            Head = new Node(item);
            Head.Next = oldHead;
        }
        
        _length++;
    }

    @Override
    public void InsertAtTail(Object item) {
        
        if (Head == null) {
            Head = new Node(item);
        }
        else {
           Node currentNode = Head;
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
    
    public Node Head;
    private int _length;
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        Node currentNode = Head;
        while (currentNode != null) {
            sb.append(String.format("[%s], ", currentNode.toString()));
            currentNode = currentNode.Next;
        }
        
       sb.append(String.format("\nList has %s items.", GetLength()));
        
        return sb.toString();
    }

    @Override
    public Node GetNodeAtIndex(int targetIndex) {
        
        Node curNode = Head;
        int curIndex = 0;
        while (curNode!=null) {
            if (targetIndex == curIndex) {
                return curNode;
            }
            curIndex++;
            curNode = curNode.Next;
        }
        
        return null;
    }

    @Override
    public void DeleteNodeAtIndex(int targetIndex) {
                
        if (targetIndex < 1) {
            if (Head != null) {
                Head = Head.Next;
                _length--;
            }
        }
        else {
            Node priorNode = GetNodeAtIndex(targetIndex-1);
            if (priorNode != null) {
                Node targetNode = priorNode.Next;
                if (targetNode != null) {
                    Node nextNode = targetNode.Next; 
                    priorNode.Next = nextNode;
                    _length--;
                }
            }
        }       
    }

    @Override
    public void MoveLastNNodesToHead(int count) {
        if (count < _length) {
            Node oldHead = Head;
            Node oldTail = GetNodeAtIndex(_length-1);

            Node newHead = GetNodeAtIndex(_length-count-1);

            // null check seems awkward 
            Node newTail = GetNodeAtIndex(_length-count-2);
            Head = newHead;
            if (newTail != null) {
                newTail.Next = null;
            }
            oldTail.Next = oldHead;
        }
    }

    @Override
    public void Reverse() {
        
    }
    
    public static class Node {
        public Node(Object data) {
            Data = data;
        }
        public Object Data;
        public Node Next;
        @Override
        public String toString() {
            return Data != null ? Data.toString() : "NoData";
        }
    }
    
}
