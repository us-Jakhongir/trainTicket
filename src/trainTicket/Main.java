package trainTicket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner;
    static String stantsiya;
    static User[] users = new User[2];
    static Train[] trains = new Train[3];
    static Ticket[] tickets = new Ticket[3];
    static TrainSchedule[] trainSchedules = new TrainSchedule[3];
    static Order[] orders = new Order[3];
    static Boolean boughtTicket = false;
    static String loginUser;
    static int count = 0;
    static int orId = 1;
    static int indexOrder = 0;
    static int countTick;
    static Ticket ticket;
    static Train train;
    static Order order;
    static int passengerSeat = 0;

    public static void main(String[] args) {

        users[0] = new User(1, "vali@gmail.com", "Vali", "Valiyev",
                "123", "Passport", "123123");
        users[1] = new User(2, "ali@gmail.com", "Ali", "Aliyev",
                "123", "Passport", "123");


        List<Seat> seatList = new ArrayList<>();
        seatList.add(new Seat(1L, "M1", "Pastki", true));
        seatList.add(new Seat(2L, "M2", "Yuqori", true));
        seatList.add(new Seat(3L, "M3", "Bakavoy past", true));
        seatList.add(new Seat(4L, "M4", "Bakavoy past", true));
        seatList.add(new Seat(5L, "M5", "Pastki",true));
        trains[0] = new Train("1010", seatList);

        seatList = new ArrayList<>();
        seatList.add(new Seat(1L, "M1", "Pastki", true));
        seatList.add(new Seat(2L, "M2", "Yuqori", true));
        seatList.add(new Seat(3L, "M3", "Bakavoy past", true));
        seatList.add(new Seat(4L, "M4", "Bakavoy past", true));
        seatList.add(new Seat(5L, "M5", "Pastki", true));
        trains[1] = new Train("2020", seatList);

        seatList = new ArrayList<>();
        seatList.add(new Seat(1L, "M1", "Pastki", true));
        seatList.add(new Seat(2L, "M2", "Yuqori", true));
        seatList.add(new Seat(3L, "M3", "Bakavoy past", true));
        seatList.add(new Seat(4L, "M4", "Bakavoy past", true));
        seatList.add(new Seat(5L, "M5", "Pastki", true));
        trains[2] = new Train("3030", seatList);

        tickets[0] = new Ticket(1, 120, "Samarkand", "Tashkent", 1, 120000.0, trains[1]);
        tickets[1] = new Ticket(2, 280, "Tashkent", "Nukus", 2, 200000.0, trains[0]);
        tickets[2] = new Ticket(3, 180, "Khiva station", "Samarkand", 3, 150000.0, trains[2]);

        trainSchedules[0] = new TrainSchedule(tickets[0].getTrain(), "Samarkand", "Tashkent", 120);
        trainSchedules[1] = new TrainSchedule(tickets[1].getTrain(), "Tashkent", "Nukus", 280);
        trainSchedules[2] = new TrainSchedule(tickets[2].getTrain(), "Khiva", "Samarkand", 180);


        logIn();

        while (true) {
            scanner = new Scanner(System.in);

            chooseOperation();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    trainSchedule();
                    break;

                case 2:
                    buyTicket();
                    break;

                case 3:
                    myOrders();
                    break;

                case 4:
                    personalData();
                    break;

                case 5:
                    logOut();
                    return;
            }

        }
    }

    private static void logIn() {

        scanner = new Scanner(System.in);
        System.out.print("Please enter your login: ");
        loginUser = scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.print("Please enter your password: ");
        String passwordUser = scanner.nextLine();

        while (true) {

            for (User user : users) {
                if (user != null && user.getLogin().equals(loginUser) && user.getPassword().equals(passwordUser)) {
                    System.out.println();
                    System.out.println(user.getFirstName() + " " + user.getLastName() + ", Welcome to E-ticket system!" + "\n");
                    return;
                }
            }
        }
    }


    private static void showCities() {

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        System.out.println("Shahrni tanlang: ");

        System.out.println("Samarqand");
        System.out.println("Termiz");
        System.out.println("Xiva");

        switch (choice) {
            case 1:
                samarqand();
                break;

            case 2:
                termiz();
                break;

            case 3:
                xiva();
                break;


        }
    }

    private static void xiva() {

    }

    private static void termiz() {

    }

    private static void samarqand() {

    }


    private static void chooseOperation() {
        System.out.println("Choose the operation: ");
        System.out.println("--------------------------------");

        System.out.println("1. Train Schedule");
        System.out.println("2. Buy ticket");
        System.out.println("3. My orders");
        System.out.println("4. Personal data");
        System.out.println("5. Log out");
        System.out.println("--------------------------------");


    }

    private static void logOut() {

    }

    private static void personalData() {
        System.out.println("Your data: ");
        System.out.println("--------------------------------");
        for (User user : users) {
            if (user != null && user.getLogin().equals(loginUser)) {
                System.out.println(user);
            }
        }

    }


    private static void myOrders() {

        for (Order o : orders) {
            if (o != null) {
                if (o.getUser().getLogin().equals(loginUser))
                    System.out.println(o);
                    System.out.println("Your number of seat: " + passengerSeat);
                System.out.println("-------------------------------- \n");

            }
        }



        /*for (User user : users) {
            if (successBuy && user.getLogin().equals(loginUser)) {
                for (Ticket ticket : tickets) {
                    for (Order order : orders) {
                        if (order == null) {
                            Order ordered = new Order(orId++, user, ticket);

                            System.out.println(ordered);
                            System.out.println("--------------------------------");
                            break;
                        }
                    }
                    break;
                }
                break;
            } else {
                System.out.println("You have not a ticket.");
                System.out.println("--------------------------------");
                break;
            }
        }*/

    }

    private static void buyTicket() {
        System.out.println("Write the station:    (for example: Tashkent station.)");


        scanner = new Scanner(System.in);
        System.out.print("From: ");
        String fromStation = scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.print("To: ");
        String toStation = scanner.nextLine();


        for (Ticket ticket : tickets) {
            if (ticket != null && ticket.getDeparturesStation().equals(fromStation) && ticket.getDestinationStation().equals(toStation)) {
                System.out.println("--------------------------------");
                System.out.println("From: " + ticket.getDeparturesStation() + "     |     " + "To: " + ticket.getDestinationStation());
                System.out.println("price: " + ticket.getPrice() + "     |     " + "class category: " + ticket.getClassCategory());
                System.out.println("free seat(s): " + ticket.getTrain().getSeatList());
                System.out.println("--------------------------------");
                byTicket(ticket);
                break;
            }
        }

    }

    private static void byTicket(Ticket ticket) {
        System.out.println("Do you want to buy? ");
        System.out.println("Yes" + "  |  " + "No");
        String choice = scanner.nextLine();
        switch (choice) {
            case "y":
                buy(ticket);
                break;
            case "n":
                no();
                chooseOperation();
                return;

        }

    }

    private static void no() {

    }

    static boolean successBuy = false;
    static int orderId = 0;


    private static void buy(Ticket ticket) {
        System.out.println("Nechta chipta harid qilasiz? ");
        int numberTickets = scanner.nextInt();

        numberOfSeat();

        if(ticket.getTicketCount() >= numberTickets) {
           countTick =  ticket.getTicketCount() - numberTickets;
            ticket.setTicketCount(countTick);

            User currentUser = null;
            for (User u : users) {
                if (u != null && u.getLogin().equals(loginUser))
                    currentUser = u;
            }


            orders[indexOrder++] = new Order(orId++, currentUser, ticket);
            System.out.println("You bought " + numberTickets + " number(s) ticket.");
            System.out.println("--------------------------------");
        } else {
            System.out.println("Sorry, ticket not enough such count");
        }

    }

    private static void numberOfSeat() {
        Seat seat = new Seat();
        System.out.println("Joy raqamini tanlang (M1): ");
        int numberOfSeat = scanner.nextInt();
        if (seat.isActive()) {
            for (Train train : trains) {
                if (train.getSeatList() != null && train.getSeatList().equals(numberOfSeat)) {
                    passengerSeat = numberOfSeat;
                    seat.setActive(false);

                }
            }
        }
    }

    private static void trainSchedule() {
        scanner = new Scanner(System.in);

        System.out.println("Please write the Station: ");
        String station = scanner.nextLine();
        stantsiya = station;

        for (TrainSchedule trainSchedule : trainSchedules) {
            if (trainSchedule != null && trainSchedule.getFrom().equals(stantsiya))
                chooseOpr();

        }
    }


    private static void chooseOpr() {
        System.out.println("Choose operation: ");

        while (true) {
            System.out.println("1 - Arrival");
            System.out.println("2 - Departure");
            System.out.println("3 - Exit");


            scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    arrival();
                    break;

                case 2:
                    departure();
                    break;

                case 3:
                    exitChoose();
                    return;
            }
        }
    }

    private static void exitChoose() {

    }

    private static void arrival() {
        System.out.println("Arrival: ");
        System.out.println("--------------------------------");

        for (TrainSchedule trainSchedule : trainSchedules) {
            if (trainSchedule != null && trainSchedule.getTo().equals(stantsiya)) {
                System.out.println(trainSchedule.getTrain().getTrainNo() + "   " + trainSchedule.getFrom() + "   " + trainSchedule.getTo());

            }
        }
        System.out.println("--------------------------------");

    }


    private static void departure() {
        System.out.println("Departure: ");
        System.out.println("--------------------------------");

       /* for (TrainSchedule trainSchedule : trainSchedules) {
            if (trainSchedule != null && trainSchedule.getFrom().equals(stantsiya)) {
                trainSchedule.getTrain().setSeatList();
                System.out.println(trainSchedule.getTrain().getTrainNo() + "  |  " + trainSchedule.getFrom() + "  |  " + trainSchedule.getTo() + "  |  " + "count free seat(s): "  + trainSchedule.getTrain().getSeatCount());
            }
        }
        System.out.println("--------------------------------");*/
    }

}
