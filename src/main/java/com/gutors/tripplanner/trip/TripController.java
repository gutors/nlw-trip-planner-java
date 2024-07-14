package com.gutors.tripplanner.trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gutors.tripplanner.participant.ParticipantService;

@RestController
@RequestMapping("/trips")
public class TripController {
    
    @Autowired
    private TripRepository repository;

    @Autowired
    private ParticipantService participantService;

    @PostMapping
    public ResponseEntity<TripCreateResponse> createTrip(TripRequestPayload payload) {
        Trip trip = new Trip(payload);

        repository.save(trip);

        participantService.registerParticipantsToTrip();

        return ResponseEntity.ok(new TripCreateResponse(trip.getId()));
    }

}
