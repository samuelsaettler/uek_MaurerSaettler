package ch.noseryoung.uk.domainModels.auction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// This is an example controller with CRUD logic
@RestController
@RequestMapping("/auctions")
public class AuctionController {

    // The newly created service to be injected
    private AuctionService auctionService;

    // Injecting the dependency via constructor
    @Autowired
    public AuctionController(AuctionService auctionService) {
        this.auctionService = auctionService;
    }

    // This endpoint creates a new auction with the data given
    @PostMapping({"/", ""})
    public ResponseEntity<Auction> create(@RequestBody Auction auction) {
        return new ResponseEntity<>(auctionService.create(auction), HttpStatus.CREATED);
    }

    // This endpoint retrieves all authorities as a list
    @GetMapping({"/", ""})
    public ResponseEntity<List<Auction>> getAll() {

        return new ResponseEntity<>(auctionService.findAll(), HttpStatus.OK);
    }

    // This endpoint retrieves a single auction by it's id
    @GetMapping("/{id}")
    public ResponseEntity<Auction> getById(@PathVariable int id) {
        return new ResponseEntity<>(auctionService.findById(id), HttpStatus.OK);
    }

    // This endpoint updates an existing auction with the id and data given
    @PutMapping("/{id}")
    public ResponseEntity<Auction> updateById(@PathVariable int id, @RequestBody Auction auction) {
        return new ResponseEntity<>(auctionService.updateById(id, auction), HttpStatus.OK);
    }

    // This endpoint deletes an existing auction with the id given
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id) {
        auctionService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
