package com.example.mybatis_plus_generator.service.impl;

import com.example.mybatis_plus_generator.entity.User;
import com.example.mybatis_plus_generator.mapper.UserMapper;
import com.example.mybatis_plus_generator.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jie7968
 * @since 2019-07-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
