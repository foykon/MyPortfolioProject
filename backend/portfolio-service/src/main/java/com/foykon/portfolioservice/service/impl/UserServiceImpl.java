package com.foykon.portfolioservice.service.impl;

import com.foykon.portfolioservice.repository.UserProfileRepository;
import com.foykon.portfolioservice.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserProfileRepository userProfileRepository;



}
