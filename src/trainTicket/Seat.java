package trainTicket;

public class Seat {

    private Long id;
    private String number;
    private String description;

    /**
     *  false -   sotilgan bo'lsa
     */
    private boolean active;

    public Seat(Long id, String number, String description, boolean active) {
        this.id = id;
        this.number = number;
        this.description = description;
        this.active = active;
    }

    public Seat() {

    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
