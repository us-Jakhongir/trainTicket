package trainTicket;

import java.util.List;

public class Train {

    protected String trainNo;
    //protected int seatCount;
    protected List<Seat> seatList;


    public Train(String trainNo, List<Seat> seatList) {
        this.trainNo = trainNo;
        this.seatList = seatList;
    }
    Train() {

    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    @Override
    public String toString() {
        return  "train number: " + trainNo;
    }
}
