package challenge;

public class People {
    private final int ticket;
    private final boolean preferential;

    public People(int ticket, boolean preferential) {
        this.ticket = ticket;
        this.preferential = preferential;
    }

    public int getTicket() {
        return ticket;
    }

    public boolean isPreferential() {
        return preferential;
    }

    @Override
    public String toString() {
        return String.format("#%d%s", ticket, preferential ? " (P)" : " (N)");
    }
}
