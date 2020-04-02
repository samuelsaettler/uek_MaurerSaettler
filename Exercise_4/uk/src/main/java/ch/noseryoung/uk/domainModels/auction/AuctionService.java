package ch.noseryoung.uk.domainModels.auction;

import ch.noseryoung.uk.domainModels.auction.Auction;

import java.util.List;

public interface AuctionService {

    Auction create(Auction auction);

    List<Auction> findAll();

    Auction findById(int id);

    Auction updateById(int id, Auction auction);

    void deleteById(int id);

}
