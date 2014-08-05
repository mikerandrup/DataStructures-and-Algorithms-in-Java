/*
 Copyright 2014 Mike Randrup <github@mikerandrup.com>
 See LICENSE file for license details.
 */
package ListStructures;

/**
 *
 * @author Mike Randrup <github@mikerandrup.com>
 */
public interface List {
    void InsertAtHead(Object item);
    void InsertAtTail(Object item);
    Object GetNodeAtIndex(int index);
    void DeleteNodeAtIndex(int index);
    void MoveLastNNodesToHead(int count);
    void Reverse();
    int GetLength();
}
