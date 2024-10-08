package com.nxh.userservice.services;

import com.nxh.userservice.entities.UserVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class UserService {

    public UserVO save(UserVO userVO) {
        //simulate save operation;
        String userId = String.valueOf(new Date().getTime());
        userVO.setId(userId);
        userVO.setRole("USER");
        //save user
        return userVO;
    }

}
