
package com.ptteng.service.Impl;

import com.ptteng.dao.UserMapper;
import com.ptteng.entity.User;
import com.ptteng.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService, Serializable {
    @Autowired
    private UserMapper userMapper;
    private static Logger logger= Logger.getLogger(UserServiceImpl.class);

    @Override
    public List<User> getAll() throws RemoteException {

        List userList = this.userMapper.getAll();
        return userList;
    }



}

