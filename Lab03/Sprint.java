import java.util.ArrayList;
import java.util.List;

public class Sprint {
    private final int timeCapacity;
    private final int ticketLimit;
    private final List<Ticket> tickets;

    public Sprint(int timeCapacity, int ticketLimit) {
        this.timeCapacity = timeCapacity;
        this.ticketLimit = ticketLimit;
        this.tickets = new ArrayList<>();
    }

    public boolean addUserStory(UserStory userStory) {
        return addTicket(userStory);
    }

    public boolean addBug(Bug bugReport) {
        return addTicket(bugReport);
    }

    private boolean addTicket(Ticket ticket) {
        if (ticket == null || ticket.isCompleted()) return false;
        if (tickets.size() >= ticketLimit) return false;
        if (getTotalEstimate() + ticket.getEstimate() > timeCapacity) return false;
        tickets.add(ticket);
        return true;
    }

    public Ticket[] getTickets() {
        return tickets.toArray(new Ticket[0]);
    }

    public int getTotalEstimate() {
        int total = 0;
        for (Ticket t : tickets) {
            total += t.getEstimate();
        }
        return total;
    }
}
