package ch.noseryoung.uk.domainModels.auction;

import ch.noseryoung.uk.domainModels.auction.Auction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctionRepository extends JpaRepository<Auction, Integer> {

}
