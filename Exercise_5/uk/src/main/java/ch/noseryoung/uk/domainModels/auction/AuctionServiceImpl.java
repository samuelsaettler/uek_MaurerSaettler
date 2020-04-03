package ch.noseryoung.uk.domainModels.auction;

import ch.noseryoung.uk.domainModels.auction.Auction;
import ch.noseryoung.uk.domainModels.auction.AuctionRepository;
import ch.noseryoung.uk.domainModels.auction.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;

// This is an example service implementation with coded out CRUD logic
// Note that the @Service annotation belongs on here as the effective logic is found here
@Service
public class AuctionServiceImpl implements AuctionService {

    private AuctionRepository auctionRepository;

    @Autowired
    public AuctionServiceImpl(AuctionRepository auctionRepository) {
        this.auctionRepository = auctionRepository;
    }

    // The logic for creating a new auction
    @Override
    public Auction create(Auction auction) {
        return auctionRepository.save(auction);
    }

    // The logic for retrieving all authorities
    @Override
    public List<Auction> findAll() {
        return auctionRepository.findAll();
    }

    // The logic for retrieving a single auction with a given id
    @Override
    public Auction findById(int id) {
        return auctionRepository.findById(id).get();
    }

    // The logic for updating an existing auction with a given id and data
    @Override
    public Auction updateById(int id, Auction auction) {
        if(auctionRepository.existsById(id)) {
            auction.setId(id);
            auctionRepository.save(auction);

            return auction;
        } else {
            throw new NoSuchElementException("No value present");
        }
    }

    // The logic for deleting an auction with a given id
    @Override
    public void deleteById(int id) {
        auctionRepository.deleteById(id);
    }
}
