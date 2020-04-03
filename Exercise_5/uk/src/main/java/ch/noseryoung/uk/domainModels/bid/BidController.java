package ch.noseryoung.uk.domainModels.bid;

import ch.noseryoung.uk.domainModels.bid.Bid;
import ch.noseryoung.uk.domainModels.bid.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// This is an example controller with CRUD logic
@RestController
@RequestMapping("/bids")
public class BidController {

    // The newly created service to be injected
    private BidService bidService;

    // Injecting the dependency via constructor
    @Autowired
    public BidController(BidService bidService) {
        this.bidService = bidService;
    }

    // This endpoint creates a new bid with the data given
    @PostMapping({"/", ""})
    public ResponseEntity<Bid> create(@RequestBody Bid bid) {
        return new ResponseEntity<>(bidService.create(bid), HttpStatus.CREATED);
    }

    // This endpoint retrieves all authorities as a list
    @GetMapping({"/", ""})
    public ResponseEntity<List<Bid>> getAll() {

        return new ResponseEntity<>(bidService.findAll(), HttpStatus.OK);
    }

    // This endpoint retrieves a single bid by it's id
    @GetMapping("/{id}")
    public ResponseEntity<Bid> getById(@PathVariable int id) {
        return new ResponseEntity<>(bidService.findById(id), HttpStatus.OK);
    }

    // This endpoint updates an existing bid with the id and data given
    @PutMapping("/{id}")
    public ResponseEntity<Bid> updateById(@PathVariable int id, @RequestBody Bid bid) {
        return new ResponseEntity<>(bidService.updateById(id, bid), HttpStatus.OK);
    }

    // This endpoint deletes an existing bid with the id given
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id) {
        bidService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}