package ch.noseryoung.uk.domainModels.bid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;

// This is an example service implementation with coded out CRUD logic
// Note that the @Service annotation belongs on here as the effective logic is found here
@Service
public class BidServiceImpl implements BidService {

    private BidRepository bidRepository;

    @Autowired
    public BidServiceImpl(BidRepository bidRepository) {
        this.bidRepository = bidRepository;
    }

    // The logic for creating a new bid
    @Override
    public Bid create(Bid bid) {
        return bidRepository.save(bid);
    }

    // The logic for retrieving all authorities
    @Override
    public List<Bid> findAll() {
        return bidRepository.findAll();
    }

    // The logic for retrieving a single bid with a given id
    @Override
    public Bid findById(int id) {
        return bidRepository.findById(id).get();
    }

    // The logic for updating an existing bid with a given id and data
    @Override
    public Bid updateById(int id, Bid bid) {
        if(bidRepository.existsById(id)) {
            bid.setId(id);
            bidRepository.save(bid);

            return bid;
        } else {
            throw new NoSuchElementException("No value present");
        }
    }

    // The logic for deleting an bid with a given id
    @Override
    public void deleteById(int id) {
        bidRepository.deleteById(id);
    }
}

