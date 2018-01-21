package pl.sda.queues;

public class Node<T> {
    private Node next;
    private T value;

    public Node getNext() {
        return next;
    }

    public Node(T value) {
        this.value = value;
    }

    public Node<T> setNext(Node next) {
        this.next = next;
        return this;
    }

    public T getValue() {
        return value;
    }

    public Node<T> setValue(T value) {
        this.value = value;
        return this;
    }
}
