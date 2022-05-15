package trainTicket;

public class Ticket {

    protected int ticketNo;
    protected int ticketCount;
    protected String departuresStation;
    protected String destinationStation;
    protected int classCategory;
    protected double price;
    protected Train train;

    public Ticket(int ticketNo, int ticketCount, String departuresStation, String destinationStation, int classCategory, double price, Train train) {
        this.ticketNo = ticketNo;
        this.ticketCount = ticketCount;
        this.departuresStation = departuresStation;
        this.destinationStation = destinationStation;
        this.classCategory = classCategory;
        this.price = price;
        this.train = train;
    }

    public Ticket() {

    }

    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getDeparturesStation() {
        return departuresStation;
    }

    public void setDeparturesStation(String departuresStation) {
        this.departuresStation = departuresStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public int getClassCategory() {
        return classCategory;
    }

    public void setClassCategory(int classCategory) {
        this.classCategory = classCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    @Override
    public String toString() {
        System.out.println("--------------------------------");
        return "ticketNo: " + ticketNo + "\n" +
                "departures station: " + departuresStation + "\n" +
                "destination station: " + destinationStation + "\n" +
                "class category: " + classCategory + "\n" +
                "price: " + price + "\n" +
                train;

    }
}
