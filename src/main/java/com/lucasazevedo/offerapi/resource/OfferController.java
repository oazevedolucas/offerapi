package com.lucasazevedo.offerapi.resource;

import com.lucasazevedo.offerapi.entity.Offer;
import com.lucasazevedo.offerapi.repository.OfferRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offers")
public class OfferController {

    @Autowired
    OfferRepository offerRepository;

    @GetMapping
    public List<Offer> getOffers() {
        return offerRepository.findAll();
    }

    @GetMapping("/{offerId}")
    public Offer getOfferById(
            @PathVariable("offerId") Long offerId
    ) {
        return offerRepository.findById(offerId).orElseThrow(
                EntityNotFoundException::new
        );
    }

    @PostMapping
    public ResponseEntity<Void> postOffer(@RequestBody Offer offer){
        offerRepository.save(offer);
        return ResponseEntity.status(201).build();
    }

    @PutMapping("/{offerId}")
    public ResponseEntity<Void> updateOfferById(@PathVariable("offerId") Long offerId, @RequestBody Offer offer){
        Offer offerDB = offerRepository.findById(offerId).orElseThrow(
                EntityNotFoundException::new
        );
        offerDB.setDescription(offer.getDescription());
        offerDB.setValue(offer.getValue());
        offerDB.setAmount(offer.getAmount());
        offerDB.setDateTime(offer.getDateTime());
        offerRepository.save(offerDB);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{offerId}")
    public ResponseEntity<Void> deleteOfferById(
            @PathVariable("offerId") Long offerId
    ){
        offerRepository.deleteById(offerId);
        return ResponseEntity.ok().build();
    }
}
