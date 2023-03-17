package uk.co.metadesignsolutions.javachallenge.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ArtistController {


    @PostMapping("/artist")
    public ResponseEntity<Void> create(){
        return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
