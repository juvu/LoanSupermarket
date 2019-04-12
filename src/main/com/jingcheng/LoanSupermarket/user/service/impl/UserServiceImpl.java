package jingcheng.LoanSupermarket.user.service.impl;

import jingcheng.LoanSupermarket.user.dao.UserDao;
import jingcheng.LoanSupermarket.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public int userNum() {
        return userDao.userNum();
    }

}