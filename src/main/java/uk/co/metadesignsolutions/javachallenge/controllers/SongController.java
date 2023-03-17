package uk.co.metadesignsolutions.javachallenge.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SongController {


    @PostMapping("/song")
    public ResponseEntity<Void> create()  {
        return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/song/{songId}/similar")
    public ResponseEntity<Void> similarSongs() {
        return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/song/{songId}/listen")
    public ResponseEntity<Void>  listen(){
        return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/song/trending")
    public ResponseEntity<Void> trendingSongs(){
        return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @PostMapping("/song/search")
    public ResponseEntity<Void> search(){
        return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
