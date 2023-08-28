package com.lcwd.rating.services.impl;

import com.lcwd.rating.entities.Rating;
import com.lcwd.rating.repository.RatingRepository;
import com.lcwd.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepository respository;
    @Override
    public Rating create(Rating rating) {
        return respository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return respository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return respository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByid(String id) {
        return respository.findByid(id);
    }

    @Override
    public void deleteByid(String id) {
        respository.deleteById(id);

    }


}
