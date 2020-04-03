package ch.noseryoung.uk.domainModels.auction.dto;

import ch.noseryoung.uk.domainModels.bid.Bid;
import ch.noseryoung.uk.domainModels.user.User;

import java.util.List;

public class AuctionDTO {

    private int id;

    private String description;

    private float fixed_price;

    private float starting_price;

    private boolean is_public;

    private List<Bid> bids;

    private List<User> users;

    public AuctionDTO() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getFixed_price() {
        return fixed_price;
    }

    public void setFixed_price(float fixed_price) {
        this.fixed_price = fixed_price;
    }

    public float getStarting_price() {
        return starting_price;
    }

    public void setStarting_price(float starting_price) {
        this.starting_price = starting_price;
    }

    public boolean isIs_public() {
        return is_public;
    }

    public void setIs_public(boolean is_public) {
        this.is_public = is_public;
    }
}
