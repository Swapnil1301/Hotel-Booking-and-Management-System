package com.swapnil.Shotel.service.interfac;

import com.swapnil.Shotel.dto.Response;

import com.swapnil.Shotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
