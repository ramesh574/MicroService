package com.lcwd.rating.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_rating")
@Entity
public class Rating {
    private String hotelId;
    private String userId;
    @Id
    private String id;
    private String feedback;
    private int rating;

}
