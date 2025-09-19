package challenge;

// FIFO - First In First Out
public class BloodCollectionQueue extends CustomQueue<People> {
    private int countPreferential;

    public BloodCollectionQueue() {
    }

    public BloodCollectionQueue(int capacity) {
        super(capacity);
    }

    public int getCountPreferential() {
        return countPreferential;
    }

    // Resolution of the challenge
    @Override
    public People dequeue() {
        if (this.isEmpty())
            return null;
        final int FRONT_POSITION = 0;
        People frontPerson = this.elements[FRONT_POSITION];
        if (countPreferential == 3) {
            // Case 1 - Zere o contador e no lugar dessa pessoa preferencial vai passar uma normal | Case um pouco mais complexo:
            // Aqui vou ter que fazer uma especie de lopping para verificação para identificação de uma pessoa normal
            // Caso não haja pessoa normal, a pessoa atual e preferencial passará na fila
            int indexUntilNormalPerson = FRONT_POSITION + 1;
            while(true) {
                People nextPerson = this.elements[indexUntilNormalPerson];
                if(!nextPerson.isPreferential()) {
                    this.remove(indexUntilNormalPerson);
                    return nextPerson;
                } else indexUntilNormalPerson++;
            }
        }
        //  Case 2 - Se caso for preferencial, chame ela primeiro, e incremente o contador | Ou Seja, é somente para incrementar o preferencial
        if (frontPerson.isPreferential()) {
            countPreferential++;
            this.remove(FRONT_POSITION);
            return frontPerson;
        }
        // Case 3 - caso não esteja ninguem na fila preferencial com o contador prerencial < 3, vai chamar o user commom
        this.remove(FRONT_POSITION);
        return frontPerson;
    }
}
