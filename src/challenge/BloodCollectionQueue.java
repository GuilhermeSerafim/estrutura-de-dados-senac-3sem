package challenge;

public class BloodCollectionQueue extends StaticStructure<People> {
    private int servedPreferentialInRow = 0;

    public BloodCollectionQueue() { super(); }
    public BloodCollectionQueue(int capacity) { super(capacity); }

    public void addNormal(People person) {
        if (person == null || person.isPreferential()) {
            throw new IllegalArgumentException("Expected a normal person");
        }
        add(person);
    }

    public void addPreferential(People person) {
        if (person == null || !person.isPreferential()) {
            throw new IllegalArgumentException("Expected a preferential person");
        }
        int lastPrefIndex = -1;
        for (int i = 0; i < count; i++) {
            People p = (People) elements[i];
            if (p.isPreferential()) lastPrefIndex = i;
        }
        int insertPos = lastPrefIndex + 1;
        insert(insertPos, person);
    }

    public People whoIsNext() {
        if (isEmpty()) return null;

        if (servedPreferentialInRow >= 3) {
            int normalIndex = indexOfFirstNormal();
            if (normalIndex != -1) {
                return (People) elements[normalIndex];
            }
        }
        return (People) elements[0];
    }

    public People callNext() {
        if (isEmpty()) return null;

        int removeIndex = 0;
        if (servedPreferentialInRow >= 3) {
            int normalIndex = indexOfFirstNormal();
            if (normalIndex != -1) {
                removeIndex = normalIndex;
                servedPreferentialInRow = 0;
            }
        }

        People served = removeAt(removeIndex);
        if (served.isPreferential()) {
            servedPreferentialInRow++;
        } else {
            servedPreferentialInRow = 0;
        }
        return served;
    }

    private int indexOfFirstNormal() {
        for (int i = 0; i < count; i++) {
            People p = (People) elements[i];
            if (!p.isPreferential()) return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < count; i++) {
            sb.append(((People) elements[i]).toString());
            if (i < count - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
