package org.hmily.blog.service.impl.user;

import org.hmily.blog.mapper.user.UserMapper;
import org.hmily.blog.domain.user.User;
import org.hmily.blog.service.user.UserService;
import org.hmily.blog.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/07.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}