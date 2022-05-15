package trainTicket;

public class Order {

    int orderId;
    User user;
    Ticket ticket;

    public Order(int orderId, User user, Ticket ticket) {
        this.orderId = orderId;
        this.user = user;
        this.ticket = ticket;
    }

    public Order() {

    }



    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return  "orderId: " + orderId + "\n" + "user: " + user + "\n" + ticket;
    }
}
