package org.craftedsw.tripservicekata.user;

import org.craftedsw.tripservicekata.trip.Trip;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

    private List<Trip> trips;
    private List<User> friends;
    private Trip trip;
    private User user;

    @BeforeEach
    public void initTrips() {
        System.out.println("init trips before each test");
        trips = new ArrayList<Trip>();
    }

    @AfterEach
    public void tripsNull() {
        System.out.println("trips null after each test");
        trips = null;
    }

    @BeforeEach
    public void initFriends() {
        System.out.println("init friends before each test");
        friends = new ArrayList<User>();
    }

    @AfterEach
    public void friendsNull() {
        System.out.println("friends null after each test");
        friends = null;
    }

    @BeforeEach
    public void initUser() {
        System.out.println("init user before each test");
        user = new User();
    }

    @AfterEach
    public void userNull() {
        System.out.println("user null after each test");
        user = null;
    }

    @BeforeEach
    public void initTrip() {
        System.out.println("init trip before each test");
        trip = new Trip();
    }

    @AfterEach
    public void tripNull() {
        System.out.println("trip null after each test");
        trip = null;
    }

    @Test
    public void getFriendsTest(){
        Assertions.assertEquals(user.getFriends(), friends);
    }

    @Test
    public void addFriendTest(){
        User friend = new User();
        user.addFriend(friend);
        int size = user.getFriends().size();
        Assertions.assertEquals(user.getFriends().get(size - 1), friend);
    }

    @Test
    public void addTripTest(){
        user.addTrip(trip);
        int size = user.trips().size();
        Assertions.assertEquals(user.trips().get(size - 1), trip);
    }

    @Test
    public void tripsTest(){
        Assertions.assertEquals(user.trips(), trips);
    }

}
