package challenge;

// FIFO - First In First Out
public class CustomQueue<T> extends StaticStructure<T> {

    public CustomQueue() {
        super();
    }

    public CustomQueue(int capacity) {
        super(capacity);
    }

    public T peek() {
        if (this.isEmpty())
            return null;
        return this.elements[0];
    }

    public void enqueue(T element) {
        this.add(element);
    }

    public T dequeue() {
        if (this.isEmpty())
            return null;

        final int FIRST = 0;
        T elementToRemove = this.elements[FIRST];
        this.remove(FIRST);
        return elementToRemove;
    }
}
