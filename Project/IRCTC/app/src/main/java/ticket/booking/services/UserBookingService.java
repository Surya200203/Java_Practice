package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.BooleanNode;
import ticket.booking.entities.User;
import ticket.booking.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserBookingService {

    private User user;

    private List<User> userList;

    private static final String USERS_PATH = "app/src/main/java/ticket.booking/localDB/users.json";

    private ObjectMapper objectMapper = new ObjectMapper();


    public List<User> loadUsers() throws IOException {
        File users = new File(USERS_PATH);

        // deserialization
        return objectMapper.readValue(users, new TypeReference<List<User>>() {
        });

    }





    public UserBookingService() throws IOException{
        loadUsers();
    }

    public UserBookingService(User user) throws IOException {
        this.user = user;

       loadUsers();
    }

    // Login
    public Boolean loginUser(){
        Optional<User> foundUser = userList.stream().filter(user1 -> {
            return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(),user1.getHashedPassword());
        }).findFirst();
        return foundUser.isPresent();
    }

    // Signup
    public Boolean signUp(User user1){
        try{
            userList.add(user1);
            saveUserListToFile();
            return Boolean.TRUE;
        }catch (IOException e){
            return Boolean.FALSE;
        }
    }

    public void saveUserListToFile() throws IOException{
        File userFile = new File(USERS_PATH);
        objectMapper.writeValue(userFile,userList);     // serialization
    }

    // fetch Booking
    public void fetchBooking(){
        user.printTickets();
    }

    //cancel Booking
    public Boolean cancelBooking(String ticketId){
        user.cancelTicket(ticketId);

        return Boolean.FALSE;
    }



}
