package com.codeclan.example.courseLab.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "town")
    private String town;

    @Column(name = "starRating")
    private String starRating;

//    @JsonIgnore
//    @OneToMany(mappedBy = "courses", fetch = FetchType.LAZY)
//    private List<Booking> bookings;
////    getters and setters

    public Course(String name, String town, String starRating){
        this.name = name;
        this.town = town;
        this.starRating = starRating;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
    }

    public Course(){}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public String getStarRating() {
        return starRating;
    }
}
