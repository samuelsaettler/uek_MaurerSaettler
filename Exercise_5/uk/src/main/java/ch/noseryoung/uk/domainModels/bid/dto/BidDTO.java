package ch.noseryoung.uk.domainModels.bid.dto;

import ch.noseryoung.uk.domainModels.user.User;

import java.util.List;

public class BidDTO {

    private int id;

    private float amount;

    private List<User> users;

    public BidDTO() {
    }

    public int getId() {
        return id;
    }

    public BidDTO setId(int id) {
        this.id = id;
        return this;
    }

    public float getAmount() {
        return amount;
    }

    public BidDTO setAmount(float amount) {
        this.amount = amount;
        return this;
    }

    public List<User> getUsers() {
        return users;
    }

    public BidDTO setUsers(List<User> users) {
        this.users = users;
        return this;
    }
}
