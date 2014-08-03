/*
 Copyright 2014 Mike Randrup <github@mikerandrup.com>
 See LICENSE file for license details.
 */
package ListStructures;

/**
 *
 * @author Mike Randrup <github@mikerandrup.com>
 */
public interface Stack {
    void Push(Object item);
    void Pop(Object item);
    Object Peek();
}
