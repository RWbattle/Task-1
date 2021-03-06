package com.ptteng.dao;

import com.ptteng.pojo.model.User;

public interface UserDao {
    //查询记录总条数
    public Integer selectCount();
    //根据id查询用户信息
    public User findById(Long id) throws Exception;
    //根据姓名模糊查询
    public User findByName(String name) throws Exception;
    //添加用户信息
    public boolean insertUser(User user) throws Exception;
    //删除用户信息
    public boolean deleteUser(Long id) throws Exception;
    //更新用户信息
    public boolean modifyLoginTime(User user) throws Exception;
}
