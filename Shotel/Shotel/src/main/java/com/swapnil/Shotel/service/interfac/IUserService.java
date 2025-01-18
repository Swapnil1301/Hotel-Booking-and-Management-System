package com.swapnil.Shotel.service.interfac;

import com.swapnil.Shotel.dto.LoginRequest;

import com.swapnil.Shotel.dto.Response;
import com.swapnil.Shotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}