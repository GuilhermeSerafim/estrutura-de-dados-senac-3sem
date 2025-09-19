package challenge;

public class StaticStructure<T> {
    public T[] elements;
    public int count;

    public StaticStructure(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.count = 0;
    }

    public StaticStructure() {
        this(3);
    }

    public boolean add(T element) {
        boolean isFull = this.count == this.elements.length;
        if (isFull)
            increaseCapacity();
        this.elements[this.count] = element;
        this.count++;
        return true;
    }

    public void add(int position, T element) {
        boolean invalidPosition = position < 0 || position > count;
        boolean isFull = this.count == this.elements.length;
        if (invalidPosition)
            throw new IllegalArgumentException("Invalid position");
        if (isFull)
            increaseCapacity();

        for (int i = this.count - 1; i >= position; i--) {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[position] = element;
        this.count++;
    }

    private void increaseCapacity() {
        T[] newElements = (T[]) new Object[this.elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            // Populating new array with old items
            newElements[i] = this.elements[i];
        }
        this.elements = newElements;
    }

    public int getCount() {
        return this.count;
    }

    public int getLength() {
        return this.elements.length;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.count - 1; i++) {
            s.append(this.elements[i]);
            s.append(", ");
        }

        if (this.count > 0) {
            s.append(this.elements[this.count - 1]);
        }

        s.append("]");

        return s.toString();
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public void remove(int position) {
        if (!(position >= 0 && position < count)) {
            throw new IllegalArgumentException("Invalid position");
        }
        for (int i = position; i < count - 1; i++) {
            elements[i] = elements[i + 1];
        }
        count--;
    }
}
