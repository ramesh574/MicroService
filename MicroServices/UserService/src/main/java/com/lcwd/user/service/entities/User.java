package com.lcwd.user.service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="micro_user")
public class User {
  @Id
  @Column(name="ID")
    private String userId;
  @Column(length = 20)
    private String name;
    private String email;
    private String about;

    @Transient
    private List<Rating> ratings;

}
