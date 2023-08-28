package com.lcwd.hotel.controller;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    //create
    @PostMapping
    public ResponseEntity<Hotel> createUser(@RequestBody Hotel hotel)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
    }

    //single user get
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getSingleUser(@PathVariable String id)
    {

        return ResponseEntity.ok(hotelService.get(id));
    }
    //all user get
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllUser()
    {
       // List<User> allUser = userService.getAllUser();
        return ResponseEntity.ok(hotelService.getAll());
    }
}
