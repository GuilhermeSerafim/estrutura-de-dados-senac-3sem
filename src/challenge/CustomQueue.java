package challenge;

public class CustomQueue<T> extends StaticStructure<T> {

    public CustomQueue() { super(); }
    public CustomQueue(int capacity) { super(capacity); }

    public void enqueue(T element) { add(element); }

    public T dequeue() {
        if (isEmpty()) return null;
        return removeAt(0);
    }

    public T peek() {
        if (isEmpty()) return null;
        return get(0);
    }
}
