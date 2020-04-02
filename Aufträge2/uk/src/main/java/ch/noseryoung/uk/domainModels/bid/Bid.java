package ch.noseryoung.uk.domainModels.bid;


import ch.noseryoung.uk.domainModels.auction.Auction;
import ch.noseryoung.uk.domainModels.user.User;

import javax.persistence.*;

@Entity

@Table(name = "bid")
public class Bid {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(nullable = false)
    private int amount;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="auction_id")
    private Auction auction;

    public Bid() {}

    public int getId() {
        return id;
    }

    public Bid setId(int id) {
        this.id = id;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public Bid setAmount(int amount) {
        this.amount = amount;
        return this;
    }
}
