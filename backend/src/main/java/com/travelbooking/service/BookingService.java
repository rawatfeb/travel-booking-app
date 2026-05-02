package com.travelbooking.service;

import com.travelbooking.entity.Booking;
import com.travelbooking.entity.BookingStatus;
import com.travelbooking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking createBooking(Booking booking) {
        booking.setRequestedAt(LocalDateTime.now());
        booking.setStatus(BookingStatus.PENDING);
        return bookingRepository.save(booking);
    }

    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found with id: " + id));
    }

    public List<Booking> getUserBookings(Long userId) {
        return bookingRepository.findByUserIdOrderByCreatedAtDesc(userId);
    }

    public List<Booking> getDriverBookings(Long driverId) {
        return bookingRepository.findByDriverIdOrderByCreatedAtDesc(driverId);
    }

    public List<Booking> getBookingsByStatus(BookingStatus status) {
        return bookingRepository.findByStatus(status);
    }

    public Booking acceptBooking(Long bookingId, Long driverId) {
        Booking booking = getBookingById(bookingId);
        booking.setStatus(BookingStatus.ACCEPTED);
        booking.setAcceptedAt(LocalDateTime.now());
        booking.setUpdatedAt(LocalDateTime.now());
        return bookingRepository.save(booking);
    }

    public Booking pickupPassenger(Long bookingId) {
        Booking booking = getBookingById(bookingId);
        booking.setStatus(BookingStatus.PICKED_UP);
        booking.setPickedUpAt(LocalDateTime.now());
        booking.setUpdatedAt(LocalDateTime.now());
        return bookingRepository.save(booking);
    }

    public Booking completeBooking(Long bookingId, Double actualFare) {
        Booking booking = getBookingById(bookingId);
        booking.setStatus(BookingStatus.COMPLETED);
        booking.setCompletedAt(LocalDateTime.now());
        booking.setActualFare(actualFare);
        booking.setUpdatedAt(LocalDateTime.now());
        return bookingRepository.save(booking);
    }

    public Booking cancelBooking(Long bookingId, String reason) {
        Booking booking = getBookingById(bookingId);
        booking.setStatus(BookingStatus.CANCELLED);
        booking.setCancelledAt(LocalDateTime.now());
        booking.setCancellationReason(reason);
        booking.setUpdatedAt(LocalDateTime.now());
        return bookingRepository.save(booking);
    }

    public List<Booking> getBookingsByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return bookingRepository.findByCreatedAtBetween(startDate, endDate);
    }
}