package com.codeclan.example.courseLab.repositories.BookingRepository;

import com.codeclan.example.courseLab.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    List<Booking> findBookingByDate(String date);

}
