package com.lcwd.rating.controller;

import com.lcwd.rating.entities.Rating;
import com.lcwd.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingService ratingService;
    //create Rating
    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating)
    {
        return  ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }
    //get all
    @GetMapping
    public ResponseEntity<List<Rating>>getRatings()
    {
        return ResponseEntity.ok(ratingService.getRatings());
    }
    //get userid
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId)
    {
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }
    //get hotel id
    @GetMapping("/hotels/{id}")
    public ResponseEntity<List<Rating>> getRatingByid(@PathVariable String id)
    {
        return ResponseEntity.ok(ratingService.getRatingByid(id));
    }
    @DeleteMapping("rating/{id}")
    public String delete(@PathVariable  String id)

    {
      ratingService.deleteByid(id);
        return "this "+id+"deleted";
    }

}
