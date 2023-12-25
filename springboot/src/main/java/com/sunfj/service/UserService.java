package com.sunfj.service;

import com.sunfj.dao.UserMapper;
import com.sunfj.entity.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Getter
@Setter
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional(rollbackFor = Exception.class)
    public void isertUser(User user) {
        // 插入用户信息
        userMapper.insertUser(user);
    }

    public User getUser(Long id){
        return  userMapper.getUser(id);
    }

}
