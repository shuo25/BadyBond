package org.example.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.user.entity.User;
import org.example.user.mapper.UserMapper;
import org.example.user.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * Author: 18615
 * Date: 2024/3/18 20:37
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
