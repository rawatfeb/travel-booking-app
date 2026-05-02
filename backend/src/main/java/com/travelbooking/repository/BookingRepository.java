package com.travelbooking.repository;

import com.travelbooking.entity.Booking;
import com.travelbooking.entity.BookingStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUserId(Long userId);
    List<Booking> findByDriverId(Long driverId);
    List<Booking> findByStatus(BookingStatus status);
    List<Booking> findByCreatedAtBetween(LocalDateTime startDate, LocalDateTime endDate);
    List<Booking> findByUserIdOrderByCreatedAtDesc(Long userId);
    List<Booking> findByDriverIdOrderByCreatedAtDesc(Long driverId);
}