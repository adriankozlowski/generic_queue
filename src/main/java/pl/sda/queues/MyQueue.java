package pl.sda.queues;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class MyQueue<T> implements Queue<T> {
    private Node<T> head;
    private T type;
    private int size = 0;
    private Node<T> tail;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterator<T>() {

            Node<T> naNastepnąIterację = head;
            Node<T> aktualnyDoZwrócenia = head;

            public boolean hasNext() {//
                return naNastepnąIterację != null;
            }

            public T next() {
                aktualnyDoZwrócenia = naNastepnąIterację;
                naNastepnąIterację = aktualnyDoZwrócenia.getNext();
                return aktualnyDoZwrócenia.getValue();
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(T o) {
        if (head == null) {
            head = new Node<T>(o);
            tail = head;
        } else {
            Node<T> node = new Node<T>(o);
            tail.setNext(node);
            tail = node;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        throw new RuntimeException("Not implemented yet");
    }

    @Override
    public boolean addAll(Collection c) {
        throw new RuntimeException("Not implemented yet");
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        System.gc();
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new RuntimeException("Not implemented yet");
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new RuntimeException("Not implemented yet");
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new RuntimeException("Not implemented yet");
    }

    @Override
    public boolean offer(T o) {
        return add(o);
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public T poll() {
        Node<T> toReturn = head;
        if (head != null) {
            head = toReturn.getNext();
            size--;
        }
        return toReturn.getValue();
    }

    @Override
    public T element() {
        if (head == null) {
            throw new NullPointerException();
        }
        return head.getValue();
    }

    @Override
    public T peek() {
        return head.getValue();
    }
}
