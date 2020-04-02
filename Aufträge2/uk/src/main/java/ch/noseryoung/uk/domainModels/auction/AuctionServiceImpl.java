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

    @Override
    public Auction create(Auction auction) {
        return auctionRepository.save(auction);
    }

    @Override
    public List<Auction> findAll() {
        return auctionRepository.findAll();
    }

    @Override
    public Auction findById(int id) {
        return auctionRepository.findById(id).get();
    }

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

    @Override
    public void deleteById(int id) {
        auctionRepository.deleteById(id);
    }
}
