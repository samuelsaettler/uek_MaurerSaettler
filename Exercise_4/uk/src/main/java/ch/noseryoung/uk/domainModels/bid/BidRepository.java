package ch.noseryoung.uk.domainModels.bid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This is an example repository with an example query
@Repository
public interface BidRepository extends JpaRepository<Bid, Integer> {

    // This is an example query, it isn't actually used
    // It exists to show the basic syntax of the generated queries
    public Bid findByName(String name);

}
