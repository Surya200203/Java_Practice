package ticket.booking.entities;

import java.util.List;
import java.util.Objects;

public class User {

    private String name;
    private String password;
    private String hashedPassword;
    private String userId;
    private List<Ticket> ticketsBooked;


    public User(String name,String password, String hashedPassword,String userId,List<Ticket> ticketsBooked){
        this.name = name;
        this.password = password;
        this.hashedPassword = hashedPassword;
        this.userId = userId;
        this.ticketsBooked = ticketsBooked;
    }

    public User(){}

    public String getName(){
        return name;
    }

    public String getUserId(){
        return userId;
    }

    public String getHashedPassword(){
        return hashedPassword;
    }

    public List<Ticket> getTicketsBooked(){
        return ticketsBooked;
    }

    //setters

    public void setName(String name){
        this.name = name;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public void setHashedPassword(String hashedPassword){
        this.hashedPassword = hashedPassword;
    }

    public void setTicketsBooked(List<Ticket> ticketsBooked){
        this.ticketsBooked = ticketsBooked;
    }


    // Print Tickets

    public void printTickets(){
        for (Ticket ticket : ticketsBooked) {
            System.out.println(ticket.getTicketInfo());
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void cancelTicket(String ticketId){
        ticketsBooked.removeIf(ticket -> ticket.getTicketId().equals(ticketId));

    }
}







