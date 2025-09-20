package challenge;

@SuppressWarnings("unchecked")
public class StaticStructure<T> {
    protected Object[] elements;
    protected int count;

    public StaticStructure() {
        this(8);
    }

    public StaticStructure(int capacity) {
        if (capacity < 1)
            capacity = 1;
        this.elements = new Object[capacity];
        this.count = 0;
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    protected void ensureCapacity(int minCapacity) {
        if (minCapacity <= elements.length)
            return;
        int newCap = Math.max(minCapacity, elements.length * 2);
        Object[] newArr = new Object[newCap];
        for (int i = 0; i < count; i++)
            newArr[i] = elements[i];
        elements = newArr;
    }

    public void add(T element) {
        ensureCapacity(count + 1);
        elements[count++] = element;
    }

    public void insert(int position, T element) {
        if (position < 0 || position > count) {
            throw new IllegalArgumentException("Invalid position");
        }
        ensureCapacity(count + 1);
        for (int i = count; i > position; i--) {
            elements[i] = elements[i - 1];
        }
        elements[position] = element;
        count++;
    }

    public T removeAt(int position) {
        if (position < 0 || position >= count) {
            throw new IllegalArgumentException("Invalid position");
        }
        T removed = (T) elements[position];
        for (int i = position; i < count - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[count - 1] = null;
        count--;
        return removed;
    }

    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Invalid index");
        }
        return (T) elements[index];
    }
}
