package com.lcwd.rating.services;

import com.lcwd.rating.entities.Rating;

import java.util.List;

public interface RatingService {
    //create
    Rating create(Rating rating);

    //get all rating
    List<Rating> getRatings();
    //get all by userid
    List<Rating> getRatingByUserId(String userId);
    //get all by hotelId
    List<Rating> getRatingByid(String id);
    void deleteByid(String id);

}
